package day6;

public class NullPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String s = null;
			System.out.println(s.length());
			
		}
		catch (NullPointerException e){
			System.out.println("String is Empty");
		}
	}

}
