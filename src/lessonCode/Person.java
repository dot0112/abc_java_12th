package lessonCode;

public class Person implements Comparable<Person> {
    private int age;
    private String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Person other) {
        // 1. 나이를 먼저 비교한다.
        int ageCompare = Integer.compare(this.age, other.age);

        // 2. 나이가 다르면 그 결과를 바로 반환한다.
        if (ageCompare != 0) {
            return ageCompare;
        }

        // 3. 나이가 같으면 이름(String)의 compareTo 결과를 반환한다.
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "\n나이: " + age + ", 이름: " + name;
    }
}
