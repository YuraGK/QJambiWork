package TXTed;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.trolltech.qt.core.QDir;
import com.trolltech.qt.core.QModelIndex;
import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QFileSystemModel;
import com.trolltech.qt.gui.QWidget;


public class TXTEditor extends QWidget{
	
	Ui_Text ui = new Ui_Text();
	Ui_QFiles fileExpUi = new Ui_QFiles();
	QFileSystemModel dirSystemModel = new QFileSystemModel(this);
	QFileSystemModel fileSystemModel = new QFileSystemModel(this);
	File chosenFile = null;
	
	public static void main(String[] args) {
		QApplication.initialize(args);
		TXTEditor txteditor = new TXTEditor();
		
		
		
		
		QApplication.exec();
	}
	
	public TXTEditor() {
		ui.setupUi(this);
		
		
		
		
		//fileSystemModel.setFilter(QDir::NoDotAndNoDotDot);
		ui.pushButton.clicked.connect(this,"openDialog()");
		ui.pushButton_2.clicked.connect(this,"saveFile()");
		
		show();
	}
	
	public void openDialog() {
		QWidget secondWindow = new QWidget();
		
		fileExpUi.setupUi(secondWindow);
		
		dirSystemModel.setRootPath("C:/");
		dirSystemModel.setFilter(QDir.Filter.AllDirs);
		
		fileSystemModel.setRootPath("C:/");
		fileSystemModel.setFilter(QDir.Filter.Files);
		
		fileExpUi.treeView.setModel(dirSystemModel);
		fileExpUi.listView.setModel(fileSystemModel);
		fileExpUi.treeView.clicked.connect(this,"showFilesInDir(com.trolltech.qt.core.QModelIndex)");
		fileExpUi.listView.doubleClicked.connect(this,"readFile(com.trolltech.qt.core.QModelIndex)");
		secondWindow.show();
	}
	
	public void showFilesInDir(QModelIndex index) {
		
		fileExpUi.listView.setRootIndex(fileSystemModel.setRootPath(dirSystemModel.fileInfo(index).absoluteFilePath()));
	}
	
	
	public void readFile(QModelIndex index) {
		chosenFile = new File(dirSystemModel.fileInfo(index).absoluteFilePath());
		String temp = "";
		String result = "";
		
		try (BufferedReader reader = new BufferedReader(new FileReader(chosenFile))) {
			while ((temp = reader.readLine()) != null) {
				result+=temp+"\n";
			}
		}catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ui.textBrowser.setText(result);
	}
	
	public void saveFile() {
		
		String result = ui.textBrowser.toPlainText();
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(chosenFile))) {
			
			
			writer.write(result);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

}
