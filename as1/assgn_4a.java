package as1;

import java.util.Scanner;

public class assgn_4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v,w,x,y;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the total number of vehicles :");
		v=s.nextInt();
		System.out.println("Enter the total number of wheels :");
		w=s.nextInt();
		if(w>=2 && w%2==0 && v<w)
		{
			 y=w/2-v;
			 x=v-y;
			 System.out.println("TW="+x+" FW="+y);
		}
		else 
			System.out.println(" *********INVALID********** ");
		
			
	}
}