package as1;

import java.util.Scanner;

public class assgn_5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N,i,count=0;
		System.out.println("Enter the value of N :");
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		int ary[]=new int[N];
		int a[]=new int[N];
		
		System.out.println("Enter the  array elements :");
		for( i=0;i<=N-1;i++)
		{
			ary[i]=s.nextInt();
		}
		/*System.out.print("The packtes in array are:\n[");
		for( i=0;i<=N-1;i++)
		{
			System.out.print(ary[i]+",");
		}
		System.out.println("]");*/
		i=0;
	
		while(i<N)
		{
	
			if(ary[i]!=0) 
			{
				a[count]=ary[i];
				
				count++;
			}
		
			i++;
	
		}
		//System.out.println(count);
		for( i=count;i<=N-1;i++)
		{
			a[count]=0;
		}
		
		System.out.print("The packtes in array after finding empty packets:\n[");
		for( i=0;i<=N-1;i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println("]");
		

	}

}
