package com.linkedList;

import java.util.LinkedList;

public class LinkedListOp {

	public static void main(String[] args) {
		LinkedList<Integer>list=new LinkedList<>();
		list.add(1);
		list.addFirst(2);
		list.addLast(5);
		list.add(3, 7);
		System.out.println(list);
		for(int i:list)
		{
			System.out.println(i);
		}

	}

}
