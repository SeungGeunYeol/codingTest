package day0328;

import java.util.Scanner;

public class BackJ5554 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String st = sc.nextLine();
            if ( st.equals("#")) break;
            char[] stArr = st.toUpperCase().toCharArray();

            int count = 0;

            for (int i = 0; i < stArr.length; i++) {
                if (stArr[i] == 'A' || stArr[i] == 'E' || stArr[i] == 'I' || stArr[i] == 'O' || stArr[i] == 'U') {
                    count++;
                }
            }

            System.out.println(count);
        }


    }
}