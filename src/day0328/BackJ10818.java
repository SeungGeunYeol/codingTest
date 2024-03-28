package day0328;

import java.util.Scanner;

public class BackJ10818 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int max = -1000001;
        int min = 1000001;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();

            if (val > max) {
                max = val;
            }

            if (val < min) {
                min = val;
            }
        }

        System.out.println(min + " " + max);

    }
}