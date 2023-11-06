package V2;



import com.fathzer.soft.javaluator.DoubleEvaluator;
import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QWidget;



public class CalculatorV2 extends QWidget{

	Ui_Calculator2 ui = new Ui_Calculator2();
	int i = 1;
	DoubleEvaluator eval = new DoubleEvaluator();
	
	public static void main(String[] args){
		QApplication.initialize(args);
		
		CalculatorV2 manualStreetlight = new CalculatorV2();
		
		QApplication.exec();
	}
	
	public CalculatorV2() {
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
		
		ui.pushButton_17.clicked.connect(this, "addDot()");
		ui.pushButton_18.clicked.connect(this, "addPercent()");
		ui.pushButton_19.clicked.connect(this, "addClose()");
		ui.pushButton_20.clicked.connect(this, "addOpen()");
		
		ui.pushButton_21.clicked.connect(this, "addE()");
		ui.pushButton_22.clicked.connect(this, "addLn()");
		ui.pushButton_23.clicked.connect(this, "addPi()");
		ui.pushButton_24.clicked.connect(this, "addSin()");
		ui.pushButton_25.clicked.connect(this, "addCos()");
		ui.pushButton_26.clicked.connect(this, "addTan()");
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
		ui.label.setText(txt+"+");
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
	public void addDot() {
		String txt = ui.label.text();
		if(txt.equals("")) {
			ui.label.setText(txt+"0,");
			return;
		}
		char t = txt.charAt(txt.length()-1);
		
		if(t=='/'||t=='*'||t=='+'||t=='-'){
			ui.label.setText(txt+"0.");
			return;
		}
		ui.label.setText(txt+".");
	}
	
	public void addPercent() {
		String txt = ui.label.text();
		if(txt.equals("")) {
			return;
		}
		char t = txt.charAt(txt.length()-1);
		if(t=='/'||t=='*'||t=='+'||t=='-'){
			return;
		}
		ui.label.setText(txt+"%");
	}
	
	public void addClose() {
		String txt = ui.label.text();
		if(expEvalParenthesisCompl(txt)) {
			return;
		}
		ui.label.setText(txt+")");
	}
	
	public void addOpen() {
		String txt = ui.label.text();
		
		ui.label.setText(txt+"(");
	}
	
	
	public void addE() {
		String txt = ui.label.text();
		ui.label.setText(txt+"(e)");
	}
	public void addLn() {
		String txt = ui.label.text();
		ui.label.setText(txt+"ln(");
	}
	public void addPi() {
		String txt = ui.label.text();
		ui.label.setText(txt+"(pi)");
	}
	public void addSin() {
		String txt = ui.label.text();
		ui.label.setText(txt+"sin(");
	}
	public void addCos() {
		String txt = ui.label.text();
		ui.label.setText(txt+"cos(");
	}
	public void addTan() {
		String txt = ui.label.text();
		ui.label.setText(txt+"tan(");
	}
	
	
	public void getResult() {
		String mathExpression = ui.label.text();
		
		while(!expEvalParenthesisCompl(mathExpression)) {
			
			mathExpression = mathExpression+")";
		}
		
		System.out.println(mathExpression);
	   
		
		ui.label.setText(eval.evaluate(mathExpression)+"");
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
