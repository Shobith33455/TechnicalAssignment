import java.util.Scanner;
class ArraySum{
    public static void main(String args[]){
    System.out.println("Enter number of testcases: ");
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    
    while(t--!=0){
    System.out.println("Enter number of elements in array1: ");
    int n1=sc.nextInt();

     System.out.println("Enter number of elements in array2: ");
    int n2=sc.nextInt();

    int a1[]=new int[n1];
    int a2[]=new int[n2];
     System.out.println("Enter elements in array1: ");
     int s1=0,s2=0;
    for(int i=0;i<n1;i++)
    {
        a1[i]=sc.nextInt();
        s1+=(a1[i]*Math.pow(10,i));
    }
    System.out.println("Enter elements in array2: ");
    for(int i=0;i<n2;i++)
    {
        a2[i]=sc.nextInt();
        s1+=(a2[i]*Math.pow(10,i));
    }

    String sum = Integer.toString(s1+s2);
 
        for (int i = sum.length()-1; i>=0; i--) 
 
            System.out.print(sum.charAt(i)+" ");
            System.out.println();

    }
}
}