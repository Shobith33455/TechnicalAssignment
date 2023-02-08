
import java.util.Scanner;
class Assignment7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();

        int ar[]=new int[n];

        for(int i=0,j=0;i<n;i++)
        {
            ar[i]=0;
            ar[j]=sc.nextInt();
            if(ar[j]!=0)
                j++;
        }

         for(int i=0;i<n;i++)
            System.out.print(ar[i]+" ");
    }

}