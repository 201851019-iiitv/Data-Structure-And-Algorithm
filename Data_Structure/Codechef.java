package Data_Structure;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

 class Codechef 
      {	
       public static void main(String[] args) throws IOException 
       { 
         
           Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         while(t-->0)
         {
        	 int n=sc.nextInt();
        	 long count=0;
        	 long a[]=new long[n];
        	int arr[]=new int[n];
        	for(int i=0;i<n;i++)
        	{
        		
        		a[i]=sc.nextLong();
        	}
        	
        	for (int i = 0; i < n; i++)
            {
               arr[i]=twopower(a[i]);
                
           }
        	for (int i = 0; i < n; i++)
        	{
        	//System.out.println(i+" ");
        		if(arr[i]>1)
        			count =count+n-i;
        		
        		else if(arr[i]==1)
        		{
        			for(int j=i+1;j<n;j++)
        			{
        				if(arr[j]>0)
        				{
        					count =count+n-j;
        					break;
        				}
        			}
        		}
        		
        		else
        		{
        			int zerocount=1;
        			boolean e=true;
        			  for(int j=i+1;j<n;j++)
        			  {
        				  e=false;
        				  if(arr[j]==0)
        				  {
        					  zerocount++;
        					  
        				  }
        				  else if(arr[j]>1)
        				  {
        					  long d=((zerocount)*(zerocount+1))/2;
        					  long l=(n-j+1)*d;
        					  count +=l;
        					  i=j;
        					  break;
        				  }
        				  else
        				  {
        					  long d=((zerocount)*(zerocount+1))/2;
        					  long s = 0;
        					  for(int k=j+1;k<n;k++)
        	        			{
        	        				if(arr[k]>0)
        	        				{
        	        					s=n-k;
        	        					break;
        	        				}
        	        			}
        					  long q=(s+1)*d;
        					  count +=q;
        					  i=j;
        					  break;
        					  
        				  }
        				  
        			  }
        			  if(e==true)
        				  count +=1;
        		}
        		
        	}
        
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
       
        System.out.println(count);
        	
        	}
            }
       
       

static int twopower(long n)
{
int count=0;
if(n%4==0)
count=2;
else if(n%2==0)
count=1;
return count;
}



         }
      
  