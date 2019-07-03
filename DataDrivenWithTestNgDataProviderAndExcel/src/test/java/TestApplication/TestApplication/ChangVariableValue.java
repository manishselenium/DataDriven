package TestApplication.TestApplication;

public class ChangVariableValue {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;

		a = b + a;
		
		b=a-b;

		System.out.println("Value of b =" + b);

		a= a-b;

		System.out.println("Value of a = " + a);

	}

}
