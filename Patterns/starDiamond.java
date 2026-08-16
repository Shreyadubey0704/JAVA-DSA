package Patterns;

import java.util.Scanner;

public class starDiamond {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter n");
        int n = sc.nextInt();
        int nsp = n-1 , nst = 1;
    for(int i= 1;i<=n;i++){//lines
            for(int j=1;j<=nsp;j++){//space
                System.out.print("  " +"  ");
            }
            for(int j=1;j<=nst;j++){ // stars
                System.out.print("* " +"  ");
            }
            nsp--;
            nst +=2;
            System.out.println();

        }
        nsp =1;
        nst = 2*n-3;
        for(int i= 1;i<=n-1;i++){
            for(int j= 1; j<=nsp;j++){
                System.out.print("  "+"  ");//space
            }
            for(int j=1;j<=nst;j++){
                System.out.print("* "+"  ");//stars
            }
            nsp++;
            nst -=2;
            System.out.println();
        }
    }         
    }
    
 
