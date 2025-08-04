package day9;

// 다른 패키지에 있는 클래스를 가져다 쓸 수 있음 (import 키워드 필요함)

import day8.kitchen.Ramen;

public class StudentTest {
    public static void main(String[] args) {
        /*
        Student seo = new Student();
        seo.studentId = 123456;
        seo.setStudentId(123456);
        seo.studentName = "서희연";
        System.out.println(seo.getStudentId());
        System.out.println(seo.studentName);
        */

        Student kim = new Student(456789, "김민서", 1, "부산광역시 중구 무역회관");
        System.out.println(kim.getStudentId());
        System.out.println(kim.studentName);
        System.out.println(kim.grade);
        System.out.println(kim.address);
        kim.greet();
        System.out.println(kim); // 리모컨 -> 참조값, 주소값

        // kim.studentId = 12344;
        kim.setStudentId(12344);
        System.out.println(kim.studentName + "님의 학번은 " + kim.getStudentId() + "입니디.");

        Ramen ram = new Ramen();
        // 같은 이름의 두 클래스를 하나의 패키지 안에 구현하면 오류
        // 패키지 이름을 포함한 클래스 이름 = 클래스 전체 이름
        day8.Student stu = new day8.Student();
        stu.name = "김석현";
    }
}
