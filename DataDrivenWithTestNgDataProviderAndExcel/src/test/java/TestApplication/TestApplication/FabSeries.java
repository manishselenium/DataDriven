package TestApplication.TestApplication;

public class FabSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;

		System.out.print(a+","+b);
		
		for (int i=1; i<=7; i++)
		{
		c=a+b;
		
		System.out.print(","+c);
		
		a=b;
		b=c;
		
		
		}
	}
}