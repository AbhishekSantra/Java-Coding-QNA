import java.util.Scanner;
public class Accenture42 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String");
        String a = sc.nextLine();
        System.out.println("Enter 2nd String");
        String b = sc.nextLine();
        int count = 0;
        char ch[] = a.toCharArray();
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    if (i == b.indexOf(ch[i]))
                        count += 2;
                    else
                        count += 1;
                    break;    
                }
            }
        }
        System.out.println(count);
    }
}