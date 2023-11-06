package TXTed;
/********************************************************************************
** Form generated from reading ui file 'QText.jui'
**
** Created: �� 5. ��� 17:03:18 2023
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_Text implements com.trolltech.qt.QUiForm<QWidget>
{
    public QTextEdit textBrowser;
    public QPushButton pushButton;
    public QPushButton pushButton_2;

    public Ui_Text() { super(); }

    public void setupUi(QWidget Form)
    {
        Form.setObjectName("Form");
        Form.resize(new QSize(601, 323).expandedTo(Form.minimumSizeHint()));
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Fixed, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(Form.sizePolicy().hasHeightForWidth());
        Form.setSizePolicy(sizePolicy);
        textBrowser = new QTextBrowser(Form);
        textBrowser.setObjectName("textBrowser");
        textBrowser.setGeometry(new QRect(10, 10, 381, 301));
        textBrowser.setReadOnly(false);
        pushButton = new QPushButton(Form);
        pushButton.setObjectName("pushButton");
        pushButton.setGeometry(new QRect(410, 60, 181, 41));
        pushButton_2 = new QPushButton(Form);
        pushButton_2.setObjectName("pushButton_2");
        pushButton_2.setGeometry(new QRect(410, 10, 181, 41));
        retranslateUi(Form);

        Form.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget Form)
    {
        Form.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Form", "Form", null));
        pushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Find text file", null));
        pushButton_2.setText(com.trolltech.qt.core.QCoreApplication.translate("Form", "Save text file", null));
    } // retranslateUi

}

