// All Patterns
public class Pattern {
    public static void main(String[] args) {

    }

    /* ========================================
     ------------  1  -----------------------
        *
        * *
        * * *
        * * * *
        * * * * *
       ========================================= */
    private static void starPatternLeft(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*  ==========================================
        --------------  2  -----------------------

                *
              * *
            * * *
          * * * *
        * * * * *

        =========================================== */

    private static void starPatternRight1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    private static void starPatternRight2(int n) {
        int k = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                System.out.print(" ");
            }
            k = k - 2;
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /*  ==========================================
        --------------  3  -----------------------

                *
               * *
              * * *
             * * * *
            * * * * *

        =========================================== */

    private static void starPyramid1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    private static void starPyramid2(int n) {
        int k = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                System.out.print(" ");
            }
            k = k - 1;
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*  ==========================================
        --------------  4  -----------------------

                1
                1 2
                1 2 3
                1 2 3 4
                1 2 3 4 5

        =========================================== */

    private static void numberPatterLeft1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    /*  ==========================================
       --------------  5  -----------------------

               1
               2  3
               4  5  6
               7  8  9  10
               11 12 13 14 15

       =========================================== */
    private static void numberPatterLeft2(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (k <= 9) {
                    System.out.print(k + "  ");
                } else {
                    System.out.print(k + " ");
                }
                k++;

            }
            System.out.println();
        }
    }

     /*  ==========================================
        --------------  6  -----------------------
                1
              1   1
            1   2   1
          1   3   3   1
        1   4   6   4   1

        =========================================== */

    private static void numberPyramid(int n) {
        int k = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                System.out.print(" ");
            }
            k = k - 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


     /*  ==========================================
        --------------  6  -----------------------
            *
            * *
            * * *
            * * * *
            * * * * *
            * * * *
            * * *
            * *
            *

        =========================================== */

    private static void starPyramidLeft(int n) {
        if (n % 2 == 0) {
            System.out.println("Please enter rows in odd..");
        } else {
            for (int i = 1; i <= n / 2 + 1; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 1; i <= n / 2; i++) {
                for (int j = n / 2; j >= i; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    }

        /*  ==========================================
        --------------  6  -----------------------
                * * * * *
                * * * *
                * * *
                * *
                *
                * *
                * * *
                * * * *
                * * * * *

        =========================================== */

    private static void starPatterDoubleLeft(int n) {
        n = n / 2 + 1;

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


     /*  ==========================================
        --------------  6  -----------------------
                *
               ***
              *****
             *******
            *********
             *******
              *****
               ***
                *

        =========================================== */

    private static void starPatternDaimond(int n) {
        int temp;
        if (n % 2 != 0) {
            temp = n / 2 + 1;
        } else {
            temp = n/2;
        }
        for (int i = 1; i <= temp; i++) {
            for (int j = temp - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = temp-1; i >= 1; i--) {
            for (int j = temp - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }


    }

    private static void starPatternDiamondMain(int number){
        int  i, k, count = 1;
        count = number - 1;
        for (k = 1; k <= number; k++)
        {
            for (i = 1; i <= count; i++)
                System.out.print(" ");
            count--;
            for (i = 1; i <= 2 * k - 1; i++)
                System.out.print("*");
            System.out.println();
        }
        count = 1;
        for (k = 1; k <= number - 1; k++)
        {
            for (i = 1; i <= count; i++)
                System.out.print(" ");
            count++;
            for (i = 1; i <= 2 * (number - k) - 1; i++)
                System.out.print("*");
            System.out.println();
        }
    }


      /*  ==========================================
        --------------  6  -----------------------
                *
               * *
              *   *
             *     *
            *       *
             *     *
              *   *
               * *
                *

        =========================================== */

}
