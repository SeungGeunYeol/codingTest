package day0405;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJ2587 {

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int mid = 0;
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);

        int avg = sum / 5;
        mid = arr[2];

        System.out.print(avg + "\n" + mid);
    }
}
