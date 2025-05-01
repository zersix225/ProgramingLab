package Quiz4;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int state1 = sc.nextInt();
        int state2 = sc.nextInt();
        String trigger1 = sc.next();
        String trigger2 = sc.next();

        String newState = changeState(trigger1, trigger2, state1, state2);
        String result = switch (newState) {
            case "00" -> "NEUTRAL";
            case "01" -> "DnD";
            case "10" -> "MuR";
            default -> (trigger1.equals("1"))? "MuR" : "DnD";
        };

        System.out.println(result);
    }

    static String changeState(String t1, String t2, int s1, int s2) {
        boolean isClickT1 = t1.equals("1");
        boolean isClickT2 = t2.equals("1");

        if (isClickT1) {
            s1 = setState(s1);
        }
        if (isClickT2) {
            s2 = setState(s2);
        }

        String newS1 = Integer.toString(s1);
        String newS2 = Integer.toString(s2);

        return newS1 + newS2;
    }

    static int setState (int state) {
        switch (state) {
            case 0:
                state += 1;
                break;
            case 1:
                state -= 2;
                break;
        }
        return state;
    }
}