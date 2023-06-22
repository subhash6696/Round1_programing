import java.util.Scanner;
public class Calculator {
	private double a;
	private double b;
	private String operation;
	public Calculator(double a, double b, String operation) {
		super();
		this.a = a;
		this.b = b;
		this.operation = operation;
	} 
	public double calculator() {
		double result=0;
		switch(operation) {
		case "addition" :
			result=a+b;
			break;
		case "subtraction":
			result=a-b;
			break;
		case "multiplication":
			result=a*b;
			break;
		case "division":
			if(b!=0)
				result=a/b;
			System.out.println("Can Not divided by Zero");
			break;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value ");
		double a=s.nextDouble();
		System.out.println("Enter b value ");
		double b=s.nextDouble();
		System.out.println("Enter the type of Operation ");
		String operation=s.next();
		Calculator c=new Calculator(a, b, operation);
		double result=c.calculator();
		System.out.println("Result is :"+result);
	}
}
