package day0328;

import java.util.Scanner;

public class BackJ2884 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if (M < 45) {
            M += 15;
            H = (H > 0) ? --H : 23;
        } else {
            M -= 45;
        }

        System.out.println(H + " " + M);

    }
}