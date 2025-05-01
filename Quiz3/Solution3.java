package Quiz3;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        double slantheight = sc.nextDouble();
        double basewidth = sc.nextDouble();
        Pyramid p = new Pyramid(height, slantheight, basewidth);
        System.out.println("Volume: " + p.getVolume());
        System.out.println("Surface area: " + p.getArea());
    }

    static class Pyramid {
        //put your code here
        double height;
        double slantHeight;
        double baseWidth;

        public Pyramid (double height, double slantHeight, double baseWidth) {
            this.height = height;
            this.slantHeight = slantHeight;
            this.baseWidth = baseWidth;
        }

        public double getVolume() {
            double baseArea = baseWidth * baseWidth;
            return baseArea * height / 3;
        }

        public double getArea() {
            double sumFaces = ((baseWidth * slantHeight) / 2) * 4;
            double baseArea = baseWidth * baseWidth;
            return baseArea + sumFaces;
        }
    }
}
