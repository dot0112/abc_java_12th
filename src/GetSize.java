import org.openjdk.jol.info.GraphLayout;

import java.util.ArrayList;

public class GetSize {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(i);
            System.out.println(list.toArray().length);
            System.out.println(GraphLayout.parseInstance(list).toFootprint());
        }
    }
}

/*
0 16
1 24
2 24
3 32
4 32
5 40
6 40
7 48
8 48
9 56
10 56   -- 요소가 들어오면 자동으로 10으로 세팅됨
11 64
12 64
13 72
14 72
15 80
16 80
17 88
18 88
19 96
20 96
*/