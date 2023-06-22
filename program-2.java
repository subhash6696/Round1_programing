import java.util.Scanner;
public class Number_Series {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value of a");
	int a=s.nextInt();
	for(int i=1;i<=a;i++) {
		int number=2*i-1;
		System.out.print(number);
		if(i!=0)
			System.out.print(", ");
	}
	System.out.println();
}
}
