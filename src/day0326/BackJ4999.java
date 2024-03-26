package day0326;

import java.util.Scanner;

public class BackJ4999 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String st = scanner.nextLine();

        String doc = scanner.nextLine();

        if (st.length() < doc.length()) {
            System.out.println("no");
        } else {
            System.out.println("go");
        }
    }
}
