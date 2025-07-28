package assignment.d0725.h;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

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

        s.close();
    }
}
