package as1;
import java.util.*;
public class assgn6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gm;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Value:");
		try
		{
		gm=s.nextInt();
	
		if(gm>=0)
		{
			if(gm==0)
				System.out.println("Time Estimated :0mins");
			 
			else if(gm<=2000)
				System.out.println("Time Estimated :25mins");
			 
			else if(gm<=4000)
				System.out.println("Time Estimated :35mins");
			
			else if(gm<=7000)
				System.out.println("Time Estimated :45mins");
			else 
				System.out.println(" OVERLODED ");
			
		}
	}catch(Exception e)
	{
		System.out.println(" INVALID INPUT ");
	}
		
			

	}

}
