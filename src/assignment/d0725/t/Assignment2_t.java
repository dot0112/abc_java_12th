package assignment.d0725.t;

import java.util.Scanner;

public class Assignment2_t {

    /*
    입력받기 스캐너
    (정수) 피연산자1 피연산자2
    연산기호
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // char operator = scan.next().charAt(0); : 입력받은 문자열이 예상과 다른 경우에
        int a, b;
        double result;
        String operator = scan.next();

        switch (operator) {
            case "+":
                System.out.printf("");
//                result = a + b;
                break;
            case "-":
                break;
            case "*":
                break;
            case "/":
                break;
            default:

        }

        scan.close();
    }
}
