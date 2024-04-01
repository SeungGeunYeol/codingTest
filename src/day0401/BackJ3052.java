package day0401;

import java.util.Arrays;
import java.util.Scanner;

public class BackJ3052 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] st = new int[10];

        int[] newStArr = new int[10];

        for (int i = 0; i < st.length; i++) {
            st[i] = sc.nextInt();
            newStArr[i] = st[i] % 42;
        }

        System.out.println(Arrays.stream(newStArr).distinct().toArray().length);


    }
}
