package Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCursor {
/*
By using Enumeration we get read access and it is only applicable for legacy classes.
By using Iterator we can get read as well as remove access also  
Limitation of iterator -  1.only forward drection only 2.replace and addition of new object
is not there.
NOTE - To overcome above limitation of iterator we should go for ListIterator.
*/
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		for(int i=1;i<=10;i++) {
			al.add(i);
		}
		
		System.out.println(al);

		//to get iterator object 
		Iterator itr = al.iterator();
		
		//return true if next element is there or not else false
		while(itr.hasNext()) {
			//public object next() return type is object so we need to convert object into Integer object
			Integer i = (Integer) itr.next();
			if(i%2==0)
				System.out.println(i+" ");
			else
				itr.remove();
		}
			
		System.out.println(al);
	}
}
/*
2 
4 
6 
8 
10 
[2, 4, 6, 8, 10]
 */
 