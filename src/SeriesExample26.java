// Series - 1,-2,6,-15,31,-56
/*  6=2+4
    15=6+9
    31=15+16
    56=31+25
    */

import java.util.Scanner;

public class SeriesExample26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of series : ");
        int n = sc.nextInt();
        int s = 1;
        for (int i = 1; i<=n; i++){
            if (i%2 == 0){
                System.out.print((-s) + " ");
            }
            else {
                System.out.print(s + " ");
            }
            s = s + (i*i);
        }
    }
}
