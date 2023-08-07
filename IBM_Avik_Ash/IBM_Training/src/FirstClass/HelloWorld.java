package FirstClass;


public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World");
		Test t1=new Test();
		t1.add(5, 6);
		t1.substract(4, 2);

	}

}


class Test{
	int x,y,z;
	public void add (int a,int b) {
		System.out.println("sum is:" +(a+b));
	}
	public void substract(int a,int b) {
		System.out.println("Minus:"+(a-b));
	}
}
