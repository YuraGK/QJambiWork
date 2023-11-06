package auto;



import com.trolltech.qt.core.QTimer;
import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QWidget;

public class AutoStreetlight extends QWidget {

	
	static Ui_streetlight_auto ui = new Ui_streetlight_auto();
	
	static int i = 1;
	
	public static void main(String[] args){
		
		QApplication.initialize(args);
		
		AutoStreetlight autoStreetlight = new AutoStreetlight();
		
		
		
		QApplication.exec();
		
		
	}
	
	public AutoStreetlight() {
		ui.setupUi(this);
		
		
		
		QTimer.singleShot(4000, this, "setColor()");
		
		
		
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
		QTimer.singleShot(4000, this, "setColor()");
		
	}
	
	
}
