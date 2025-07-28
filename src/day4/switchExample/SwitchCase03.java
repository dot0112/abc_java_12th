package day4.switchExample;

import java.util.Scanner;

public class SwitchCase03 {

    /*
    1, 3, 5, 7, 8, 10, 12 -> 31
    4, 6, 9, 11 -> 30
    2 -> 28
    */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int month = -1, day;

        day = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> {
                if (month < 1 || month > 12) {
                    System.out.println("없는 달입니다.");
                } else {
                    System.out.println("알수없는오류입니다.");
                }
                yield 0;
            }
        };

        System.out.println(month + "월의 날짜는 " + day + "일까지 있습니다.");
        s.close();
    }
}
