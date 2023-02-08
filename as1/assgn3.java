package as1;

import java.util.Scanner;

public class assgn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,c,c1=0,c2=0,cp=0,i=0,j;
		System.out.println("Enter the number of scocks:");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		int ar[]=new int[num];
		System.out.println("Enter the  scocks:");
		if(num>=1 && num<=100)
		{
			for( i=0;i<=num-1;i++)
			{
				ar[i]=s.nextInt();
			}
		}
		
		int lst[]=new int[num];
		int lst1[]=new int[num];
		int lst2[]=new int[num];
		
		
		sk: for( i=0;i<=num-1;i++)
		{
			int srch;
			c=0;
			if(ar[i]>=1 && ar[i]<=100)
			{
					srch=ar[i];
			
					for( j=0;j<=i;j++)
					{
						if(lst[j]!=srch)
							continue ;
						else	
							continue sk;
					}
			// System.out.println(" "+srch);
					lst[i]=srch;
			
					for(  j=0;j<=num-1;j++)
					{
						// System.out.println("starting "+c);
						if(srch==ar[j])
							c++;
						//	else
						//System.out.println("wait "+c);
					}
					//	System.out.println("There are  "+c+" socks of "+srch);
		
						if(c%2==0)
						{
				
							lst1[i]=srch;
							c1=c1+c/2;
							
				
						}
						else
						{
				
							lst2[i]=srch;
							cp=cp+c/2;
							c2++;
						}
				}
		}
		System.out.println("The number of socks with pair :"+(c1+cp));
		 
		System.out.println("The number of socks without pair :"+c2+"\n They are :");
		 for(  j=0;j<num-1;j++)
		 {
			 System.out.print(" "+lst2[j]);
		 }
	}

}
