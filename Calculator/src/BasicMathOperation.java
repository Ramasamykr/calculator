import java.util.Scanner;

public class BasicMathOperation {

	public static void main(String args[])
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the operation you want ADD OR SUB");
		String operation = scan.nextLine();

		switch (operation) {
		case "ADD":
			System.out.println("Enter the first number....");
			int a = scan.nextInt();
			System.out.println("Enter second number.......");
			int b = scan.nextInt();
			int c = add(a,b); 
			System.out.println("Result is ...."+c);
			break;
		case "SUB":
			System.out.println("Enter the first number....");
			int d = scan.nextInt();
			System.out.println("Enter second number.......");
			int e = scan.nextInt();
			int f = sub(d,e); 
			System.out.println("Result is ...."+f);
			break;
		default:
			System.out.println("Default Values are");
			System.out.println("--------ADD-------");
			System.out.println("--------SUB-------");
			break;
		}

	}

	public static int add(int a ,int b)
	{
		int result = a+b;
		return result;
	}
	public static int sub(int a ,int b)
	{
		int result = a-b;
		return result;
	}

}
