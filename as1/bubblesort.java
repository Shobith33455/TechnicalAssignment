import java.util.Scanner;
class bubblesort{
    public static void main(String args[])
    {
        int n;
        System.out.println("Enter n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
         System.out.println("Enter array elements:");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
             a[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    a[i]=a[i]+a[j]-(a[j]=a[i]);
                    count++;
                }
            }
        }
        System.out.println("Sorted array..");
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
        System.out.println();
        System.out.println("Array is sorted in "+count+" steps");
        System.out.println("First element is "+a[0]);
        System.out.println("Last element is "+a[n-1]);

    }
}