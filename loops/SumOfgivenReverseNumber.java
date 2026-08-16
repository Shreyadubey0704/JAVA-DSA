import java.util.Scanner;

public class SumOfgivenReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int original = n;
        int rev = 0;
        int sum;

        while(n!=0){
            int lastdigit = n%10;
            rev= rev*10;
            rev = rev+lastdigit;
            n/=10;
             
        }
     
        System.out.println(rev);
           sum = rev + original;
           System.out.println(sum);

    }

    
}
