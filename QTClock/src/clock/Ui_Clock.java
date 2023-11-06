package clock;
/********************************************************************************
** Form generated from reading ui file 'Clock.jui'
**
** Created: ѕт 27. окт 16:30:20 2023
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

import com.trolltech.examples.*;

public class Ui_Clock implements com.trolltech.qt.QUiForm<QWidget>
{
    public QTabWidget tabWidget;
    public QWidget tab;
    public AnalogClock analogClock;
    public QLabel lcdClock;
    public QWidget tab_3;
    public QLabel lcdStopwatch;
    public QPushButton Stopwatch_start;
    public QWidget tab_2;
    public QLabel lcdTimer;
    public QTimeEdit timeEdit;
    public QPushButton Timer_Start;
    public QPushButton Timer_Stop;

    public Ui_Clock() { super(); }

    public void setupUi(QWidget Form)
    {
        Form.setObjectName("Form");
        Form.resize(new QSize(625, 411).expandedTo(Form.minimumSizeHint()));
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Fixed, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(Form.sizePolicy().hasHeightForWidth());
        Form.setSizePolicy(sizePolicy);
        tabWidget = new QTabWidget(Form);
        tabWidget.setObjectName("tabWidget");
        tabWidget.setGeometry(new QRect(0, 10, 621, 401));
        tab = new QWidget();
        tab.setObjectName("tab");
        analogClock = new AnalogClock(tab);
        analogClock.setObjectName("analogClock");
        analogClock.setGeometry(new QRect(380, 160, 200, 200));
        lcdClock = new QLabel(tab);
        lcdClock.setObjectName("lcdClock");
        lcdClock.setGeometry(new QRect(20, 20, 581, 121));
        tabWidget.addTab(tab, com.trolltech.qt.core.QCoreApplication.translate("Form", "Clock", null));
        tab_3 = new QWidget();
        tab_3.setObjectName("tab_3");
        lcdStopwatch = new QLabel(tab_3);
        lcdStopwatch.setObjectName("lcdStopwatch");
        lcdStopwatch.setGeometry(new QRect(20, 20, 581, 121));
        Stopwatch_start = new QPushButton(tab_3);
        Stopwatch_start.setObjectName("Stopwatch_start");
        Stopwatch_start.setGeometry(new QRect(390, 160, 191, 41));
        tabWidget.addTab(tab_3, com.trolltech.qt.core.QCoreApplication.translate("Form", "Stopwatch", null));
        tab_2 = new QWidget();
        tab_2.setObjectName("tab_2");
        lcdTimer = new QLabel(tab_2);
        lcdTimer.setObjectName("lcdTimer");
        lcdTimer.setGeometry(new QRect(20, 20, 581, 121));
        timeEdit = new QTimeEdit(tab_2);
        timeEdit.setObjectName("timeEdit");
        timeEdit.setGeometry(new QRect(30, 160, 151, 31));
        Timer_Start = new QPushButton(tab_2);
        Timer_Start.setObjectName("Timer_Start");
        Timer_Start.setGeometry(new QRect(390, 160, 191, 41));
        Timer_Stop = new QPushButton(tab_2);
        Timer_Stop.setObjectName("Timer_Stop");
        Timer_Stop.setGeometry(new QRect(390, 210, 191, 41));
        tabWidget.addTab(tab_2, com.trolltech.qt.core.QCoreApplication.translate("Form", "Timer", null));
        retranslateUi(Form);

        tabWidget.setCurrentIndex(0);


        Form.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget Form)
    {
        Form.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Form", "Clock", null));
        tabWidget.setTabText(tabWidget.indexOf(tab), com.trolltech.qt.core.QCoreApplication.translate("Form", "Clock", null));
        Stopwatch_start.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Start", null));
        tabWidget.setTabText(tabWidget.indexOf(tab_3), com.trolltech.qt.core.QCoreApplication.translate("Form", "Stopwatch", null));
        Timer_Start.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Start", null));
        Timer_Stop.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Stop", null));
        tabWidget.setTabText(tabWidget.indexOf(tab_2), com.trolltech.qt.core.QCoreApplication.translate("Form", "Timer", null));
    } // retranslateUi

}

