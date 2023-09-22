package practice;

public class exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0 ;
		int c = 0;
		try {
			int c1 = a/b;
		}
		catch (Exception e) {
			System.out.println("error occured");
		}
		System.out.println(c);
		System.out.println("end");
		
	}

}
