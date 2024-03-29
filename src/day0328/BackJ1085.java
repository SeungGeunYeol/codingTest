package day0328;

import java.util.Scanner;

public class BackJ1085 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int W = sc.nextInt();
        int H = sc.nextInt();

        int zeroMin =  Math.min(X, Y);

        int whMin = Math.min(W - X, H - Y);

        System.out.println(Math.min(zeroMin, whMin));

    }
}