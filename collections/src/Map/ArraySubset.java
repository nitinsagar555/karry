package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ArraySubset {
	
	void subsetFun(int[] a1,int[] a2)
	{
		int i,j;
		boolean flag=true;
		Set<Integer>s=new HashSet<>();
		for(i=0;i<a1.length;i++)
		{
			if(!s.contains(a1[i]))
			{
				s.add(a1[i]);
			}
		}
		for(j=0;j<a2.length;j++)
		{
			if(!s.contains(a2[j]))
			{
				flag=false;
			}
		}
		if(flag==false)
			System.out.println("array2 is not the subset of array1");
		else
			System.out.println("array2 is the subset of array1");
	}
	public static void main(String args[])
	{
		int n1,n2,i,j;
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		int[] a1=new int[n1];
		int[] a2=new int[n2];
		for(i=0;i<n1;i++)
		{
			a1[i]=sc.nextInt();
		}
		for(j=0;j<n2;j++)
		{
			a2[j]=sc.nextInt();
		}
		ArraySubset arraySubset=new ArraySubset();
		arraySubset.subsetFun(a1,a2);
		
	}

}
