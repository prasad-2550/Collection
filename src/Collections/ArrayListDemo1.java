package Collections;


import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main (String args[]) {
		ArrayList  a1=new ArrayList();
		a1.add(11);
		a1.add(175);
		a1.add(189);
		a1.add("string");
		a1.add(11);
		a1.add(null);
		
		System.out.println(a1.add("prasad")); //
		System.out.println(a1.contains(""));//found or not
		System.out.println(a1);
		
		ArrayList  a2=new ArrayList();
		a2.add(89);
		a2.add(555);
		a2.add(null);
		a2.add("string 2");
		a2.add(11);
	
		System.out.println(a2);
		
		a1.addAll(a2);
		
		System.out.println(a1);
		
		System.out.println("the size of array list is " +a1.size());
		System.out.println(a1.isEmpty());
		System.out.println("the index of 7 is "+ a1.get(7));

		
		
	}
	
}