package day7.array;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] scores = {55, 60, 71, 84, 62};
        char[] grades = new char[scores.length];

        for (int i = 0; i < scores.length; i++) {
            grades[i] = whatGrade(scores[i]);
        }

        System.out.print("점수:\t");
        for (int score : scores) {
            System.out.print(score + "\t");
        }
        System.out.println();
        System.out.print("등급:\t");
        for (char grade : grades) {
            System.out.print(grade + "\t");
        }
    }

    /**
     * 점수를 받아 등급을 반환해주는 메서드 whatGrade(int score)
     *
     * @param score int형 변수
     * @return char형 결과값
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
}
