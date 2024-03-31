package day0331;

import java.util.Scanner;

public class BackJ1110 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = n;
        int count = 1;

        while (true) {
            int first = result / 10;

            int second = result % 10;

            int newNum = (first + second ) % 10;

            int num = second * 10 + newNum ;

            if (n == num) {
                break;
            } else {
                result = num;
                count++;
            }

        }

        System.out.println(count);
    }
}
