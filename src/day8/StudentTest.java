package day8;

public class StudentTest {
    Student kim = new Student();
    static Student s1 = new Student(), s2 = new Student(), s3;

    public static void main(String[] args) {
        Student kim = new Student();
        kim.name = "김지우";
        kim.math = 100;
        kim.eng = 87;
        kim.kor = 87;
        kim.phone = "010-1234-5678";
        System.out.println(kim.math);

        kim.goSchool();


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
