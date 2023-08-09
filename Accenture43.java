import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Accenture43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(solve(s1,s2));
    }

    private static boolean solve(String s1, String s2) {
        Map<Character,Integer>count1=new HashMap<>();
        Map<Character,Integer>count2=new HashMap<>();
        if(s1.length()!=s2.length()) return false;
        for(char c:s1.toCharArray()){
            if(count1.containsKey(c)){
                count1.put(c,count1.get(c)+1);
            }else{
                count1.put(c,1);
            }
            
        }
        for(char c2:s2.toCharArray()){
            if(count2.containsKey(c2)){
                count2.put(c2,count2.get(c2)+1);
            }else{
                count2.put(c2,1);
            }
        }
        for(char letter:count1.keySet()){
            if(count1.get(letter)==count2.get(letter)){
                return true;
            }
        }
        return false;
    }
}
