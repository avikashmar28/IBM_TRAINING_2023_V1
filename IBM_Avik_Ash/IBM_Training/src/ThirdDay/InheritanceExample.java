package ThirdDay;

public class InheritanceExample extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceExample i=new InheritanceExample();
		i.met1();
		System.out.println(i.a);
	}

}

class A{
	protected static int a=100;
	public void met1() {
		a=a+5000;
	}
}
