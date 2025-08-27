package d250819;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayListTest2 {
    /*
    int형 저장할 수 있는 리스트 생성
    반복적으로 정수 입력받아 리스트에 저장
    숫자가 아닌 값을 입력하면 반복 종료

    전체 입력받은 순자들의 평균보다 큰 값들만 출력
    */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        double avg;

        while (true) {
            try {
                System.out.print("정수 입력: ");
                int n = s.nextInt();
                list.add(n);
                sum += n;
            } catch (InputMismatchException e) {
                break;
            }
        }

        avg = sum / (double) list.size();

        System.out.printf("평균: %.2f\n평균보다 큰 값:\n", avg);
        for (int i : list) {
            if (i > avg) {
                System.out.printf("%d ", i);
            }
        }
        System.out.println("\n전체 배열 요소:");
        Collections.sort(list);
        for (int i : list) {
            System.out.printf("%d ", i);
        }
        s.close();
    }
}
