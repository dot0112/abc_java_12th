package d250819;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(10);
        list.add(3);
        list.add(7);
        list.add(0, 99);
        list.set(0, 88);
        list.remove(1);


        System.out.println("for 문");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        System.out.println("향상된 for 문");
        for (int i : list) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println(list);
        System.out.println();

        System.out.println("iterator 사용");
        Iterator<Integer> i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println();
    }
}
