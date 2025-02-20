package DnD_29Mar24;
import java.util.Scanner;

class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numWords = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine().toLowerCase();

        String[] strSplit = str.split(" ");
        String result = "";

        for (int i = 0; i < numWords; i++) {
            String lower = "";
            String upper = "";

            for (int j = 0; j < strSplit[i].length(); j++) {
                char alphabet = strSplit[i].charAt(j);
                if (j % 2 == 0) {
                    upper += Character.toUpperCase(alphabet);
                }else {
                    lower += Character.toLowerCase(alphabet);
                }
            }
            result += lower + upper + " ";
        }
        System.out.println(result);
        sc.close();
    }
}
