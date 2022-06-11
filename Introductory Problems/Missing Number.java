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
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int [] arr=new int[n-1];
		    for(int i=0;i<n-1;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    
		    int num=0;
		    for(int k:arr)
		    {
		        num+=k;
		    }
		    
		    int sum=(n*(n+1))/2;
		    
		    int missingnum=sum-num;
		    System.out.println(missingnum);
		}
		
		
	}
}
