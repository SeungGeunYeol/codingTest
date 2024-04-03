package day0403;

import java.util.Scanner;

public class BaekJ5622 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();

        String[] arr = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

        int time = 0;

        for (int i = 0; i < st.length(); i++) {

            for (int j = 0; j < arr.length; j++) {
                if (arr[j].indexOf(st.charAt(i)) != -1) {
                    time += j + 2;
                    break;
                }
            }

            time += 1;
        }

        System.out.println(time);


    }
}