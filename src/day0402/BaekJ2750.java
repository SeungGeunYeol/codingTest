package day0402;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJ2750 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        int[] arr = new int[A];

        for (int i = 0; i < A; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i : arr) {
            System.out.println(i);
        }

    }
}
