import java.util.Scanner;
import java.lang.*;

public class ones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an unsigned integer: ");
        int n = scanner.nextInt();

        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }
        System.out.println("Number of 1 bits: " + count);
        scanner.close();
    }
}
