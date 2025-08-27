package d250814;

public class MathTest2 {
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

            System.out.print(n + " ");
            i++;
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

            System.out.print(n + " ");
            i++;
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
            ary[i] = n;

            System.out.print(ary[i++] + " ");
        }
        System.out.println();
    }
}
