package clock;




import java.sql.Time;

import com.trolltech.qt.core.QDateTime;
import com.trolltech.qt.core.QTimer;
import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QWidget;



public class AllInOne extends QWidget{

	Ui_Clock ui = new Ui_Clock();
	QDateTime qTimeClock = new QDateTime().fromString("00 : 00 : 00");
	Time qTimeStop = new Time(0, 0, 0);
	Time qTimeTimer = new Time(0, 0, 0);
	public boolean stop = false;
	
	public static void main(String[] args){
		QApplication.initialize(args);
		
		AllInOne allInOne = new AllInOne();
		
		
		
		QApplication.exec();
	}
	
	public AllInOne() {
		ui.setupUi(this);
		
		
		
		ui.lcdClock.connectSlotsByName();
		QTimer.singleShot(1000, this, "setClock()");
		
		ui.Stopwatch_start.clicked.connect(this,"startStopwatch()");
		
		
		ui.Timer_Start.clicked.connect(this,"startTimer()");
		ui.Timer_Stop.clicked.connect(this,"stopTimer()");
		
		show();
	}
	
	
	public void startStopwatch() {
		ui.lcdStopwatch.setText(qTimeStop.getMinutes()+" : "+qTimeStop.getSeconds());
		qTimeStop.setSeconds(qTimeStop.getSeconds()+1);
		QTimer.singleShot(1000, this, "startStopwatch()");
	}
	
	public void startTimer() {
		qTimeTimer.setHours(ui.timeEdit.time().hour());
		qTimeTimer.setMinutes(ui.timeEdit.time().minute());
		qTimeTimer.setSeconds(ui.timeEdit.time().second());
		ui.timeEdit.setEnabled(false);
		
		ui.lcdTimer.setText(qTimeTimer.getHours()+" : "+qTimeTimer.getMinutes()+" : "+qTimeTimer.getSeconds());
		QTimer.singleShot(1000, this, "continueTimer()");
	}
	
	public void continueTimer() {
		if(qTimeTimer.getHours()+qTimeTimer.getMinutes()+qTimeTimer.getSeconds()==0||stop==true) {
			ui.timeEdit.setEnabled(true);
			stop=false;
			return;
		}
		qTimeTimer.setSeconds(qTimeTimer.getSeconds()-1);
		ui.lcdTimer.setText(qTimeTimer.getHours()+" : "+qTimeTimer.getMinutes()+" : "+qTimeTimer.getSeconds());
		QTimer.singleShot(1000, this, "continueTimer()");
		
	}
	
	public void stopTimer() {
		stop=true;
		
	}
	
	public void setClock() {
		ui.lcdClock.setText(qTimeClock.currentDateTime().addSecs(1).toString("hh : mm : ss"));
		QTimer.singleShot(1000, this, "setClock()");
	}
	
}
