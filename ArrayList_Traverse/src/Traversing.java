import java.util.ArrayList;
import java.util.Iterator;

public class Traversing {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		/*for loop
		 * for each loop
		 * while loop
		 * iterator
		 */
		//for loop way
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		al.add(16);
		for(int i=0;i<al.size();i++) {
			al.get(i);
		}
		System.out.println(al);
		//for each loop
		for(int i:al) {
			System.out.print(i+" ");
		}
		//using while loop
		System.out.println("   ");
		int i=0;
		while(i<al.size()) {
			System.out.print(al.get(i)+" ");
			i++;
		}
		System.out.println(" ");
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}

	}

}
