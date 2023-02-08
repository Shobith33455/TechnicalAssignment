class Assignment11{
  public  double fact(int n)
    {
        double res=1;
         for(int i=n;i>=1;i--)
        {
            res=res*i;
        }
        return res;
    }

    public static void main(String args[]){
        System.out.println("Enter value of n:");
        int n=new java.util.Scanner(System.in).nextInt();
        double sum=0;
        Assignment11 A=new Assignment11();
        for(int i=1;i<=n;i++)
        {
            sum=sum+(Math.pow(-1,i+1)*(i/A.fact(i)));
        }
         System.out.println("Answer: "+sum);
    }
    

}