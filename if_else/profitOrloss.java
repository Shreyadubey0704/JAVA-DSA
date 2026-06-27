import java.util.Scanner;

public class profitOrloss { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter CP");
        int cp = sc.nextInt(); // cost price
        System.out.println("enter sp");
        int sp = sc.nextInt(); // selling price
        
        if (sp > cp) System.out.println("profit is" +(sp -cp));
        if(sp == cp) System.out.println("no profit no loss");
        else System.out.println("loss is   " + (cp-sp));
    }
}


// also find profit % and loss %
