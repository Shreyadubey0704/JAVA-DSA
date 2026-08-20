package Methods;

import Patterns.starDiamond;

public class MultipleFunction {

    public static void fun1() {
        fun2();
        System.out.println("HI,GOOD MORNING");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        fun3();
    }



    public static void main(String[] args) {
        System.out.println("yo yo");
        fun1();
        System.out.println("Gian");
       fun2();
        fun3();

    }
     public static void fun3(){
        System.out.println("kaisa h bro?");

    }
    public static void fun2(){
        System.out.println("good morning");
    }
   

}
