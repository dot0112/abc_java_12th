package d250820;

import d250819.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("aaa", "bbb");
        map.put("bbb", "ccc");
        map.put("ccc", "ddd");

        System.out.println(map.keySet());

        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }

        System.out.println(map.remove("bbb"));

        System.out.println(map);

        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("number", 100);
        map2.put("string", "문자열");
        map2.put("student", new Student("김철수", 100, 90, 80));

        System.out.println(map2);

        Student a = (Student) map2.get("student");
        System.out.println(a.getName());

        HashMap<String, ArrayList> aaa = new HashMap<>();
    }
}
