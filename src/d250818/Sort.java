package d250818;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] ary = {7, 3, 8, 1, 4};
        interchangeSort(ary);
        bubbleSort(ary);
        System.out.println(Arrays.toString(ary));
    }

    public static void interchangeSort(int[] ary) {
        for (int i = 0; i < ary.length - 1; i++) {
            for (int j = i + 1; j < ary.length; j++) {
                if (ary[i] > ary[j]) {
                    int t = ary[i];
                    ary[i] = ary[j];
                    ary[j] = t;
                }
            }
        }
    }

    public static void bubbleSort(int[] ary) {
        for (int i = ary.length - 1; i >= 0; i--) {
            boolean c = true;
            for (int j = 0; j < i; j++) {
                if (ary[j] > ary[j + 1]) {
                    c = false;
                    int t = ary[i];
                    ary[i] = ary[j];
                    ary[j] = t;
                }
            }
            if (c) break;
        }
    }
}
