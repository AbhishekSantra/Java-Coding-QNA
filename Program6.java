public class Program6 {
    public static void main(String[] args) {
        int n=1324;
        int temp =n;
        int count=0;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        int div=(int)Math.pow(10, count-1);
        while(n!=0){
            int q=n/div;
            System.out.println(q);
            n=n%div;
            div=div/10;
        }
    }
}
