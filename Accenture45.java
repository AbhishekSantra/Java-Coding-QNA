/*Find the value of x.
 * Input:
 * 4*x + 12 = 28(String)
 * Output:
 * x=4
 */

public class Accenture45 {
    public static void main(String[] args) {
        String str="4*x - 12 = 24";
        System.out.println(solve(str));
    }

    private static int solve(String str) {
        int a=0,b=0,c=0;
        char op='+';
        for(int i=0;true;i++){
            if(str.charAt(i)=='*'){
                a=Integer.parseInt(str.substring(0, str.indexOf('*')));
            }
            else if(str.charAt(i)=='+'){
                b=Integer.parseInt(str.substring(str.indexOf('+')+2,str.indexOf('=')-1));
                op='+';
            }
            else if(str.charAt(i)=='-'){
                b=Integer.parseInt(str.substring(str.indexOf('-')+2,str.indexOf('=')-1));
                op='-';
            }
            if(str.charAt(i)=='='){
                c=Integer.parseInt(str.substring(str.indexOf('=')+2));
                break;
            }
        }
        int x;
        for(x=0;x<=9;x++){
            if(op=='+'){
                if(a*x+b==c){
                    break;
                }
            }
            else{
                if(a*x-b==c){
                    break;
                }
            }          
        }
        return x;
    }
}
