public class PyramidFibonacci {
    public static void main(String[] args) {
        drawPyramid(6);

    }

    private static void drawPyramid(int n) {
        // number of spaces
        int k = 2 * n - 2;

        // outer loop to handle number of rows
        //  n in this case
        for (int i = 0; i < n; i++) {

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j = 0; j < k; j++) {
                // printing spaces
                System.out.print(" ");
            }

            // decrementing k after each loop
            k = k - 1;

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j = 0; j <= i; j++) {
                // printing stars
                System.out.print(fib(i+1) + " ");
            }

            // ending line after each row
            System.out.println();
        }
    }
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}
