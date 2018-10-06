// Series - 8,6,9,23,87,429
/*  8*1 - 2
    6*2 - 3
    9*3 - 4
    23*4 - 5
 */

import java.util.Scanner;

public class SeriesExample11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of series : ");
        int n = sc.nextInt();
        int i = 8, j = 1;
        while (n > 0){
            System.out.print(i + " ");
            i = (i*j) - (j+1);
            j++;
            n--;
        }

    }
}
