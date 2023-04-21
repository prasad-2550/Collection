package Collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumarationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector();
		 v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		System.out.println(v);
		Enumeration enumeration = v.elements();
		 while (enumeration.hasMoreElements()) {
			 Object element = enumeration.nextElement();
			System.out.println(element); 
	}

}
}