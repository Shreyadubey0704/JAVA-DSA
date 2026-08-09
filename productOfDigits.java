import java.util.Scanner;

public class productOfDigits {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int product = 1;
        while (n != 0) {
            int lastDigit = n%10;
            product= product* lastDigit;
            n /= 10;
        }
        System.out.println(product);
    }

    }
    
