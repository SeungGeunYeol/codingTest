package day0328;

import java.util.Scanner;

public class BackJ10872 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int val = 1;

        for (int i = 1; i <= N; i++) {
            val *= i;
        }

        System.out.println(val);
    }
}