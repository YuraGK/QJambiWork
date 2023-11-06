package V1;



import com.google.code.mathparser.MathParser;
import com.google.code.mathparser.MathParserFactory;
import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QWidget;



public class CalculatorV1 extends QWidget{

	Ui_Calculator ui = new Ui_Calculator();
	int i = 1;
	public static void main(String[] args){
		QApplication.initialize(args);
		
		CalculatorV1 manualStreetlight = new CalculatorV1();
		
		QApplication.exec();
	}
	
	public CalculatorV1() {
		ui.setupUi(this);
		
		ui.pushButton.clicked.connect(this, "addDivide()");
		ui.pushButton_2.clicked.connect(this, "addMultiply()");
		ui.pushButton_3.clicked.connect(this, "addMinus()");
		ui.pushButton_4.clicked.connect(this, "addPlus()");
		
		ui.pushButton_5.clicked.connect(this, "getResult()");
		
		ui.pushButton_6.clicked.connect(this, "add9()");
		ui.pushButton_7.clicked.connect(this, "add6()");
		ui.pushButton_8.clicked.connect(this, "add3()");
		ui.pushButton_9.clicked.connect(this, "add2()");
		ui.pushButton_10.clicked.connect(this, "add5()");
		ui.pushButton_11.clicked.connect(this, "add8()");
		ui.pushButton_12.clicked.connect(this, "add4()");
		ui.pushButton_13.clicked.connect(this, "add7()");
		ui.pushButton_14.clicked.connect(this, "add1()");
		ui.pushButton_15.clicked.connect(this, "add0()");
		
		ui.pushButton_16.clicked.connect(this, "clear()");
		show();
	}
	
	public void addPlus() {
		String txt = ui.label.text();
		if(txt.equals("")) {
			return;
		}
		
		char t = txt.charAt(txt.length()-1);
		
		if(t=='/'||t=='*'||t=='+'||t=='-'){
			return;
		}
		
	}
	
	public void addMinus() {
		String txt = ui.label.text();
		if(txt.equals("")) {
			
		}else {
			char t = txt.charAt(txt.length()-1);
		
			if(t=='-'){
				return;
			}else if(t=='/'||t=='*'||t=='+'){
				ui.label.setText(txt+"(-");
				return;
			}
		}
		
		
		ui.label.setText(txt+"-");
	}
	
	public void addMultiply() {
		String txt = ui.label.text();
		if(txt.equals("")) {
			return;
		}
		
		char t = txt.charAt(txt.length()-1);
		
		if(t=='/'||t=='*'||t=='+'||t=='-'){
			return;
		}
		
		
		ui.label.setText(txt+"*");
	}
	
	public void addDivide() {
		String txt = ui.label.text();
		if(txt.equals("")) {
			return;
		}
		char t = txt.charAt(txt.length()-1);
		
		if(t=='/'||t=='*'||t=='+'||t=='-'){
			return;
		}
		ui.label.setText(ui.label.text()+"/");
	}
	
	public void add1() {
		ui.label.setText(ui.label.text()+"1");
	}
	
	public void add2() {
		ui.label.setText(ui.label.text()+"2");
	}
	
	public void add3() {
		ui.label.setText(ui.label.text()+"3");
	}
	
	public void add4() {
		ui.label.setText(ui.label.text()+"4");
	}
	
	public void add5() {
		ui.label.setText(ui.label.text()+"5");
	}
	
	public void add6() {
		ui.label.setText(ui.label.text()+"6");
	}
	
	public void add7() {
		ui.label.setText(ui.label.text()+"7");
	}
	
	public void add8() {
		ui.label.setText(ui.label.text()+"8");
	}
	
	public void add9() {
		ui.label.setText(ui.label.text()+"9");
	}
	
	public void add0() {
		ui.label.setText(ui.label.text()+"0");
	}
	
	public void clear() {
		ui.label.setText("");
	}
	
	public void getResult() {
		String mathExpression = ui.label.text();
		
		while(!expEvalParenthesisCompl(mathExpression)) {
			
			mathExpression = mathExpression+")";
		}
		
		
		
		String result = "";
		
		System.out.println(mathExpression);
	    
	    MathParser mathParser = MathParserFactory.create();
	    result = mathParser.calculate(mathExpression)
                .doubleValue().intValue()+"";
		
		ui.label.setText(result);
	}
	
	public boolean expEvalParenthesisCompl(String expr) {
		char[] arr = expr.toCharArray();
		int open = 0;
		int closed = 0;
		for(char c :arr) {
			if(c=='(') {
				open++;
			}else if(c==')') {
				closed++;
			}
		}
		
		if(open>closed) {
			return false;
		}
		return true;
	}
}
