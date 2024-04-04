package day0404;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJ2920 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] newArr1 = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] newArr2 = {8, 7, 6, 5, 4, 3, 2, 1};

        if (Arrays.equals(arr, newArr1)) {
            System.out.println("ascending");
        } else if (Arrays.equals(arr, newArr2)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }


    }
}
