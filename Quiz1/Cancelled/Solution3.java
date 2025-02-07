package Quiz1.Cancelled;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int years = sc.nextInt();
        int century = years / 100;

        if(years % 100 != 0) century += 1;

        String date = switch (century % 10) {
            case 1 -> "st";
            case 2 -> "nd";
            case 3 -> "rd";
            default -> "th";
        };

        System.out.println(century + date);
        sc.close();
    }
}
