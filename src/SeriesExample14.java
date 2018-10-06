// Series - 1, 2, 6, 15, 31, 56 .......N
/*  1+1^2
    2+2^2
    6+3^2
 */

import java.util.Scanner;

public class SeriesExample14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of series : ");
        int n = sc.nextInt();
        int j=1;
        for (int i=1; i<=n; i++){
            System.out.print(j + " ");
            j = (int) (j + Math.pow(i, 2));
        }
    }
}
