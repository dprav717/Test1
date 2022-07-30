package com.test.Mycollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratroExample
{
			public static void main(String[] args)
			{
				// Whose salarey is greater than 20,000
				ArrayList list = new ArrayList();
				
				list.add(1);
				list.add(4);
				
			list.add(" ");
				list.add(66);
				list.add(90);
				
				HashSet  set = new HashSet();
				set.add(1);
				set.add(2);
				set.add(3);
				
				ListIterator listiterator = list.listIterator();
				
				while(listiterator.hasPrevious())
					System.out.println("List:::"+listiterator.previous());
				
				Iterator iterator = list.iterator();
				
			//	while(iterator.hasNext())
				//System.out.println(iterator.next());	;
				
			}
			
}