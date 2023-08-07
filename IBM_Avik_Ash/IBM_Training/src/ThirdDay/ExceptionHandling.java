package ThirdDay;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=100/0;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Division by ZERO");
		}
	}

}
