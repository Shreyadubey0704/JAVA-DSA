package loops;
// AP= Airthmetic progresstion   1, 3, 5, 7, 9, ...

//यहाँ हर अगली संख्या पिछली संख्या में 2 जोड़ने पर आ रही है
import java.util.Scanner;

public class DisplayAP {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();

// n th term find ==>a_n = a + (n - 1)d
        // for(int i= 1; i<=2*n-1;i+=2){
        //     System.out.print(i+ " ,");
        // }
// 4,7,10,13.........nth term is 3n+1 by the formula 
        //  for(int i= 4; i<=3*n+1;i+=3){
        //     System.out.print(i+ "  ,");
        // }
// without using nth term or without using formulas
        // 3,7,11,15...........
        int a= 3, d=4;
        for(int i= 1; i<=n;i++){
            System.out.print(a+ "  ,");
            a +=d;
        }


    }
}
