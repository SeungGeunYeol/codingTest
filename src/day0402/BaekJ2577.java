package day0402;

import java.util.Scanner;

public class BaekJ2577 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int result = A * B * C;

        String st = String.valueOf(result);

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < st.length(); j++) {
                if ((st.charAt(j) - '0') == i) {
                    count++;
                }
            }
            System.out.println(count);
        }



    }
}
