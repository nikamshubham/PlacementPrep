package Cursors;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorCursor {
/*
 ListIterator is bidirectional cursor we can move either to the forward direction or backward direction also
 using ListIterator we can perform read ,remove ,replacement and addition of new object
 ListIterator is child interface of Iterator so all methods of iterator is present in iterator
 only disadvantage of listIterator is only applicable for List class object it is not universal cursor
 */
	public static void main(String[] args) {
//we can create ListIterator obj by using listIterator() method of list interface
//public ListIterator listIterator() eg. ListIterator itr = l.listItertor(); l is list object
		
		LinkedList l = new LinkedList();
		l.add("Shubham");
		l.add("Pranita");
		l.add("Arpita");
		l.add("Sai");
		l.add("Omkar");
//		System.out.println(l);
		
		ListIterator ltr = l.listIterator();
		while(ltr.hasNext()) {
			String s = (String)ltr.next();
			if(s.equals("Sai")) {
				ltr.remove();
			}else if(s.equals("Omkar")) {
				ltr.add("Pooja");
			}
				
//			System.out.println(s);
		}
		System.out.println(l);	
	}
}
//op - [Shubham, Pranita, Arpita, Omkar, Pooja]