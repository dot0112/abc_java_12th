package day3;

import java.util.Scanner;

public class Practice03 {

    /*
    문제 1. 금액을 입력받아 최소 화폐 개수를 구한다.
    결과 예시:
    >
    금액 : 67340
    50000원 : 1
    10000원 : 1
    5000원 : 1
    1000원 : 2
    500원 : 0
    100원 : 3
    50원 : 0
    10원 : 4
    67340원은 총 12개 필요
    */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("\n문제 1. 금액을 입력받아 최소 화폐 개수를 구한다.\n금액 : ");
        int[] coin = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        int count = 0, money, n, i;
        money = s.nextInt();
        for (i = 0; i < coin.length; i++) {
            n = ((i != 0) ? (money % coin[i - 1]) : money) / coin[i];
            count += n;
            System.out.printf("%d원 : %d\n", coin[i], n);
        }
        System.out.printf("%d원은 총 %d개 필요\n", money, count);

        s.close();
    }
}
