package d250818;

import java.util.Arrays;
import java.util.Scanner;

public class SortTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double ar[] = {1.5, 3, 10.2, 33.1, 2.345};

        int n = s.nextInt();

        switch (n) {
            case 1 -> {
                interchangeSort(ar);
                System.out.println(Arrays.toString(ar));
            }
            case 2 -> {
                bubbleSort(ar);
                System.out.println(Arrays.toString(ar));
            }
        }

        s.close();
    }

    public static void interchangeSort(double[] ary) {
        for (int i = 0; i < ary.length - 1; i++) {
            for (int j = i + 1; j < ary.length; j++) {
                if (ary[i] > ary[j]) {
                    double t = ary[i];
                    ary[i] = ary[j];
                    ary[j] = t;
                }
            }
        }
    }

    public static void bubbleSort(double[] ary) {
        for (int i = ary.length - 1; i >= 0; i--) {
            boolean c = true;
            for (int j = 0; j < i; j++) {
                if (ary[j] > ary[j + 1]) {
                    c = false;
                    double t = ary[i];
                    ary[i] = ary[j];
                    ary[j] = t;
                }
            }
            if (c) break;
        }
    }
}
