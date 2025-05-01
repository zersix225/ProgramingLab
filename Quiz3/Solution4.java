package Quiz3;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sowDays = sc.nextInt();
        int[][] data = new int[sowDays][3];
        int[][] field = new int[20][20];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = sc.nextInt();
            }
        }

        int tomato = 0;
        int leek = 0;
        int strawberry = 0;

        for (int sow = 0;  sow < sowDays; sow++) {
            int type = getData(data, sow, 0);
            int row = getData(data, sow, 1);
            int column = getData(data, sow, 2);

            int isRepeat = setRepeat(field, row, column);
            sowPosition(field, row, column, type);

            int fullyDay = switch (type) {
                case 1 -> (sow + 1) + 5;
                case 2 -> (sow + 1) + 3;
                case 3 -> (sow + 1) + 7;
                default -> 0;
            };

            if (sow > 0) {
                int prevType = getData(data, sow - 1, 0);
                if (isRepeat > 0) {
                     switch (prevType) {
                         case 1:
                             tomato -= isRepeat;
                             break;
                         case 2:
                             leek -= isRepeat;
                             break;
                         case 3:
                             strawberry -= isRepeat;
                             break;
                     }
                }
            }

            if (fullyDay <= 10) {
                if (type == 1){
                    tomato += 9;
                } else if (type == 2) {
                    leek += 9;
                } else if (type == 3){
                    strawberry += 9;
                }
            }
        }

        System.out.println(
                "Tomato:" + " " + tomato +
                "\nLeek:" + " " + leek +
                "\nStrawberry" + " " + strawberry
        );
    }

    static int getData(int[][] arr, int i, int j) {
        return arr[i][j];
    }

    static int setRepeat (int[][] field, int row, int column) {
        int count = 0;
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = column - 1; j <= column + 1; j++) {
                if (field[i][j] != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    static void sowPosition (int[][] field, int row, int column, int type) {
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = column - 1; j <= column + 1; j++) {
                field[i][j] = type;
            }
        }
    }
}
