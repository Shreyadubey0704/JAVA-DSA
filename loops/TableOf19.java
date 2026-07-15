package loops;

public class TableOf19 {
    public static void main(String[] args) {

        // ye 172 times chl rha h
        // for(int i = 19;i<=190;i++){
        //     if(i%19==0){
        //         System.out.println(i);
        //     }

        // ye 10 times chl rha h 
        for(int i = 19;i<=190;i+=19){
            if(i%19==0){
                System.out.println(i);
            }
        }
    }

}
