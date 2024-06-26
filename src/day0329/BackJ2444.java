package day0329;

import java.util.Scanner;

public class BackJ2444 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n-i-1; j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2*i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }

            for (int j =  2 * n - 3 - i * 2; j > 0; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
