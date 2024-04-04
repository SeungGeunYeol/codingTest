package day0404;

import java.util.Scanner;

public class BaekJ1712 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // 고정 비용 A, 가변 비용 B 한대는 1070만원 열대는 1000 + 70 * 10 = 1700만원
        // 가격 C, B가 증가하다 보면 총 수입이 총 비용 보다 많아진다.

        // ( C * 판매대수 ) = A + ( B * 판매대수 )
        // ( C - B ) * 판매대수 = A
        // 판매대수 = A / ( C - B )

        if (B >= C) {
            System.out.println("-1");
        } else {
            System.out.println(A / ( C - B) + 1);
        }

    }
}
