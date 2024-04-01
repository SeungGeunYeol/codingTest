package day0401;

import java.util.Scanner;

public class BackJ10810 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] nArr = new int[N];

        int M = sc.nextInt();

        for (int l = 0; l < M; l++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int m = i; m <= j; m++) {
                nArr[m - 1] = k;
            }

        }

        for (int i = 0; i < nArr.length; i++) {
            System.out.print(nArr[i] + " ");
        }


    }
}
