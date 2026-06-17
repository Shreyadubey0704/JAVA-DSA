package Basic_Cheze;

import java.util.Scanner;

public class simpleinterst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter principle");
        double p = sc.nextDouble();
        System.out.println("enter rate");
        double r = sc.nextDouble();
        System.out.println("enter time");
        double t = sc.nextDouble();
        
        double si = p*r*t/100.0;
        System.out.println(si);
    }

}
