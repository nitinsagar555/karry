package com.unique;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UniqueString {
	
	void printUnique(String str)
	{
		Map<Character,Integer>mp=new LinkedHashMap<Character,Integer>();
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			if(!mp.containsKey(str.charAt(i)))
			{
			mp.put(str.charAt(i),1);
			}
			else
			{
				c=mp.get(str.charAt(i));
				c++;
				mp.put(str.charAt(i), c);
			}
		}
		int count=0;
		Set<Character> s=mp.keySet();
		for(Character ch: s)
		{		if(count==5) {
				System.out.println(ch);
				break;
		}
				else
					count++;
			
		}
	}
	
	public static void main(String args[])
	{
		UniqueString us=new UniqueString();
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		str=sc.next();
		us.printUnique(str);
	}

}
