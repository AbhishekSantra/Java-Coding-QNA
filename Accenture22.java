import java.util.Scanner;

public class Accenture22 {
    public static void main(String[] args) {
        int a=4,b=9;
        fun(a,b);        
    }

    private static int fun(int a, int b) {
        if(a<b){
            return 1 + fun(a,b-2);
        } 
        if((a^b) > (a&b)){
            return a^b;
        }else{
            return a&b;
        }
        // return 1;
    }
    
}
