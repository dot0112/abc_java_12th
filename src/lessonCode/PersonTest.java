package lessonCode;

import java.util.ArrayList;
import java.util.Collections;

public class PersonTest {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();

        personArrayList.add(new Person(10, "다다다"));
        personArrayList.add(new Person(20, "가가가"));
        personArrayList.add(new Person(10, "나나나"));
        personArrayList.add(new Person(100, "가가가"));
        personArrayList.add(new Person(20, "가가나"));
        personArrayList.add(new Person(20, "가나가"));

        Collections.sort(personArrayList);

        System.out.println(personArrayList);
    }
}
