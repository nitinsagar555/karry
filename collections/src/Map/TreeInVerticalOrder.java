package Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
class Node
{
	int data;
	Node left,right;
	Node(int data)
	{
		this.data=data;
		left=null;
		right=null;
	}
}
public class TreeInVerticalOrder {
	static Node root;
	Map<Integer,List<Integer>>mp=new HashMap<>();
	static int index=0;
	void verticalOrder(Node temp,int index)
	{
		if(temp==null)
			return;
		
		if(mp.containsKey(index))
		{
			/*mp.get(index).add(temp.data);*/
		}
		else
		{
				List<Integer>list1=new ArrayList<>();
				list1.add(temp.data);
				mp.put(index,list1);
		}
			verticalOrder(temp.left,index-1);
			verticalOrder(temp.right,index+1);
			Set<Integer>s=new TreeSet<>();
			for(Integer i:mp.keySet())
			{
				s.add(i);
			}
			System.out.println(s);
		/*for(Integer i:s)
		{
			/*List<Integer>li=mp.get(i);
			System.out.println(i);
		}*/
}
	
	public static void main(String args[])
	{
		TreeInVerticalOrder tv=new TreeInVerticalOrder();
		tv.root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		
		tv.verticalOrder(root,index);
	}

}
