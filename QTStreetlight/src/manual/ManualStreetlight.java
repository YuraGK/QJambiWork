package manual;

import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QWidget;

public class ManualStreetlight extends QWidget {

	Ui_streetlight_manual ui = new Ui_streetlight_manual();
	int i = 1;
	public static void main(String[] args){
		QApplication.initialize(args);
		
		ManualStreetlight manualStreetlight = new ManualStreetlight();
		
		QApplication.exec();
	}
	
	public ManualStreetlight() {
		ui.setupUi(this);
		
		ui.pushButton.clicked.connect(this, "setColor()");
		
		show();
	}
	
	public void setColor() {
		if(i==0) {
			ui.widget.setStyleSheet("background-color: rgb(255, 0, 4);");
			i = 1;
		}else {
			ui.widget.setStyleSheet("background-color: rgb(0, 255, 4);");
			i = 0;
		}
		
		
	}
	
	
}
