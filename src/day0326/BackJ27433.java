package day0326;

import java.util.Scanner;

public class BackJ27433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(fact(sc.nextLong()));
    }

    static long fact(Long n) {
        if (n == 0) return 1;
        return n * fact(n - 1);
    }
}
