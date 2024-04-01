package day0401;

import java.util.Scanner;

public class BackJ11721 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String st = scanner.nextLine();

        for (int i = 0; i < st.length(); i++) {
            System.out.print(st.charAt(i));

            if ((i + 1)  % 10 == 0) {
                System.out.println();
            }
        }

    }
}
