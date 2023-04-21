package Collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Vector v = new Vector();
			v.add(11);
			v.add(17);
			v.add(null);
			v.add("raju");
			v.add(11);
			v.add(175);
			v.add(189);
			v.add("string");
			v.add(11);
			v.add(null);
		
			
			System.out.println(v);
			System.out.println("capacity " +v.capacity() );
			
			
			System.out.println("size of vector is "+ v.size());
			v.add("Prasad");
			v.add(null);
			v.add(55);
			System.out.println(v);
			
			System.out.println("capacity " +v.capacity() );
			 v.remove(0);
			 System.out.println(v);
			 System.out.println(v.get(3));
			 
			 System.out.println("getting index " +v);
			 v.removeAllElements();
			 System.out.println(v);
	}

}
