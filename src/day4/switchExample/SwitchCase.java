package day4.switchExample;

public class SwitchCase {

    /*
    스위치문
    switch (조건) {
        case 결과1:
            결과1이 참일때 수행문;
            break;
        case 결과2:
            결과2가 참일때 수행문;
            break;
        default:
            어떠한 결과와도 일치하지 않는 경우 수행문;
    }

    break? 케이스에 일치하는 경우 수행문을 시행하고 switch-case 문을 빠져나가게 함
    default? 어떤 케이스에도 해당하지 않는 경우 수행됨
    */

    public static void main(String[] args) {
        int ranking = 1;
        String medalColor = "Gold", result = "";

        switch (medalColor) {   // 조건에 문자열도 허용됨
            case "Gold":
                ranking = 1;
                result = "금메달";
                break;
            case "Silver":
                ranking = 2;
                result = "은메달";
                break;
            case "Bronze":
                ranking = 3;
                result = "동메달";
                break;
            default:
                ranking = 0;
        }

        System.out.printf("%d등 메달은 %s입니다\n", ranking, result);
    }
}
