package ThirdDay;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap_training {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> student=new HashMap<Integer,String>();
		student.put(1, "Avik");
		student.put(2, "Aloke");
		student.put(3, "Sharmila");
		System.out.println(student);
		Set<Integer> a=student.keySet();
		//Set<String> b=student.values();
		for(int obj:a) {
			System.out.println(obj);
			System.out.println(student.get(obj));
		}
		//System.out.println(student.get(2));
		Iterator<Integer> iter=a.iterator();
		while(iter.hasNext()) {
			Integer i=iter.next();
			System.out.println("Key is:" +i);
			System.out.println("value is:" +student.get(i));
		}
	}

}
