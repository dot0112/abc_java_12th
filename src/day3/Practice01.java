package day3;

import java.util.Scanner;

public class Practice01 {

    /*
    예제 1. 타수와 안타수를 변수에 저장하고 타율을 계산하세요 (타수: 10, 안타: 1)
    결과 예시: (타율이 0.345로 나왔을 때)
    >
    타수  : 1000
    안타  : 345
    타율  : 0.345
    3할4푼5리

    예제 2. 타수와 안타수를 입력받고 타율을 계산하세요
    결과 예시: (타율이 0.179로 나왔을 때)
    >
    타수  : 55555
    안타  : 9955
    타율  : 0.179
    1할7푼9리
    */

    static void calBA(int ab, int h) {
        double dBA = h / (double) ab;
        System.out.printf("타수\t: %d%n안타\t: %d%n타율\t: %.3f%n%d할%d푼%d리%n",
                ab, h, dBA,
                (int) (dBA / 0.1),
                (int) ((dBA % 0.1) / 0.01),
                (int) ((dBA % 0.01) / 0.001), dBA);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int iAB = 1000, iH = 345;
        System.out.println("\n예제 1. 타수와 안타수를 변수에 저장하고 타율을 계산하세요 (타수: 1000, 안타: 345)");
        calBA(iAB, iH);

        System.out.println("\n예제 2. 타수와 안타수를 입력받고 타율을 계산하세요");
        System.out.print("타수를 입력해주세요: ");
        iAB = s.nextInt();
        System.out.print("안타수를 입력해주세요: ");
        iH = s.nextInt();
        calBA(iAB, iH);

        s.close();
    }
}