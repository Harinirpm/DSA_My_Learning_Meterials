package list;
import java.util.ListIterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class ListIteratorDemo {
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("Harini");
		al.add("Abi");
		al.add("Savi");
		al.add("pradee");
		Collections.sort(al);
		
		ListIterator<String> li = al.listIterator();
		System.out.println("-------Traversing forward direction------");
		while(li.hasNext()) {
			System.out.println("Index : "+li.nextIndex()+" Value : "+li.next());
		}
		System.out.println("-------Traversing bacward direction--------");
		while(li.hasPrevious()) {
			System.out.println("Index : "+li.previousIndex()+" value : "+li.previous());
		}
		System.out.println(al.subList(1, 4));
		System.out.println(Collections.synchronizedList(al));
	}
}
