package DnD_29Mar24;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt(), 
            size = sc.nextInt(), 
            elements[] = new int[size];


        for (int i = 0; i < size; i++) {
            elements[i] = sc.nextInt();
        }

        for (int i = 0; i < size - target; i++) {
            int temp = elements[i];
            elements[i] = elements[i + target];
            elements[i + target] = temp;
        }
        sc.close();

        System.out.print("Answer: ");
        for (int nums : elements) {
            System.out.print(nums + " ");
        }
    }
}
