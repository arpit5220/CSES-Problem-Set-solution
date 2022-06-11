class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		
		long n=sc.nextInt();
		
	
		  while(n!=1)
		  {
		      if(n%2==0)
		      {
		           System.out.print(n+" ");
		          n=n/2;
		         
		      }
		      
		      else{
		           System.out.print(n+" ");
		         n=3 * n + 1;
		         
		      }
		  }
		   System.out.println("1"+" ");
		
	}
}
