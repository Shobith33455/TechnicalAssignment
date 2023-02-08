class Palindrome{
    public static void main(String args[]){
        System.out.println("Enter the string: ");
        String str=new java.util.Scanner(System.in).nextLine();
        char temp[]=str.toCharArray();
        int len=str.length();
        for(int i=0;i<len;i++)
        {
           if(temp[i]!=temp[len-1-i])
           {
           System.out.println("Not a palindrome");
           return;
           }
        }
            System.out.println("Palindrome");
            
    }
}