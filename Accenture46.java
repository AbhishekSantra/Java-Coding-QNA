/*Replace the value of x
 * input:
 * 2 + 15 = x
 * 22 + x = 145
 * output:
 * 17
 * 144
 */
public class Accenture46 {
    public static void main(String[] args) {
        System.out.println(solve("2 + 15 = x"));
        System.out.println(solve("22 + x = 145"));
    }

    private static int solve(String str) {
        int a,b;
        if(str.charAt(str.length()-1)=='x'){
            a=Integer.parseInt(str.substring(0,str.indexOf('+')-1));
            b=Integer.parseInt(str.substring(str.indexOf('+')+2,str.indexOf('=')-1));
            return a+b;
        }else{
            a=Integer.parseInt(str.substring(0,str.indexOf('+')-1));
            b=Integer.parseInt(str.substring(str.indexOf('=')+2));
            return b-a;
        }
    }
}
