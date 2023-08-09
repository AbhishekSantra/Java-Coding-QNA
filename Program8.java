// Inverse of a number
// eg,21453=23154
public class Program8 {
    public static void main(String[] args) {
        int n=21453;
        solve(n);
    }

    private static void solve(int n) {
        int invorted=0;
        int originalPosition=1;
        int invertedPosition;
        while(n!=0){
            int originalDigit=n%10;
            int invertedDigit=originalPosition;
            invertedPosition=originalDigit;
            invorted=invorted+invertedDigit*(int)Math.pow(10,invertedPosition-1);
            n/=10;
            originalPosition++;
        }
        System.out.println(invorted);        
    }    
}
