import java.util.Scanner;

import Basic_Cheze.simpleinterst;

public class ternaryBasic {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();

        // if(n%2==0){
        //     System.out.println("even");
        // }
        // else System.out.println("odd");

     System.out.println(n+ " "+((n%2==0) ? "even" : "odd"));


    }
}
