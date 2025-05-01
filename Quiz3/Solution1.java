package Quiz3;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();

        int newNum1 = reverse(num1);
        int newNum2 = reverse(num2);

        System.out.println(newNum1 + newNum2);
    }

    static int reverse(String num) {
        char[] ch = num.toCharArray();
        String numReversed = "";

        for (int i = ch.length - 1; i >= 0; i--) {
            numReversed += ch[i];
        }

        return Integer.parseInt(numReversed);
    }
}
