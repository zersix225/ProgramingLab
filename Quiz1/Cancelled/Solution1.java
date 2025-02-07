package Quiz1.Cancelled;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numWord = sc.nextInt();
        sc.nextLine();
        String word = sc.nextLine().toLowerCase();
        sc.close();

        word = word.replace("to", "2")
                .replace("for", "4")
                .replace("a", "6")
                .replace("e", "3")
                .replace("i", "1")
                .replace("o", "0")
                .replace("s", "5");
        
        
        for (int i = 0; i < word.length(); i++) {
            if (!Character.isDigit(word.charAt(0))) {
                word = word.replace(word.charAt(0), 
                    Character.toUpperCase(word.charAt(0)));
            }

            if (word.charAt(i) == ' ' && i != 0 && !Character.isDigit(word.charAt(i))) {
                word = word.replace(word.charAt(i+1), 
                    Character.toUpperCase(word.charAt(i+1)));
            }
        }
        System.out.println(word);
    }
}