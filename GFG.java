
package hello ;
import java.util.*;
import java.lang.*;
import java.io.*;

 public class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		while(t-->0)
		{
			Set<Integer> 
            set = new HashSet<Integer>(); 
			Set<Integer> 
            set1 = new HashSet<Integer>(); 
			int n=sc.nextInt();
			int m=sc.nextInt();
			int arr[]=new int[n];
			int b[]=new int[n];
			int ar[]=new int[m];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
				b[i]=arr[i];
			}
			for(int i=0;i<m;i++)
			{
				ar[i]=sc.nextInt();
			}
			Arrays.sort(b);
			String s=null;
			for(int i=0;i<n;i++)
			{
				if(b[i]!=arr[i])
					s +=(i+1)+"";
						
			}
		
			Arrays.parallelSort(ar);
			ArrayList<String> a=new ArrayList<String>();
			for(int i=0;i<m;i++)
			{
				String d=ar[i]+(ar[i]+1)+"";
				a.add(d);
			}
			for(int i=0;i<s.length()-1;i++)
			{
				if(!check(s.charAt(i),s.charAt(i+1), ))
				{
			}
			
	}
	}
}

	private static boolean check(char charAt, char charAt2) {
		
		return false;
	}