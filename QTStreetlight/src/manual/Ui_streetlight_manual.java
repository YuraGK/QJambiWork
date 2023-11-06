package manual;
/********************************************************************************
** Form generated from reading ui file 'streetlight_manual.jui'
**
** Created: —р 18. окт 17:41:47 2023
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_streetlight_manual implements com.trolltech.qt.QUiForm<QWidget>
{
    public QWidget verticalLayoutWidget;
    public QVBoxLayout verticalLayout;
    public QWidget widget;
    public QPushButton pushButton;

    public Ui_streetlight_manual() { super(); }

    public void setupUi(QWidget Form)
    {
        Form.setObjectName("Streetlight_manual");
        Form.resize(new QSize(400, 300).expandedTo(Form.minimumSizeHint()));
        verticalLayoutWidget = new QWidget(Form);
        verticalLayoutWidget.setObjectName("verticalLayoutWidget");
        verticalLayoutWidget.setGeometry(new QRect(110, 80, 160, 151));
        verticalLayout = new QVBoxLayout(verticalLayoutWidget);
        verticalLayout.setObjectName("verticalLayout");
        widget = new QWidget(verticalLayoutWidget);
        widget.setObjectName("widget");
        widget.setStyleSheet("background-color: rgb(255, 0, 4);");

        verticalLayout.addWidget(widget);

        pushButton = new QPushButton(verticalLayoutWidget);
        pushButton.setObjectName("pushButton");

        verticalLayout.addWidget(pushButton);

        retranslateUi(Form);

        Form.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget Form)
    {
        Form.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Streetlight_manual", "Streetlight_manual", null));
        pushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Streetlight_manual", "PushButton", null));
    } // retranslateUi

}

