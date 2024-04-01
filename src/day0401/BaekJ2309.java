package day0401;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJ2309 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] intArr = new int[9];

        int sum = 0;

        int fd1 = 0, fd2 = 0;

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = sc.nextInt();
            sum += intArr[i];
        }

        Arrays.sort(intArr);

        for (int i = 0; i < intArr.length; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if (sum - intArr[i] - intArr[j] == 100) {
                    fd1 = intArr[i];
                    fd2 = intArr[j];
                }
            }
        }

        for (int i = 0; i < intArr.length; i++) {
            if ( fd1 == intArr[i] || fd2 == intArr[i]) continue;
            System.out.println(intArr[i]);
        }
    }
}
