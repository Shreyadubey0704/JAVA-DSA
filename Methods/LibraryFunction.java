package Methods;

import java.util.Scanner;

public class LibraryFunction {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // double a = sc.nextDouble();
        // double b = sc.nextDouble();
        // double pow = Math.pow(a, b);
        
        //System.out.println(pow);
        
        // System.out.println(Math.pow(3.14,3.14));
        // System.out.println(Math.sqrt(16));
        // System.out.println(Math.cbrt(8));// cube root 
        // System.out.println(Math.abs(-6));
        // System.out.println(Math.floor(-3.14));
        // System.out.println(Math.min(3, 8));
        // System.out.println(Math.max(4, 6));

         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int  b = sc.nextInt();
         int  c = sc.nextInt();
         System.out.println(Math.max(a,Math.max(b,c)));
         
        }

}
