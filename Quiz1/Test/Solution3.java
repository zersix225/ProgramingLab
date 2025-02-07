package Quiz1.Test;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] numbers = new String[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.next();
            char[] c = numbers[i].toCharArray();
            String result = "";

            for (int j = c.length - 1; j >= 0; j--) {
                result += c[j];
            }

            if (numbers[i].equals(result)) count++;
        }
        sc.close();
        System.out.println(count);
    }
}
