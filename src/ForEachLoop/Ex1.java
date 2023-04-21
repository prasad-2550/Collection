package ForEachLoop;
import java.util.Enumeration;
import java.util.Vector;

public class Ex1 {


		public static void main(String[] args) {

			Vector<Integer> v = new Vector();
			v.addElement(11);
			v.addElement(22);
			v.addElement(55);
			v.addElement(8);
			System.out.println(v);

//			Enumeration enumeration = v.elements();
//			
//			while(enumeration.hasMoreElements()) {
//			Object element = enumeration.nextElement();
//			System.out.println(element);
//			
//		}

			System.out.println("Iterating via for each loop");
			for (Integer i : v) {
				System.out.println(i);
			}

		}
	}

