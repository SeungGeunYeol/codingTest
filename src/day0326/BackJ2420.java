package day0326;

import java.util.Scanner;

public class BackJ2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        long M = sc.nextLong();

        System.out.println(Math.abs(N-M));
    }
}