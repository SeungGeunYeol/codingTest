package day0329;

import java.util.Scanner;

public class BackJ10988 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] st = sc.next().toCharArray();

        for (int i = 0; i < st.length/2; i++) {
            if (!(st[i] == st[st.length - i - 1])) {
                System.out.println(0);
                return;
            }
        }

        System.out.println(1);


    }
}
