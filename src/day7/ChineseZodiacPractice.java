package day7;

import java.util.Scanner;

public class ChineseZodiacPractice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] chineseZodiac =
                {"쥐", "소", "범", "토끼",
                        "용", "뱀", "말", "양",
                        "원숭이", "닭", "개", "돼지",};

        System.out.print("태어난 년도를 입력하세요: ");
        int year = s.nextInt();
        System.out.printf("띠: %s띠", chineseZodiac[(year + 8) % 12]);

        s.close();

    }
}
