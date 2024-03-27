package day0327;

import java.util.Scanner;

public class BackJ5543 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int bg = Math.min(A, Math.min(B, C));

        int D = sc.nextInt();
        int E = sc.nextInt();

        int bev = Math.min(D, E);

        System.out.println(bg + bev - 50);
    }
}
