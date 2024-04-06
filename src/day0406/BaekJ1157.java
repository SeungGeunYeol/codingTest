package day0406;

import java.util.Scanner;

public class BaekJ1157 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine().toUpperCase();

        int[] arr = new int[26];

        for (int i = 0; i < st.length(); i++) {
            arr[st.charAt(i) - 65]++;
        }

        int max = -1;
        char ch = '?';

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 65);
            } else if (arr[i] == max){
                ch = '?';
            }
        }

        System.out.println(ch);

    }
}
