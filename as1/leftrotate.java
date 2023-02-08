import java.util.Scanner;
class leftrotate{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int loc;
        int a[]=new int[n];
       for(int i=0;i<n;i++)
       {
        loc=Math.abs(i-p+n)%n;
        a[loc]=sc.nextInt();
        }
       for(int i=0;i<n;i++)
          System.out.print(a[i]+" ");
    }
}