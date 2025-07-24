package day4.switchExample;

public class SwitchCase02 {

    /*
    break가 없어도 switch-case 기본 동작과 목적에 부합하게 간결하게 사용하는 방법
    switch 표현식의 화살표 문법
    */

    public static void main(String[] args) {
        String medalColor = "Gold", msg;

        msg = switch (medalColor) {   // switch 문 자체를 변수에 대입하도록 쓰는 방법
            case "Gold" -> "금메달입니다";
            case "Silver" -> "은메달입니다";
            case "Bronze" -> "동메달입니다";
            default -> {
                if (medalColor == "blank") {
                    yield "없는 메달입니다";
                } else {
                    yield "알수없습니다";
                }
                // yield? switch-case 안에 복잡한 제어문이 더 들어가는 경우에 수행 결과를 반환하기 위하여 사용
            }
        }; // 세미콜론(;) 필요

        System.out.println(msg);
    }
}
