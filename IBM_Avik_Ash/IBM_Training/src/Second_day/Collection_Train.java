package Second_day;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Collection_Train {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(8);
		System.out.println(a.size());
		Scanner S=new Scanner(System.in);
		//String s=S.nextLine();
		a.add(S.nextInt());
		a.add(S.nextInt());
		a.add(S.nextInt());
		Iterator<Integer> iter=a.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("Size is:" +a.size());
		
	

	}

}
