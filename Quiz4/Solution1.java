package Quiz4;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int costBanana = sc.nextInt();
        int money = sc.nextInt();
        int valueWants = sc.nextInt();
        
        int sum = 0;

        for (int i = 0; i <= valueWants; i++) {
            sum += i * costBanana;
        }

        int moneyBorrow = sum - money;
        System.out.println((moneyBorrow < 0)? "0" : moneyBorrow);
    }
}
