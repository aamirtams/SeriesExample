// Series - 1,5,13,29,49,77
/*  1
    1  + 4*1
    5  + 4*2
    13 + 4*4
    29 + 4*5
    49 + 4*7

 */

import java.util.Scanner;

public class SeriesExample10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of series : ");
        int n = sc.nextInt();
        int i = 1, j = 1;
        while (n > 0){
            if (j % 3 != 0){
                System.out.print(i + " ");
                i = i + 4*j;
            } else {
                n++;
            }
            j++;
            n--;
        }
    }
}
