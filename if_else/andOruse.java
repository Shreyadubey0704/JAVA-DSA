import java.util.Scanner;

public class andOruse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter number");
        int n = sc.nextInt();

        if(n>999 && n<10000){   // && both condition is true
            System.out.println("fourdigit numbrt");
        }
        else {
            System.out.println("not fourdigit number");
        }
        }

}
