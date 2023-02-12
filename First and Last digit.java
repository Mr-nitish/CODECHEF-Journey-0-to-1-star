import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc = new Scanner(System.in);
	  int t = sc.nextInt();
	  int sum=0,rem=0;
	  for(int i=0 ; i<t ; i++)
	  {
	      int a = sc.nextInt();
	      sum = a%10;
	      while(a>0)
	      {
	          rem = a%10;
	          a = a/10;
	      }
	      sum = sum+rem;
	      System.out.println(sum);
	  }
	}
}
