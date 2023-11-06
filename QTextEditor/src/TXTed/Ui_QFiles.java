package TXTed;
/********************************************************************************
** Form generated from reading ui file 'QText.jui'
**
** Created: �� 5. ��� 18:10:41 2023
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_QFiles implements com.trolltech.qt.QUiForm<QWidget>
{
    public QTreeView treeView;
    public QListView listView;

    public Ui_QFiles() { super(); }

    public void setupUi(QWidget Form)
    {
        Form.setObjectName("Form");
        Form.resize(new QSize(506, 402).expandedTo(Form.minimumSizeHint()));
        treeView = new QTreeView(Form);
        treeView.setObjectName("treeView");
        treeView.setGeometry(new QRect(0, 10, 251, 391));
        listView = new QListView(Form);
        listView.setObjectName("listView");
        listView.setGeometry(new QRect(260, 10, 256, 391));
        retranslateUi(Form);

        Form.connectSlotsByName();
    } // setupUi

    void retranslateUi(QWidget Form)
    {
        Form.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("Form", "Form", null));
    } // retranslateUi

}

