package day0403;

import java.util.Scanner;

public class BaekJ1978 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < N; i++) {
            int j;

            for (j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    break;
                }
            }


            if (arr[i] == j) {
                count++;
            }
        }

        System.out.println(count);


    }
}