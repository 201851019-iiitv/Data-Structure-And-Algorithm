package hello;

import java.util.ArrayList;
import java.util.Scanner;

public class CompletelyDifferentStrings {

	public static int count(int s,String  fb[])
	{
		int result=1;
		int n=fb[0].length();
		
		int j=0;
		while(j<n)
		{
			ArrayList<String>arr=new ArrayList<String>();
		int count=s;
		for(int i=0;i<fb.length;i++)
		{
			
			char c=fb[i].charAt(j);
		String k=Character.toString(c);
			if(!arr.contains(k))
			{
			arr.add(k);
			count--;
			}
		}
		System.out.println(j+" "+count);
		result=result*count;
		j++;
		}
		
		return result;
		
			}
	
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int n=sc.nextInt();
		String str[]=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();
		}
		
		int result=count(s,str);
		System.out.println(result);
	}
}
