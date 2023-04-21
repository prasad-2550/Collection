package Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public final class ListIteratorDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(55);
		al.add(88);
		al.add(89);
		al.add(99);
		al.add(98);
		al.add(90);
		System.out.println(al);
		
		ListIterator li = al.listIterator();
		   while (li.hasNext()) {
			 Object next = li.next();
			 
			 if (next.equals(99)) {
					li.add(999999);
				}
			
			 
			 if(next.equals(89)) {
					li.remove();
				}
			 
			 
		   }	 
			 System.out.println(al);

		 }
		
	

}
