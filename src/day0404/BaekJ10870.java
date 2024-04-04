package day0404;

import java.util.Scanner;

public class BaekJ10870 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(fibonacci(n));

    }

    static int fibonacci(int n) {
        if (n < 2) return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
