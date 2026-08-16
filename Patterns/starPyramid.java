package Patterns;

import java.util.Scanner;

public class starPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
    //     for(int i= 1;i<=n;i++){//lines
    //         for(int j=1;j<=n-i;j++){//space
    //             System.out.print(" " +" ");
    //         }
    //         for(int j=1;j<=2*i-1;j++){ // stars
    //             System.out.print("* " +" ");
    //         }
    //         System.out.println();

    //     }
    // method 2
    int nsp = n-1 , nst = 1;
    for(int i= 1;i<=n;i++){//lines
            for(int j=1;j<=nsp;j++){//space
                System.out.print(" " +" ");
            }
            for(int j=1;j<=nst;j++){ // stars
                System.out.print("*" +" ");
            }
            nsp--;
            nst +=2;
            System.out.println();

        }
    } 
    
}
