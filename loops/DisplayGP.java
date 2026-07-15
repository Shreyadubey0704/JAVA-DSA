package loops;

import java.util.Scanner;

// GP == Geometric Progression  गुणोत्तर a_n = a.r^{(n-1)
//यह संख्याओं का एक ऐसा अनुक्रम (sequence) होता है जिसमें हर अगला पद (term) अपने पिछले पद में एक खास संख्या से गुणा (multiply) करने पर आता है। इस खास संख्या को common ratio (सार्व अनुपात) कहा जाता है, जिसे आमतौर पर $r$ से दर्शाते हैं।
public class DisplayGP {
    public static void main(String[] args) {
         System.out.println("enter number");
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();

    // 1 2 4 8 16 32 ..........without formula
    
    int a= 1, r= 2;
    for(int i = 1;i<=n;i++){
        System.out.println(a+" ");
        a *=r;
    }

    }

}
