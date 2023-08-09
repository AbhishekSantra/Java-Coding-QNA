// Frequency of a number
public class Program10 {
    public static void main(String[] args) {
        int n=1240927292;
        int k=2;
        System.out.println(solve(n,k));
    }

    private static int solve(int n, int k) {
        int count=0;
        while(n!=0){
            int d=n%10;
            if(d==k){
                count++;
            }           
            n/=10; 
        }
        return count;
    }
}
