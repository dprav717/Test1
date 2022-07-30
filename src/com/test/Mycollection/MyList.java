package com.test.Mycollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MyList
{
	public static void main(String[] args)
	{
		//List l = new List();
		
		// add , update , delete , insert , retrieve
		
		List<Integer> list = new ArrayList();
		
		//ArrayList<Integer> list2 = ;
		
		HashSet set = new HashSet();
		set.add(11);
		set.add(22);
		set.add(13);
		set.add(45);
		set.add(5);
		
		list.add(1); //0
		//list.add("abc"); //1
		list.add(6); //2
		
		
		list.add(3);
		list.add(3242);
		list.add(34);
		list.add(88);
		
		for(int l: list)
		{
			//System.out.print("";)
			System.out.println("k:::"+l);
		}
		
		//System.out.println(set);
		
		list.add(1); //0
		//list.add("abc"); //1
		list.add(6); //2
		
		
		list.add(3);
		list.add(3242);
		list.add(34);
		list.add(88);
		
		list.remove(4);
		
		//list.
		
		
		System.out.println();
		
		for(int i =0; i< list.size();i++)
		{
			//System.out.println(list.get(i));
		}
		
		
		
		//System.out.println(list);
		
	}
}

// javac MyList.java
//MyList.class must be created..
// java MyList

// 100 files
// 100 clean 
//  4 or 5 , 1 