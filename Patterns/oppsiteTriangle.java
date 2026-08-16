package Patterns;

import java.util.Scanner;

public class oppsiteTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int nsp = 0, nst = n;
        for (int i = 1; i <= n; i++) {// lines
            for (int j = 1; j <= nsp; j++) {// space
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nst; j++) { // stars
                System.out.print("*" + " ");
            }
            nsp++;
            nst --;
            System.out.println();

        }

    }
}
