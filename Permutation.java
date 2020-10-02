package hello;
import java.io.*; 

class Permutation { 
	static long count=0;
 
    static void combinationUtil(int arr[], int n, int r, 
                          int index, int data[], int i,int m) 
    { 
    	int sum=0;
        if (index == r) { 
            for (int j = 0; j < r; j++)
            {
            	sum +=data[j];
        }
            if(sum%m==0)
          	  count=count+fact(r);
            System.out.println(""+count); 
            return; 
        }
            
       
  
        // When no more elements are there to put in data[] 
        if (i >= n) 
            return; 
  
        // current is included, put next at next 
        // location 
        data[index] = arr[i]; 
        combinationUtil(arr, n, r, index + 1,  
                               data, i + 1,m); 
  
        // current is excluded, replace it with 
        // next (Note that i+1 is passed, but 
        // index is not changed) 
        combinationUtil(arr, n, r, index, data, i + 1,m); 
    } 
  
    private static long fact(int r) {
            long fact=1;
            for(int i=2;i<=r;i++)
             fact *=i;
		return fact;
	}

	// The main function that prints all combinations 
    // of size r in arr[] of size n. This function  
    // mainly uses combinationUtil() 
    static void printCombination(int arr[], int n, int r,int m) 
    { 
        // A temporary array to store all combination 
        // one by one 
        int data[] = new int[r]; 
  
        // Print all combination using temprary 
        // array 'data[]' 
        combinationUtil(arr, n, r, 0, data, 0,m); 
    } 
  
    /* Driver function to check for above function */
    public static void main(String[] args) 
    { 
        int arr[] = { 1, 2, 3, 4, 5 }; 
        int r = 3; 
        int n = arr.length;
        int m=3;
        for(int i=0;i<n;i++)
        {
        	long k=r*arr[i];
        	if(k%m==0)
        		count++;
        }
        printCombination(arr, n, r,m); 
    } 
} 