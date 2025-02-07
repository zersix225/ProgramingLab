package Quiz1.Test;
import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt(), colums = sc.nextInt();

        int[][] result = new int[rows][colums];
        int nums = 1;

        //start
        result[0][0] = nums;
        int indexL = 0, indexR = 1;
        nums++;

        for (int i = 0; i < result.length; i++) {
            // downDiagonal
            while (indexL < result.length && indexR >= 0) {
                result[indexL][indexR] = nums;
                nums++;
                indexL++;
                indexR--;
            }

            //down
            if (indexR < 0) indexR = 0;
            if (indexL == result.length) indexL--;
            result[indexL][indexR] = nums;

            //upperDiagonal
            while (indexL >= 0) {
                result[indexL][indexR] = nums;
                nums++;
                indexL--;
                indexR++;
            }

            if (indexL < 0) indexL = 0;
            if (indexR == result.length) indexR = result.length - 1;
        }

        for (int[] numS : result) {
            for (int num: numS) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println(indexL +" "+indexR+" " +nums+ result.length);
    }
}
