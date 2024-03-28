package day0328;

import java.util.Scanner;

public class BackJ2562 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int val = 0;

        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
            if (val < arr[i]) {
                val = arr[i];
                count = i + 1;
            }
        }

        System.out.println(val);
        System.out.println(count);

    }
}