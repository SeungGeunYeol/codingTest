package day0402;

import java.util.Scanner;

public class BaekJ8958 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        for (int i = 0; i < A; i++) {
            int count = 0;
            int result = 0;
            char[] st = sc.next().toCharArray();

            for (int j = 0; j < st.length; j++) {
                if (st[j] == 'O') {
                    count++;
                } else {
                    count = 0;
                }
                result += count;

            }

            System.out.println(result);
        }


    }
}
