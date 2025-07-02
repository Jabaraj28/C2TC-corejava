package exceptionhandling_example;

public class ExceptionExample {
	public static void main(String[]args) {
		try
		{
		
		int a[]={6,7,8,9};
		System.out.println(a[5]);

	}
	
	catch(ArrayIndexOutOfBoundsException ae)
		{
		System.err.println("Exception occured:"+ae.getMessage());
	}
	System.out.println("next line");

   }
}
