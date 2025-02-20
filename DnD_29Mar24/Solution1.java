package DnD_29Mar24;
import java.util.Scanner;

public class Solution1 {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        int century = input / 100;
        if ((input % 100) > 0) century++;

        String suffix = null;

        if ((century % 100) > 10 && (century % 100) <= 13){
            suffix = "th";
        } else {
            suffix = switch (century % 10) {
                case 1 -> "st";
                case 2 -> "nd";
                case 3 -> "rd";
                default -> "th";
            };
        }

        System.out.println(century + suffix);
        sc.close();
    }
}
