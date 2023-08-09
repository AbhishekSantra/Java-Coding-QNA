// 1 for camelCase: I am a good boy: iAmAGoodBoy
// 2 for kebab-case: I am a good boy: I-am-a-good-boy
// 3 for snake_case: I am a good boy: I_am_a_good_boy
// 4 for PascalCase: I am a good boy: IAmAGoodBoy

import java.util.Scanner;

public class Accenture49 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();
        System.out.println(solve(str,n));
    }

    private static String solve(String str, int n) {
        StringBuilder sb=new StringBuilder();
        String[] words=str.split(" ");
        switch (n) {
            case 1:
                for(int i=0;i<words.length;i++){
                    String word=words[i];
                    if(i==0){
                        word=word.isEmpty()?word:word.toLowerCase();
                    }else{
                        word=word.isEmpty()?word:Character.toUpperCase(word.charAt(0))+word.substring(1).toLowerCase();
                    }
                    sb.append(word);
                }
                return sb.toString();
            case 2:
                String kebab="";
                for(int i=0;i<words.length;i++){
                    kebab=str.replace(" ","-");
                }
                return kebab;
            case 3:
                String snake="";
                for(int i=0;i<words.length;i++){
                    snake=str.replace(" ","-");
                }
                return snake;
            case 4:
                for(int i=0;i<words.length;i++){
                    String word=words[i];
                    word=word.isEmpty()?word:Character.toUpperCase(word.charAt(0))+word.substring(1);
                    sb.append(word);
                }
                return sb.toString();
            default:
                return "Sorry";           
        }
                    
    }
}
