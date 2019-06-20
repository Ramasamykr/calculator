import java.util.Scanner;

public class BasicMathOperation {
	
	public static void main(String args[])
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the first number....");
		int a = scan.nextInt();
		System.out.println("Enter second number.......");
		int b = scan.nextInt();
		
		int c = add(a,b);
		
		System.out.println("Result is ...."+c);
	}
	
	public static int add(int a ,int b)
	{
		int result = a+b;
		return result;
	}

}
