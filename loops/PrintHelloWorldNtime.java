package loops;

import java.util.Scanner;

public class PrintHelloWorldNtime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();

        //int i;

        for(int i = 1; i<=n;i++){
            System.out.println("hello world");
        }
    }

}
