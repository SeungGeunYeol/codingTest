package day0326;

import java.util.Scanner;

public class BackJ9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {
            String st = sc.nextLine();

            String result = st.charAt(0) + "" + st.charAt(st.length() - 1);

            System.out.println(result);


        }


    }
}
