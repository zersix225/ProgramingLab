package Quiz1.Cancelled;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pin = sc.nextLine();

        boolean isValid = false;

        if(pin.length() == 4 || pin.length() == 6) {
            isValid = true;

            for (int i = 0; i < pin.length(); i++) {
                if (Character.isDigit(pin.charAt(i))) {
                    isValid = false;
                    break;
                }
            }
        }

        System.out.println(isValid);
        sc.close();
    }
}
