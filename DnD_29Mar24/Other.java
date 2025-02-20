package DnD_29Mar24;

import java.util.Scanner;

public class Other {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numWords = sc.nextInt();
        sc.nextLine();

        String[] word = new String[numWords];
        String result = "";

        for (int i = 0; i < word.length; i++) {
            word[i] = sc.next().toLowerCase();

            for (int j = word[i].length() - 1; j >= 0; j--) {
                char currentChar = word[i].charAt(j);
                if (j == word[i].length() - 1) currentChar = Character.toUpperCase(currentChar);
                result += currentChar;
            }
            result += " ";
        }
        sc.close();
        System.out.println(result);
    }
}
