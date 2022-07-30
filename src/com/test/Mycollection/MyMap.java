package com.test.Mycollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MyMap
{
	public static void main(String[] args)
	{
		HashMap l_map = new HashMap();
		l_map.put(1,"ramesh");
		l_map.put(2,"suresh");
		l_map.put(2,"praveen");
		l_map.put(3,"kaml");
		l_map.put(4,"meena");
		
		// Iterator, listIterator, enum
		
		//Iterator iterator = 
		Set keys = l_map.keySet();
		
		Iterator iterator = keys.iterator();
		while(iterator.hasNext())
		{
			Integer key = (Integer)iterator.next();
			//String value = (String) l_map.get(key);
			
			//System.out.println("key::"+key+" value:"+value);
			System.out.println("key::"+key);
		}
		
		
		// created map
		//kept key and values
		// creted set for keys in the values
		// iterating set to displaykeys
		System.out.println(l_map);
		
		
	}
}
