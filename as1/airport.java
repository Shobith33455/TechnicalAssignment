package as1;
import java.util.*;
public class airport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len;
		System.out.println("Enter the number of items :");
		Scanner s=new Scanner(System.in);
		len=s.nextInt();
		int a[]=new int[len];
		System.out.println("Enter the  items :");
		for(int i=0;i<=len-1;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		System.out.print("Elements after sorting based on risk severity\n");
		for(int i=0;i<=len-1;i++)
		{
			System.out.print(" "+a[i]);
		}

	}

}
