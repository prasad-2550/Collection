package Collections;

import java.util.LinkedList;

public class Linkedlist1 {
	public static void main (String args[]) {
		LinkedList nn = new LinkedList();
		nn.add("Prasad");
		nn.add(null);
		nn.add(55);
		
		System.out.println(nn);
	
		nn.add(2,"rex");// postion
		System.out.println(nn);
		
		nn.set(0,"shree");// replace
		System.out.println(nn);

	}

}
