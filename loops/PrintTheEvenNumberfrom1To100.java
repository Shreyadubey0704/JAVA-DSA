package loops;

public class PrintTheEvenNumberfrom1To100 {
    
    public static void main(String[] args) {
        for(int i = 1;i<=100; i++){
            if(i%2==0){
                //if(i%2==1) this for odd number from 1 to 100
                System.out.println(i);
            }
        }
    }
}
