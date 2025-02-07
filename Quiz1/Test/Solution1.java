package Quiz1.Test;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();
        char ch [] = password.toCharArray();

        boolean valDigit = false;
        boolean valLower = false;
        boolean valUpper = false;
        boolean valSpecial = false;

        if (password.length() >= 8 && password.length() <= 15) {
            for (char c : ch) {
                if (Character.isDigit(c)) {
                    valDigit = true;
                }else if (Character.isUpperCase(c) && c >= 'A' && c <= 'Z') {
                    valUpper = true;
                }else if (Character.isLowerCase(c) & c >= 'a' && c <= 'z') {
                    valLower = true;
                }else if (
                    c == '@' || c == '#' || c == '%' || 
                    c == '&' || c == '!' || c =='$' || c == '*') {

                        valSpecial = true;
                }
            }
        }
        sc.close();

        if (valDigit && valLower && valUpper && valSpecial) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
