package window;
/********************************************************************************
** Form generated from reading ui file 'DataBaseQ.jui'
**
** Created: Вс 5. ноя 02:46:50 2023
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_QDataBase implements com.trolltech.qt.QUiForm<QWidget>
{
    public QTableWidget tableWidget;
    public QPushButton pushButton;
    public QPushButton pushButton_2;
    public QPushButton pushButton_3;
    public QPushButton pushButton_4;
    public QPushButton pushButton_5;
    public QPushButton pushButton_6;

    public Ui_QDataBase() { super(); }

    public void setupUi(QWidget Form)
    {
        Form.setObjectName("Form");
        Form.resize(new QSize(657, 312).expandedTo(Form.minimumSizeHint()));
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Fixed, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(Form.sizePolicy().hasHeightForWidth());
        Form.setSizePolicy(sizePolicy);
        tableWidget = new QTableWidget(Form);
        tableWidget.setObjectName("tableWidget");
        tableWidget.setGeometry(new QRect(10, 10, 511, 201));
        pushButton = new QPushButton(Form);
        pushButton.setObjectName("pushButton");
        pushButton.setGeometry(new QRect(10, 240, 191, 51));
        pushButton_2 = new QPushButton(Form);
        pushButton_2.setObjectName("pushButton_2");
        pushButton_2.setGeometry(new QRect(230, 240, 191, 51));
        pushButton_3 = new QPushButton(Form);
        pushButton_3.setObjectName("pushButton_3");
        pushButton_3.setGeometry(new QRect(530, 10, 121, 41));
        pushButton_4 = new QPushButton(Form);
        pushButton_4.setObjectName("pushButton_4");
        pushButton_4.setGeometry(new QRect(530, 60, 121, 41));
        pushButton_5 = new QPushButton(Form);
        pushButton_5.setObjectName("pushButton_5");
        pushButton_5.setGeometry(new QRect(530, 110, 121, 41));
        pushButton_6 = new QPushButton(Form);
        pushButton_6.setObjectName("pushButton_6");
        pushButton_6.setGeometry(new QRect(530, 160, 121, 41));
        retranslateUi(Form);

        Form.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget Form)
    {
        Form.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Form", "Form", null));
        tableWidget.clear();
        tableWidget.setColumnCount(0);
        tableWidget.setRowCount(0);
        pushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Revert changes", null));
        pushButton_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Save changes", null));
        pushButton_3.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Add row", null));
        pushButton_4.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Remove row", null));
        pushButton_5.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Add column", null));
        pushButton_6.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Remove column", null));
    } // retranslateUi

}

