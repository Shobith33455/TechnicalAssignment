import java.util.Scanner;
class ArrayReverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
       for(int in=0;in<n;in++)
       {
        a[in]=sc.nextInt();
       }
int temp;
int i,j;
    for(i=0,j=n-1;i<j;i++,j--)
    {
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        
    }

       for(int in=0;in<n;in++)
          System.out.print(a[in]+" ");
    }
}