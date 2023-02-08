package as1;

import java.util.*;
class assgn1{
public static void main(String args[])
{
  Scanner sc= new Scanner(System.in);
  int x=0,y=0;
  System.out.println("enter the number of Turn");
  int trn=sc.nextInt();
  for(int i=1;i<=trn;i++)
   {
	   switch(i%5)
	   {   
	        case 0:x=x+10*i;
		         break;
	        case 1:x=x+10*i;
		         break;
			case 2:y=y+10*i;
		         break;
	        case 3:x=x-10*i;
		         break;
	        case 4:y=y-10*i;
		         break;
	
	   }
	}
  System.out.println(" ( "+x+","+y+")");
}
}
