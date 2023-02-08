package as1;
import java.util.*;
public class assgn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j, n;
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of characters:");
		n=s.nextInt();
		String a[][]=new String[n][n];
		System.out.println("Enter the CHARACTERS:");
	for( i=0;i<n;i++)
			for( j=0;j<n;j++)
				if(i==j)
					a[i][j]=s.next();
		
	
				for( i=0;i<=n-2;i++) 
				{
					
				
					for(j=0;j<=n-1;j++) 
					{ 
						if(i==j)
						{
							
							System.out.print(a[i][j]);
						
						}
						else
				
							System.out.print(" ");
					}

						for( j=n-2;j>=0;j--) 
						{ 
							if(i==j)
							{
								System.out.print(a[i][j]);
								
							}
							else
								
								System.out.print(" ");

							}
					
							System.out.println();
				}
				
			
		
		
		for( i=n-1;i>=0;i--) 
		{

			for(j=0;j<=n-1;j++) 
			{ 
				if(i==j)
				{
					
					System.out.print(a[i][j]);
				
				}
				else
		
					System.out.print(" ");
			}

			for( j=n-2;j>=0;j--) 
			{ 
				if(i==j)
				{
					System.out.print(a[i][j]);
					
				}
				else
					
					System.out.print(" ");

				}


			
			System.out.println();
		}
		
		
	}
}

