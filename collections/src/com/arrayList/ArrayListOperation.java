package com.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperation {

	public static void main(String[] args) {
		 ArrayListOperation al=new  ArrayListOperation();
		 ArrayList<Integer>list=new ArrayList<>();
		 list.add(1);
		 list.add(2);
		 list.add(4);
		 System.out.println(list);
		 list.add(3,3);
		 System.out.println(list);
		 list.remove(1);
		 Collections.sort(list);
		 for(Integer i:list)
		 {
			 System.out.println(i);
		 }
		 int pos=list.indexOf(3);
		 int value=list.get(2);
		 Collections.reverse(list);
		 System.out.println(pos+ " " + value);
		 System.out.println(list);
	}

}
