package day6;

public class StarPractice {

    /*
    [출력 1]
    *****
    *****
    *****
    *****
    *****

    [출력 2]
    *
    **
    ***
    ****
    *****

    [출력 3]
    *****
    ****
    ***
    **
    *

    [출력 4]
        *
       ***
      *****
     *******
    *********
    */

    public static void main(String[] args) {
        int n = 5;

        System.out.println("\n[출력 1 - 1]");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("\n[출력 1 - 2]");
        for (int i = 0; i < n * n; i++) {
            System.out.print(((i + 1) % n) != 0 ? '*' : "*\n");
        }

        System.out.println("\n-----------------------------------");

        System.out.println("\n[출력 2 - 1]");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("\n[출력 2 - 2]");
        for (int i = 0, j = 0; i < n * n; j += (((i + 1) % n) == 0) ? 1 : 0, i++) {
            System.out.print(((i % n) <= j ? "*" : " ") + (((i + 1) % n) == 0 ? "\n" : ""));
        }


        System.out.println("\n-----------------------------------");

        System.out.println("\n[출력 3 - 1]");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println("\n[출력 3 - 2]");
        for (int i = 0, j = n - 1; i < n * n; j -= (((i + 1) % n) == 0) ? 1 : 0, i++) {
            System.out.print(((i % n) <= j ? "*" : " ") + (((i + 1) % n) == 0 ? "\n" : ""));
        }

        System.out.println("\n-----------------------------------");

        System.out.println("\n[출력 4 - 1]");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + i; j++) {
                System.out.print((n - 1 - i) <= j ? '*' : ' ');
            }
            System.out.println();
        }

        System.out.println("\n[출력 4 - 2]");
        for (int i = 0, j = n - 1; i < (n * (2 * n - 1)); j -= (((i + 1) % (2 * n - 1)) == 0) ? 1 : 0, i++) {
            System.out.print((((i % (2 * n - 1)) <= (j - 1) || (i % (2 * n - 1)) >= ((2 * n - 1) - j)) ? " " : "*") +
                    (((i + 1) % (2 * n - 1)) == 0 ? "\n" : ""));
        }
    }
}
