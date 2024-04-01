package day0401;

import java.util.Arrays;
import java.util.Scanner;

public class BackJ10809 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] charArr = sc.next().toCharArray();

        int[] intArr = new int[26];

        Arrays.fill(intArr, -1);

        for (int i = 0; i < charArr.length; i++) {
            if (intArr[(int) charArr[i] - 97] == -1) {
                intArr[(int) charArr[i] - 97] = i;
            }
        }

        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }


    }
}
