package day0326;

import java.util.Scanner;

public class BackJ2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] text = sc.nextLine().toCharArray();

        for (char temp : text) {
            if (temp >= 'a' && temp <= 'z') {
                System.out.print((char) (temp - 32));
            } else {
                System.out.print((char) (temp + 32));
            }
        }
    }
}
