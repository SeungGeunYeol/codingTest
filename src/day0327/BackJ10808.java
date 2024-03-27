package day0327;

import java.util.Scanner;

public class BackJ10808 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[26]; //알파벳 갯수는 26개

        char[] temp = sc.next().toCharArray(); //String를 알파벳 하나씩의 배열로 바꿔 char 배열로 받는다.

        for (char c : temp) {
            A[c - 97]++;
        }

        for (int j : A) {
            System.out.print(j + " ");
        }
    }
}
