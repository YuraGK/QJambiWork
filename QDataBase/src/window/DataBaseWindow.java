package window;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QTableWidgetItem;
import com.trolltech.qt.gui.QWidget;





public class DataBaseWindow extends QWidget{
	
	private static File basicallyDatabase = null;
	Ui_QDataBase ui = new Ui_QDataBase();
	
	
	public static void main(String[] args){
		QApplication.initialize(args);
		basicallyDatabase = new File("basicallyDatabase.txt");
		try {
			basicallyDatabase.createNewFile();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DataBaseWindow dataBaseWindow = new DataBaseWindow();
		
		
		
		QApplication.exec();
	}
	
	public DataBaseWindow() {
		ui.setupUi(this);
		ui.pushButton.clicked.connect(this,"readDataBase()");
		ui.pushButton_2.clicked.connect(this,"saveDataBase()");
		
		ui.pushButton_3.clicked.connect(this,"addRow()");
		ui.pushButton_4.clicked.connect(this,"removeRow()");
		ui.pushButton_5.clicked.connect(this,"addColumn()");
		ui.pushButton_6.clicked.connect(this,"removeColumn()");
		show();
	}
	
	public void addRow() {
		int rows = ui.tableWidget.rowCount();
		ui.tableWidget.insertRow(rows);
	}
	
	public void removeRow() {
		int rows = ui.tableWidget.rowCount();
		ui.tableWidget.removeRow(rows-1);
	}

	public void addColumn() {
		int columns = ui.tableWidget.columnCount();
		ui.tableWidget.insertColumn(columns);
	}

	public void removeColumn() {
		int columns = ui.tableWidget.columnCount();
		ui.tableWidget.removeColumn(columns-1);
	}
	
	public void readDataBase() {
		
		String temp = "";
		String[] result = {};
		int j = 0;
	try (BufferedReader reader = new BufferedReader(new FileReader(basicallyDatabase))) {
		int rows = ui.tableWidget.rowCount();
		int columns = ui.tableWidget.columnCount();
		for(int i = 0; i<rows;i++) {
			removeRow();
		}
		for(int i = 0; i<columns;i++) {
			removeColumn();
		}
		
		boolean oneTime = true;
		while ((temp = reader.readLine()) != null) {
			if(oneTime) {
				for(int i = 0; i<temp.split(";").length;i++) {
					addColumn();
				}
				oneTime = false;
			}
			
			addRow();
			
			result = temp.split(" ;");
			for(int i = 0; i<result.length;i++) {
				QTableWidgetItem item = new QTableWidgetItem();
				item.setText(result[i]);
				ui.tableWidget.setItem(j, i, item);
			}
			j++;
			
		}
	
		
		
	
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	}
	
	public void saveDataBase() {
		StringBuilder  stringBuilder = new StringBuilder();
		
		int rows = ui.tableWidget.rowCount();
		int columns = ui.tableWidget.columnCount();
		
		for(int i = 0; i<rows;i++) {
			for(int j = 0; j<columns;j++) {
				try {
					stringBuilder.append(ui.tableWidget.item(i, j).text()+" ;");
				}catch(NullPointerException e) {
					stringBuilder.append(" ;");
				}
				
			}
			
			stringBuilder.append("\n");
		}
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(basicallyDatabase))) {
				writer.write(stringBuilder.toString());
		} catch (IOException e1) {
				e1.printStackTrace();
		}
		
	}
	
	
	
}
