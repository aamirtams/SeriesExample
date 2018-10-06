// Series - 6,10,18,34,54,82

import java.util.Scanner;

public class SeriesExample12 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter length of series : ");
        int n = sc.nextInt();
        int i=6, j=4;
        System.out.print(i + " ");
        while (n > 0){
            i = i + j;
            j = j + 4;
            System.out.print(i + " ");
            i = i + j;
            j = j + 8;
            System.out.print(i + " ");
            n -= 2;
        }

    }
}
