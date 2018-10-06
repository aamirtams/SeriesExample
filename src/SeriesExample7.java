//1,2,3,6,9,18,27,54....N

import java.util.Scanner;

public class SeriesExample7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of series : ");
        int n = sc.nextInt();
        int s=1;
        System.out.print(s + " ");
        for (int i = 1; i<n; i++){
            s=s*2;
            System.out.print(s + " ");
            s=s*3/2;
            System.out.print(s + " ");
        }
    }
}
