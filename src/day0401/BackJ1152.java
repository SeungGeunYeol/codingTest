package day0401;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BackJ1152 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();

        System.out.println(new StringTokenizer(st, " ").countTokens());

    }
}
