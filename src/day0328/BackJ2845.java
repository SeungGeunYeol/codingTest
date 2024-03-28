package day0328;

import java.util.Scanner;

public class BackJ2845 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int P = sc.nextInt();

        int n = P * L;

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt() - n;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}