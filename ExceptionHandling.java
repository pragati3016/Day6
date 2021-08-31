package day6;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a[] = new int[5];
			try {
				a[5] = 30/0;
			}
			catch(ArithmeticException e) {
				
				System.out.println("Arithmetic Exception Occurs!");
			}
			
			System.out.println(a[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Array Index Out Of Bounds Exception Exception Occurs!");
		}
		catch(Exception e) {
			
			System.out.println("Parent Exception Occurs!");
		}
		
		System.out.println("Rest of the Code");
	}
	

}
