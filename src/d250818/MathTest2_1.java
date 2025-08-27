package d250818;

import java.util.Arrays;

public class MathTest2_1 {
    public static void main(String[] args) {
        withBitmaskingCheck();

    }


    static void withBitmaskingCheck() {
        long c = 0;
        int n;

        for (int i = 0; i < 6; ) {
            n = (int) (Math.random() * 45 + 1);

            if ((c & 1L << n) != 0) continue;
            else c |= 1L << n;

            i++;
        }

        System.out.println("\n\t\t\t\t\t로또 번호");
        for (int i = 1; i <= 6; i++) {
            System.out.printf(" [%d]\t", i);
        }
        System.out.println();

        for (int i = 1; i < 46; i++) {
            if ((c & 1L << i) != 0) System.out.printf(" %3d\t", i);
        }
        System.out.println();
    }


    static void withBooleanCheck() {
        int n;
        boolean[] c = new boolean[46];

        for (int i = 0; i < 6; ) {
            n = (int) (Math.random() * 45 + 1);

            if (c[n]) continue;
            else c[n] = true;

            i++;
        }

        for (int i = 1; i < 46; i++) {
            if (c[i]) System.out.print(i + " ");
        }
        System.out.println();
    }


    static void withLoopCheck() {
        int[] ary = new int[6];
        int n, i = 0;

        out:
        while (i < 6) {
            n = (int) (Math.random() * 45 + 1);

            for (int j = 0; j < i; j++) {
                if (ary[j] == n) continue out;
            }
            ary[i++] = n;
        }


//        interchangeSort(ary);
//        bubbleSort(ary);
        Arrays.sort(ary);
        System.out.println(Arrays.toString(ary));
    }
}
