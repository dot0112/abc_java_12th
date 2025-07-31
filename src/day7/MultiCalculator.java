package day7;

import java.util.Scanner;

public class MultiCalculator {
    static Scanner s = new Scanner(System.in);

    /**
     * 태어난 해를 입력받고 윤년 계산, 출력을 하는 메서드
     */
    static void leapYear() {
        System.out.print("\n태어난 해가 윤년인지 확인하여 결과를 출력하세요\n태어난 해를 입력해주세요: ");
        int year = s.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) System.out.println("윤년입니다");
        else System.out.println("평년입니다");
    }

    /**
     * 키와 몸무게를 입력받고 BMI 지수를 계산, 출력하는 메서드
     */
    static void bmiCalculator() {
        int kg;
        double bmi, m;
        String bmiStatus;

        System.out.print("""
                
                \uD83D\uDCA1 BMI 계산식:
                BMI = 체중(kg) / (신장(m) * 신장(m))
                \uD83D\uDCA1 판정 기준
                BMI < 18.5: 저체중
                18.5 ≤ BMI < 23: 정상
                23 ≤ BMI < 25: 과체중
                25 이상: 비만
                
                """);

        System.out.print("체중을 입력하세요 (kg단위) : ");
        kg = s.nextInt();
        System.out.print("신장을 입력하세요 (cm단위) : ");
        m = s.nextInt() / 100.0;

        bmi = kg / (m * m);

        if (bmi < 18.5) bmiStatus = "저체중";
        else if (bmi < 23) bmiStatus = "정상";
        else if (bmi < 25) bmiStatus = "과체중";
        else bmiStatus = "비만";

        System.out.printf("당신의 BMI는 %7.2f이며, '%s'입니다.\n", bmi, bmiStatus);
    }

    /**
     * 각 항과 사칙연산 부호를 입력받고 결과를 출력하는 메서드
     */
    static void calculator() {
        int lhs, rhs;
        char op;
        String oFormat = "결과: ";

        System.out.print("\n첫 번재 숫자: ");
        lhs = s.nextInt();
        System.out.print("두 번재 숫자: ");
        rhs = s.nextInt();
        System.out.print("연산 기호를 입력하세요: ");
        op = s.next().charAt(0);

        Object result = switch (op) {
            case '+' -> {
                oFormat += "%d";
                yield lhs + rhs;
            }
            case '-' -> {
                oFormat += "%d";
                yield lhs - rhs;
            }
            case '*' -> {
                oFormat += "%d";
                yield lhs * rhs;
            }
            case '/' -> {
                if (rhs == 0) {
                    oFormat = "0으로 나눌 수 없습니다.";
                    yield null;
                } else {
                    oFormat += "%.2f";
                    yield lhs / (double) rhs;
                }
            }
            default -> {
                oFormat = "지원하지 않는 연산입니다.";
                yield null;
            }
        };

        System.out.printf(oFormat + '\n', result);
    }

    /**
     * 구구단 표를 출력하는 메서드
     */
    static void multiplication() {
        int dan, times;
        for (dan = 2; dan <= 9; dan++) {    // 1단부터 9단까지 반복하는 외부 반복문
            for (times = 1; times <= 9; times++)    // 각 단에서 1~9를 곱하는 내부 반복문
                System.out.println(dan + " X " + times + " = " + (dan * times));
            System.out.println("-----------------------");  // 각 단 사이 구분
        }
    }

    /**
     * 정수 값을 입력받고 합계를 출력하는 메서드
     */
    static void accumulate() {
        int sum, i, n = -1;

        System.out.println();
        for (sum = 0, i = 1; n != 0; ) {
            System.out.printf("정수%d 입력: ", i++);
            n = s.nextInt();
            sum += n;
        }
        System.out.printf("합계: %d\n", sum);

    }

    /**
     * 생년을 입력받고 띠를 출력하는 메서드
     */
    static void chineseZodiac() {
        String[] chineseZodiac =
                {"쥐", "소", "범", "토끼",
                        "용", "뱀", "말", "양",
                        "원숭이", "닭", "개", "돼지",};

        System.out.print("\n태어난 년도를 입력하세요: ");
        int year = s.nextInt();
        System.out.printf("띠: %s띠\n", chineseZodiac[(year + 8) % 12]);
    }

    /**
     * 성적을 입력받고 평균과 등급을 출력하는 메서드
     */
    public static void gradeCal() {
        int[] scores = new int[3];
        int sum = 0;
        double avg;

        System.out.print("\n성적을 입력하세요 (국어, 영어, 수학): ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = s.nextInt();
            sum += scores[i];
        }

        avg = sum / (double) scores.length;

        System.out.println();

        System.out.print("과목:\t");
        for (String subject : new String[]{"국어", "영어", "수학"}) {
            System.out.print(subject + "\t");
        }
        System.out.println();

        System.out.print("점수:\t");
        for (int score : scores) {
            System.out.print(score + "\t");
        }

        System.out.print("\n\n");

        System.out.printf("총점:\t%d\n", sum);

        System.out.printf("평균:\t%.2f\n", avg);

        System.out.printf("등급:\t%c\n", whatGrade((int) avg));

        System.out.println();
    }

    /**
     * 성적에 대해 등급을 반환하는 메서드
     *
     * @param score 점수
     * @return char 형의 등급 값
     */
    public static char whatGrade(int score) {
        return switch (score / 10) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };
    }

    /**
     * 사용자가 선택 가능한 목록을 출력하는 메서드
     */
    static void printMenu() {
        System.out.print("""
                
                [선택 항목]
                1: 윤년계산기
                2: bmi계산기
                3: 사칙연산 계산기
                4: 구구단
                5: 누산합 계산기
                6: 띠 계산기
                7: 성적 계산기
                0: 종료
                번호 입력:\s""");
    }

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int n = s.nextInt();
            if (n == 0) break;
            switch (n) {
                case 1 -> leapYear();
                case 2 -> bmiCalculator();
                case 3 -> calculator();
                case 4 -> multiplication();
                case 5 -> accumulate();
                case 6 -> chineseZodiac();
                case 7 -> gradeCal();
            }
        }
        s.close();
    }
}
