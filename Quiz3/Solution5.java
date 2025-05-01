package Quiz3;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[20];
        int[] prime = new int[20];

        for (int i = 0; i < 20; i++) {
            nums[i] = sc.nextInt();
        }

        int index = 0;
        int count = 0;

        for (int num : nums) {
            if (isPrime(num)) {
                prime[index++] = num;
                count++;
            }
        }

        if (count < 1) {
            System.out.println("No prime pair found");
            return;
        }

        int minVal = Integer.MAX_VALUE;

        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                int minDistance = Math.abs(prime[i] - prime[j]);

                if (minDistance < minVal) {
                    minVal = minDistance;
                }
            }
        }

        System.out.println(minVal);
    }

    static boolean isPrime(int n) {
        if (n == 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
