public class patternProblems {
    public static void main(String[] args) {
        System.out.println("Pattern1:-");
        pattern1(5);
        System.out.println("Pattern2:-");
        pattern2(5);
        System.out.println("Pattern3:-");
        pattern3(5);
        System.out.println("Pattern4:-");
        pattern4(5);
        System.out.println("Pattern5:-");
        pattern5(5);
        System.out.println("Pattern6:-");
        pattern6(5);
        System.out.println("Pattern7:-");
        pattern7(5);
        System.out.println("Pattern8:-");
        pattern8(5);
        System.out.println("Pattern9:-");
        pattern9(5);
       
    }
    private static void pattern1(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pattern3(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    /*
         *
        **
       ***
    */ 
    public static void pattern5(int n){
        for(int i=0;i<n;i++){
            for(int j=2*(n-i);j>2;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
    }
    private static void pattern6(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i*2;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pattern7(int n) {
        for(int i=0;i<n*2;i++){
            int col=i>n?2*n-i:i;
            for(int j=0;j<col;j++){
                System.out.print("* ");
            } 
            System.out.println();           
        }
        
    }
    private static void pattern8(int n){
        for(int i=0;i<n;i++){
            for(int j=n-i;j>1;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
    }
    private static void pattern9(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++) System.out.print("* ");
            System.out.println();
        }
    }

    }


