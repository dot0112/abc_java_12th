package assignment.d0725;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int kg, m;
        double bmi;
        String bmiStatus;

        System.out.printf("\n\uD83D\uDCA1 BMI 계산식:\n" +
                "BMI = 체중(kg) / (신장(m) * 신장(m))\n" +
                "\uD83D\uDCA1 판정 기준\n" +
                "BMI < 18.5: 저체중\n" +
                "18.5 ≤ BMI < 23: 정상\n" +
                "23 ≤ BMI < 25: 과체중\n" +
                "25 이상: 비만\n\n");

        System.out.print("체중을 입력하세요 (kg단위) : ");
        kg = s.nextInt();
        System.out.print("신장을 입력하세요 (cm단위) : ");
        m = s.nextInt();

        bmi = kg * 10000.0 / (m * m);

        if (bmi < 18.5) bmiStatus = "저체중";
        else if (bmi < 23) bmiStatus = "정상";
        else if (bmi < 25) bmiStatus = "과체중";
        else bmiStatus = "비만";

        System.out.printf("당신의 BMI는 %7.2f이며, '%s'입니다.\n", bmi, bmiStatus);

        s.close();
    }
}
