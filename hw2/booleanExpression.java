package program1;
import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;




interface booleanExpression {
	 public boolean EvaluateExpression(String s);


}
class express implements booleanExpression{

	public boolean EvaluateExpression(String b){
		
boolean s;
		        try {

		            ScriptEngineManager sem = new ScriptEngineManager();
		            ScriptEngine se = sem.getEngineByName("JavaScript");
		            String myExpression =b;
		           
		            String and = "&&";
		            String or="||";
		            String result = myExpression.replaceAll("and", and);
		            String finval = result.replaceAll("or", or);
		            System.out.println("the result is\n");
s=(boolean) se.eval(finval);

return s;

		        } catch (ScriptException e) {

		            System.out.println("Invalid Expression");
		            e.printStackTrace();

		        }
		    
		
        return false;
	
	
	}
public static void main(String args[])
{  System.out.println("Enter the Boolean Expression");
	Scanner val=new Scanner(System.in);
String myExpression=val.nextLine();


	booleanExpression a=new express();
	boolean re=a.EvaluateExpression(myExpression);
	System.out.print(re);
}
}

