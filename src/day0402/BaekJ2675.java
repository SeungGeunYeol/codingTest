package day0402;

import java.util.Scanner;

public class BaekJ2675 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int R = sc.nextInt();
            char[] st = sc.next().toCharArray();

            for (int j = 0; j < st.length; j++) {
                for (int k = 0; k < R; k++) {
                    System.out.print(st[j]);
                }

            }

            System.out.println();

        }
    }
}
