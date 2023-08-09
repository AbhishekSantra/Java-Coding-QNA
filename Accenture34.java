public class Accenture34 {
    public static void main(String[] args) {
        int n=10;
        System.out.println(solve(n));
    }
    private static int solve(int n){
        int count=0;
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6;j++){
                if(i+j==10){
                    count++;
                }
            }
        }
        return count;
    }
}
