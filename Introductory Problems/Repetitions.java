import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		 String str=sc.nextLine();
		 
// 		 if(str.length()==1)
// 		 {
// 		     System.out.println("1");
// 		 }
		 
		 int max=1;
		 int val=1;
		 for(int i=1;i<str.length();i++)
		 {
		     if(str.charAt(i)==str.charAt(i-1))
		     {
		         val++;
		        max=Math.max(max,val);
		     }
		     
		     else{
		         
		         max=Math.max(val,max);
		         val=1;
		     }
		 }
		 
		 System.out.println(max);
	}
}
