import java.util.Scanner;

public class sumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            
            int lastDigit = n%10;
            if(lastDigit%2==0){
            sum = sum + lastDigit;}
            n /= 10;
        }
        System.out.println(sum);
    }
    
}