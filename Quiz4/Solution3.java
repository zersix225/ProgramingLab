package Quiz4;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] contain = new int[size];

        for (int i = 0; i < contain.length; i++) {
            contain[i] = sc.nextInt();
        }

        int left = 0;
        int right = contain.length - 1;
        int max = 0;

        while (left != right) {
            int water = (right - left) * (Math.min(contain[left], contain[right]));

            if (contain[left] > contain[right]) {
                right--;
            } else {
                left++;
            }
            max = Math.max(water, max);
        }
        
        System.out.println(max);
    }
}
