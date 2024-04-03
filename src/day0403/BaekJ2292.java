package day0403;

import java.util.Scanner;

public class BaekJ2292 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;

        if (N == 1) {
            count = 1;
        } else {

            while (N > 1) {
                N = N - (6 * count);
                count++;
            }
        }

        System.out.println(count);


    }
}