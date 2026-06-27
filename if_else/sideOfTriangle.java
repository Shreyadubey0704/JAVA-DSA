import java.util.Scanner;

public class sideOfTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first side");
        int first = sc.nextInt();
        System.out.println("enter second side");
        int second = sc.nextInt();
        System.out.println("enter third side");
        int third = sc.nextInt();

        if (first + second > third && first + third > second && second + third > first ){
        
        System.out.println("valid triangle");
        }
        else {
            System.out.println("invalid");
        }
    }

}
