//Decimal to any base
public class Program11 {
    public static void main(String[] args) {
        int num=634;
        int b=8;
        System.out.println(DecimalToAny(num,b));
        System.out.println(AnyToDecimal(1172,8));
    }

    private static int DecimalToAny(int n, int b) {
        int count=0;
        int p=1;
        while(n!=0){
            int d=n%b;
            n=n/b;
            count+=d*p;
            p*=10;
        }
        return count;
    }
    private static int AnyToDecimal(int n, int b) {
        int count=0;
        int p=1;
        while(n!=0){
            int d=n%b;
            n=n/10;
            count+=d*p;
            p*=b;
        }
        return count;
    }
}
