package Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListItretorDemo3 {
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
			
			System.out.println("Forward direction");

			   while (li.hasNext()) {
				 Object next = li.next();
				 int nextIndex = li.nextIndex();
					System.out.println(nextIndex);
				 System.out.println(next);

			   }
				System.out.println("backward direction");

			   while (li.hasPrevious()) {
				 Object previous = li.previous();
				 int previousIndex = li.previousIndex();
					System.out.println(previousIndex);

					
				 System.out.println(previous);

			   

			 }
			
	}
	}

