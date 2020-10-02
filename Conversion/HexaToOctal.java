package Conversion;

import java.util.*;

//this code written by ambesh kumar

//first we change hexaDecimal to decimal
//after we change decimal to Octal


public class HexaToOctal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter HexaDecimal number to convert into Binary number");
		 String s=sc.next();
		 
		 //here convert from hexaDecimal to decimal;
		 
		 String digits = "0123456789ABCDEF";
         s = s.toUpperCase();
         int val = 0;
         for (int i = 0; i < s.length(); i++)
         {
             char c = s.charAt(i);
             int d = digits.indexOf(c);
             val = 16*val + d;
        }
         
         //here change from decimal to octal;
         
         long n=val;
         long c=n;
    	 Stack<Integer> stack=new Stack<>();
    	 while(n!=0)
    	 {
    		 Integer rem=(int) (n%8);// stored remainder in stack using stack.push function;
    		 stack.push(rem);
    		 n=n/8;
    	 }
    	 System.out.println("Octal representation of the "+" "+c+" "+"is");
    	 while(!stack.isEmpty())
    	 {
    		 int p=stack.pop();// pop the stack and print the result;
    		 System.out.print(p);
    	 }
    		
	}

}
