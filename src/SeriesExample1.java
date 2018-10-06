// Series - 6,14,36,98,276,794
/*  6*3  - 4   = 14
    14*3 - 4+2 = 36
    36*3 - 6+4 = 98
 */

import java.util.Scanner;

public class SeriesExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of series : ");
        int n = sc.nextInt();
        int s=6, j=4, k = 2;
        for (int i=1; i <=n; i++){
            System.out.print(s + " ");
            s = s*3 - j;
            j = j + k;
            k = 2 * k;
        }
    }
}
