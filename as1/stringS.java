package as1;
import java.util.*;
public class stringS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S;
		int i=0,c1=0,c2=0,len;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string of * and #");
		try	
		{
		S=s.next();
		
		
		char sta[]=new char[10];
		
		sta=S.toCharArray();
		len=S.length();
		 for ( i = 0; i < len; i++)
		{
			if(sta[i]=='*')
				{
						c1++;
				}
			else if(sta[i]=='#')
				{
						c2++;
				}
			else System.out.println("Invalid");
			
		}
		if(c1>c2)
			System.out.println("Its possitive");
		else if(c1<c2)
			System.out.println("Its Negetive");
		else if(c1==c2)
			System.out.println("0");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
