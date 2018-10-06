// Series - 3,7,17,39,85
// 3*2 + 1
// 7*2 + 3
// 17*2 + 5

import java.util.Scanner;

public class SeriesExample27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of series : ");
        int n = sc.nextInt();
        int s = 3, j = 1;
        for (int i = 1; i<=n; i++){
            System.out.print(s + " ");
            s = s*2 + j;
            j = j + 2;
        }
    }
}
