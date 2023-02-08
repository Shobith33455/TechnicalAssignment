package as1;

import java.util.Scanner;

public class assgn_4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,prd=1,rem;
		System.out.print("Enter the value of N =");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		while(num!=0)
		{
			rem=num%10;
			prd=prd*rem;
			num=num/10;
		}
		System.out.println("\nThe Price of the Item is ="+prd);

	}

}
