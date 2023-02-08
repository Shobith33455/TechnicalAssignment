import java.util.Scanner;
class majority{
    public static void main(String args[]){
        int temp,count=0,max=0,num=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of digits:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the "+n+" digits:");
       for(int i=0;i<n;i++)
       {
        a[i]=sc.nextInt();
       }
        
        
       for(int i=0;i<n-1;i++)
          {
            temp=a[i];
            count=0;

            for(int j=i+1;j<n;j++)
            {
                if(a[j]==temp)
                {
                    count++;
                }
            }
            if(count>max)
            {
                max=count;
                num=a[i];
            }
          }
          if(num==0)
          System.out.println("All the digits have occoured same number of times..");
          else
          System.out.println(num +" is max");

    }
}