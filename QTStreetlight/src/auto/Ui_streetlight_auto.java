package auto;
/********************************************************************************
** Form generated from reading ui file 'streetlight_auto.jui'
**
** Created: —р 18. окт 17:39:59 2023
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_streetlight_auto implements com.trolltech.qt.QUiForm<QWidget>
{
    public QWidget verticalLayoutWidget;
    public QVBoxLayout verticalLayout;
    public QWidget widget;

    public Ui_streetlight_auto() { super(); }

    public void setupUi(QWidget Form)
    {
        Form.setObjectName("Streetlight_auto");
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

        retranslateUi(Form);

        Form.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget Form)
    {
        Form.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Form", "Form", null));
    } // retranslateUi

}

