package day0327;

import java.util.Scanner;

public class BackJ10039 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int point = sc.nextInt();
            if (point < 40) {
                point = 40;
            }
            sum += point;
        }

        System.out.println(sum / 5);


    }
}
