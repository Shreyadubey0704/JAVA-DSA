import java.util.Scanner;

public class printSumOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            int lastDigit = n%10;
            sum = sum + lastDigit;
            n /= 10;
        }
        System.out.println(sum);
    }

}

// Bas 3 cheezein yaad rakho ⭐

// n % 10 → last digit nikalta hai

// sum = sum + lastDigit → digit ko add karta hai

// n /= 10 → last digit hata deta hai