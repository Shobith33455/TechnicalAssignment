package as1;
import java.util.*;
import java.lang.*;
public class swapvowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String v;
		char temp;
		char vo[]=new char[10];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String:");
		v=s.next();
		
		v=v.toLowerCase(Locale.ENGLISH);
		vo=v.toCharArray();
		
		int l=v.length();
		int c=l-1;
		for(int i=0;i<=l-1;i++)
		{
			System.out.print(" "+vo[i]);
		}
		System.out.println();
		for(int i=0;i<=(l-1);i++)
		{
			//System.out.println(" cahr:"+vo[i]);
			int cn=0;
			if(i<c)
			{
			if(vo[i]=='i' || vo[i]=='o' ||vo[i]=='a' || vo[i]=='e' ||vo[i]=='u')
			{
				 
				
				for( c=l-1;c>=0;c--)
				
				{
					if(cn==0)
					{
						if(vo[c]=='i' || vo[c]=='o' ||vo[c]=='a' || vo[c]=='e' ||vo[c]=='u')
						{
							temp=vo[i];
							vo[i]=vo[c];
							vo[c]=temp;
							cn++;
					
						}
						/*else {
						c--;
					
				      	continue re;
						}*/
					}
				//	else
					//	System.out.println(" "+cn);
				}
			}
			//else
				//System.out.println("\n no"+i);
			
		
				
			}
			
			
		}
		String str=new String();
		String st= str.copyValueOf(vo); 
		System.out.println(st);
	}

}
