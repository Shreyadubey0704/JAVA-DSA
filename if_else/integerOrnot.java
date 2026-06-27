package if_else;

import java.util.Scanner;

public class integerOrnot {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter number : ");
         double n = sc.nextDouble(); // n=3.144
         int x = (int)n; // x = 3
         if(n-x > 0) System.out.println("not integer");
         else System.out.println("interger");
    }
}
