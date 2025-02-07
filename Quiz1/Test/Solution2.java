package Quiz1.Test;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";

        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == '!' || c == '?') {
                count++;
            } else {
                count = 0;
            }

            if (count <= 1 || c == ' ') {
                result += c;
            }
        }
        sc.close();
        System.out.println(result);
    }
}
