// Rotate a number
// 2341229=2923412
public class Program9 {
    public static void main(String[] args) {
        int n=2341229;
        int k=2;
        int sum=0;
        int temp=n;
        int count=0;
        while(temp!=0){
            temp/=10;
            count++;        
        }
        int r=n%(int)Math.pow(10, k);
        sum=r*(int)Math.pow(10,count-k);
        n=n/(int)Math.pow(10,k);
        System.out.println(sum+n);
        
    }
}
