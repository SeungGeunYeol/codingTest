package day0331;

import java.util.Scanner;

public class BackJ1546 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += (double) arr[i] / max * 100;
        }

        System.out.println(sum / arr.length);
    }
}
