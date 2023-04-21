package ForEachLoop;

import java.util.Enumeration;
import java.util.Vector;

public class Ex2 {


		public static void main(String[] args) {

			Vector v = new Vector();
			v.addElement(1145);
			v.addElement(2267);
			v.addElement(5599);
			v.addElement(878.88);
			v.add("Prasad");
			System.out.println(v);

//			Enumeration enumeration = v.elements();
//			
//			while(enumeration.hasMoreElements()) {
//			Object element = enumeration.nextElement();
//			System.out.println(element);
//			
//		}

			System.out.println("Iterating via for each loop");
			for (Object a : v) {
				System.out.println(a);
			}

		}
	}



