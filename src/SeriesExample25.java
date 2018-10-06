// 3,11,31,69,131
/*  1^3+2
    2^3+3
    3^3+4
    4^3+5
 */

import java.util.Scanner;

public class SeriesExample25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of series : ");
        int n = sc.nextInt();
        int s = 0;
        for (int i = 1; i <= n; i++){
            s = (i*i*i) + (i+1);
            System.out.print(s + " ");
        }

    }
}
