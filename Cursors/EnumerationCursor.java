package Cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursor {
//Enumeration applicable for legacy class
//By using Enumeration we can only go in forward direction	
	public static void main(String[] args) {
		Vector v = new Vector();
		for(int i=1;i<=10;i++) {
			v.addElement(i);
		}
		//To create Enumeration object vector class has method elements() to create object
		Enumeration e = v.elements();
		System.out.println(e.getClass().getName());
		//to iterate and get one by one object use enumeration interface hasMoreElements()
		while(e.hasMoreElements()) {
			//move to next object so use nextElement() method
			Integer i = (Integer) e.nextElement();
			System.out.print(i+" ");
		}
	}
}
//op = 1 2 3 4 5 6 7 8 9 10 
