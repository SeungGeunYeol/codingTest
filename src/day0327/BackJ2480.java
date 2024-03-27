package day0327;

import java.io.*;
import java.util.Scanner;

public class BackJ2480 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A == B && B == C) {
            System.out.println(10000 + (A * 1000));
        } else if (A == B || B == C || A == C) {
            if (A == B) {
                System.out.println(1000 + (A * 100));
            } else {
                System.out.println(1000 + (C * 100));
            }
        } else {
            int max = Math.max(Math.max(A, B), C);

            System.out.println(max * 100);
        }

    }
}
