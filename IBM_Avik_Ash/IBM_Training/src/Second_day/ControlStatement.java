package Second_day;


class oddeven{
	public void oddeven(int a) {
		if(a%2==0) {
			System.out.println("Number is EVEN");
		}
		else
			System.out.println("Number is ODD");
	}
}

public class ControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 oddeven a =new oddeven();
		 a.oddeven(10);

	}

}
