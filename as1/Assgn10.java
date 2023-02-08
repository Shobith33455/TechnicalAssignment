import java.util.Scanner;
class Assignment10{
public static void main(String args[]){
    System.out.println("Enter N: ");
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int ar[]=new int[N];
    int temp;
    for(int i=0;i<N;i++)
    {
        ar[i]=sc.nextInt();
        if(ar[i]<1 || ar[i]>2)
        {
            System.out.println("Invalid input");
            return;
        }
    }
    for(int i=0;i<N;i++)
    {
        for(int j=0;j<N-i-1;j++)
        {
            if(ar[j]>ar[j+1])
            {
                temp=ar[j];
                ar[j]=ar[j+1];
                ar[j+1]=temp;
            }
        }
    }  
for(int i=0;i<N;i++)
    {
       System.out.print(ar[i]+" ");
    }
}
}