class Assignment8{
public static void main(String args[]){
    System.out.println("Enter value of w: ");
    int w=new java.util.Scanner(System.in).nextInt();
    if(w<0)
        System.out.println("Invalid input");
    else if(w==0)
         System.out.println("Time estimated: 0 minutes");
    else if(w<=2000)
         System.out.println("Time estimated: 25 minutes");
    else if(w<=4000)
         System.out.println("Time estimated: 35 minutes");
    else if(w<=7000)
         System.out.println("Time estimated: 45 minutes");
    else
         System.out.println("Overloaded");
    
}
}