package d250813;

import java.time.LocalDate;
import java.util.Scanner;

public class StringTest2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String id;

        System.out.print("주민등록번호입력 (990101-1111111 형식): ");
        id = s.nextLine();  // 주민등록번호 입력받음

        if (!id.matches("\\d{6}-[1234]\\d{6}")) {   // 정규식을 통해 ( 숫자 6 자리 )-( 숫자 7 자리 )를 확인
            System.out.println("주민등록번호 형식이 올바르지 않습니다.");    // 정규식에 맞지 않는 경우
        } else {
            int birthYear = Integer.parseInt((id.charAt(7) > '2' ? "20" : "19") + id.substring(0, 2));  // 주민등록번호 뒷자리의 시작 숫자를 통해 출생년도를 4자리로 확장

            if (!checkValidDay(birthYear,
                    Integer.parseInt(id.substring(2, 4)),
                    Integer.parseInt(id.substring(4, 6)))   // 생년월일이 존재 가능한지 확인
            ) {
                System.out.println("불가능한 날짜입니다.");  // 생년월일이 존재할 수 없는 경우
            } else {
                int age = LocalDate.now().getYear() - birthYear + 1; // 현재 년도와 비교하여 나이를 구함
                String gender = id.charAt(7) % 2 == 1 ? "남성" : "여성";    // 주민등록번호 뒷자리로 성별을 구함
                System.out.printf("%d년생 %d세(%s) 입니다.", birthYear, age, gender);
            }
        }

        s.close();
    }

    static boolean checkValidDay(int year, int month, int day) {
        return day <= switch (month) {  // 달 별 최대 일과 입력받은 일을 비교
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 29 : 28);    // 윤년 여부에 따라 최대 일 변경
            default -> -1;  // 1 ~ 12월에 해당하지 않으면 음수 값을 통해 항상 false를 반환하도록 설정
        };
    }
}