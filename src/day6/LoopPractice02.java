package day6;

import java.util.Scanner;

public class LoopPractice02 {

    /*
    정수 두 개를 입력받아 시작값과 끝값으로서 "start ~ end의 합계는 sum 이다"를 출력하세요
    끝값이 시작값보다 작게 입력하면 "end 부터 start 까지의 합계는 sum 이다"로 출력되게 하세요!
    */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("\n두 개의 정수를 입력해주세요: ");
        int nMax = s.nextInt(), nMin = s.nextInt(), sum, i;
        boolean f = false;

        if (nMax < nMin) {
            f = true;
            int tmp = nMax;
            nMax = nMin;
            nMin = tmp;
        }

        for (i = nMin, sum = 0; i <= nMax; sum += i++) ;

        System.out.println("\n[출력1]");
        if (f) {
            System.out.printf("%d 부터 %d 까지의 합계는 %d 입니다", nMin, nMax, sum);
        } else {
            System.out.printf("%d ~ %d 의 합계는 %d 입니다", nMin, nMax, sum);
        }

        System.out.println("\n\n[출력2]");
        System.out.printf("%d ~ %d 의 합계는 %d 입니다\n", nMin, nMax, sum);

        s.close();
    }
}
