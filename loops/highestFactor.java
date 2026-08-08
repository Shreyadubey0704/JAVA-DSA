package loops;

import java.util.Scanner;

public class highestFactor {
    public static void main(String[] args) {
        System.out.println("enter factor");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hf = 1;
        // for (int i =1; i<n; i++){
        //     if(n%i==0) // i is a factor of n
        //         hf = i;
        // }
        // System.out.println(hf);

        // using break statement
        for(int i =n-1; i>=1; i--){
            if(n%i==0){
                hf = i;
                break;
            }
        }
        System.out.println(hf);
    }
}
