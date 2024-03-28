package day0328;

import java.util.Scanner;

public class BackJ10797 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();

        int n = 0;

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == day) {
                n++;
            }
        }

        System.out.println(n);
    }
}