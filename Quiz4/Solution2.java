package Quiz4;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int n : arr) {
            if (isUnique(n)) {
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean isUnique (int n) {
        String number = Integer.toString(n);
        int length = number.length();
        int pointer = 0, repeat = 0;

        while (pointer < length) {
            int i = 1;

            while (i < length) {
                if (number.charAt(pointer) == number.charAt(i)) {
                    if (i != pointer) {
                        repeat++;
                    }
                }
                i++;
            }
            pointer++;
        }
        return repeat < 1;
    }
}

