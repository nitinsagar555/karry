package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,List<String>>mp=new HashMap<>();
		ArrayList<String>list=new ArrayList<>();
		list.add("eat");
		list.add("ate");
		list.add("me");
		list.add("em");
		list.add("e");
		int i;
		int l=list.size();
		for(i=0;i<l;i++)
		{
			String s= list.get(i);
			char[] c=s.toCharArray();
			Arrays.sort(c);
			String s1=new String(c);
			
			if(mp.containsKey(s1))
			{
				mp.get(s1).add(s);
			}
			else
			{
				ArrayList<String>list1=new ArrayList<>();
				list1.add(s);
				mp.put(s1,list1);
			}
			
		}
		for(String s:mp.keySet())
		{
			List<String>l1=mp.get(s);
			System.out.println(l1);
		}

}
}
