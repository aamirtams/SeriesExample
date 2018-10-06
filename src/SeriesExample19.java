// Series - 21, 32, 54, 87, 131, 186......N
// Add 11 then 22 then 33 and so on

import java.util.Scanner;

public class SeriesExample19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of series : ");
        int n = sc.nextInt();
        int i = 21, j = 11;

        while (n > 0){
            System.out.print(i + " ");
            i = i + j;
            j = j + 11;
            n--;
        }
    }
}
