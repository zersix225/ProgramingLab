package Quiz3;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next().toLowerCase();
        boolean isLexical = false;

        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length() - 1; j++) {
                if (s.charAt(i) < s.charAt(j)) {
                    isLexical = true;
                } else {
                    isLexical = false;
                }
            }
        }

        System.out.println(isLexical);
    }
}
