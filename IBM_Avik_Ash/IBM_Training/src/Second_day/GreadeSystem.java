package Second_day;

class Gradesystem{
	public void grade(int mark) {
		mark=mark/10;
		switch(mark) {
		case 9:
			System.out.println("Grade is O");
			break;
		case 8:
			System.out.println("Grade is E");
			break;
		case 7:
			System.out.println("Grade is A");
			break;
		case 6:
			System.out.println("Grade is B");
			break;
		case 5:
			System.out.println("Grade is C");
			break;
		default:
			System.out.println("Failed");
			break;
		
		}
	}
}

public class GreadeSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gradesystem g=new Gradesystem();
		g.grade(55);
	}

}
