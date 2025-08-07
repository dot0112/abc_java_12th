package day11;

public class StudentTest {

    public static void main(String[] args) {
        System.out.println(Student.getSerialNum());
        Student seo = new Student(87, "서희연");
        Student seo2 = new Student(98, "서희민");

        System.out.println(seo);
        System.out.println(seo2);
    }
}
