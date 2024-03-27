package day0327;

import java.util.Scanner;

public class BackJ10101 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A + B + C == 180) {
            if (A == B && B == C) {
                System.out.println("Equilateral");
            } else if (A == B || B == C || A == C) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
}
