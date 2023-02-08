class Assignment9{
public static void main(String args[]){
    System.out.println("Enter the string: ");
    String s=new java.util.Scanner(System.in).nextLine();
    int c1=0,c2=0;
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)=='*')
            c1++;
        else
            c2++;
    }
    if(c1>c2)
        System.out.println("1");
    else if(c1<c2)
        System.out.println("-1");
    else
        System.out.println("0");   
}
}