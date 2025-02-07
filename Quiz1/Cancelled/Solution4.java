package Quiz1.Cancelled;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0, n = sc.nextInt();
        String[] numbers = new String[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.next();
            char[] c = numbers[i].toCharArray();

            for (int j = 0; j < c.length - 1; j++) {
                if (c[j] == c[j + 1]){
                    count++;
                    break;
                }    
            }
        }
        sc.close();
        System.out.println(count);
    }
}
