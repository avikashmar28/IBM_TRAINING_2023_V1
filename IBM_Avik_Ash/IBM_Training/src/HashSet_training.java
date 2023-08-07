import java.util.HashSet;
import java.util.Iterator;
public class HashSet_training {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h1=new HashSet<String>();
		h1.add("Mango");
		h1.add("Grapes");
		System.out.println(h1);
		
		HashSet<Integer> h2=new HashSet<Integer>();
		h2.add(10);
		h2.add(12);
		//System.out.println(h2);
		Iterator<Integer> iter=h2.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		
	}

}
