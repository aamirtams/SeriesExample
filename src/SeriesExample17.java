// Series - 1, -4, 9, -25, 36, -49, 81.....N

import java.util.Scanner;

public class SeriesExample17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of series : ");
        int n = sc.nextInt();
        int j=0, i = 1;
        while (n > 0){
            if (i%4 != 0){
                j++;
                if (j%2 != 0){
                    System.out.print(i*i + " ");
                }else {
                    System.out.print(-(i*i) + " ");
                }
            }else {
                n++;
            }
            i++;
            n--;
        }
    }
}
