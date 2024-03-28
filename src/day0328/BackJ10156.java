package day0328;

import java.util.Scanner;

public class BackJ10156 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();

        System.out.println((K * N < M) ? 0 : K * N - M );
    }
}