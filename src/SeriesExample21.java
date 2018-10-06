// Series - 4,8,16,20,28,32
// add 4 then 8 then 4 then 8 and so on

import java.util.Scanner;

public class SeriesExample21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of series : ");
        int n = sc.nextInt();
        int i = 4, j = 1;
        while (n > 0){
            System.out.print(i + " ");
            if (j%2 != 0)
                i = i + 4;
            else
                i = i + 8;
            j++;
            n--;
        }
    }
}
