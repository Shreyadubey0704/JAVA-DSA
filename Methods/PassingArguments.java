package Methods;

public class PassingArguments {

    public static void greet(String name){
        System.out.println("good morning "+name);
    }


    public static void main(String[] args) {
       // sum(2,6);
        greet("Shreya");
        greet ("Khushi");
        intro("honey",20);
        intro("preeti",27);
        
    }
    
    // public static void sum(int a , int b){
    //    
    
    public static void intro(String name , int age ){
        System.out.println("hello "+name+"your age is"+age);
    }
}
