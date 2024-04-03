package day0403;

import java.util.Scanner;

public class BaekJ2798 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int result = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int num = arr[i] + arr[j] + arr[k];

                    if (num <= M) {
                        result = Math.max(result, num);
                    }
                }


            }
        }

        System.out.println(result);

    }
}