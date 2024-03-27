package day0327;

import java.io.*;
import java.util.Scanner;

public class BackJ11720 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String nArr = sc.next();
        sc.close();

        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += nArr.charAt(i)-'0';
        }

        System.out.println(sum);


    }
}
