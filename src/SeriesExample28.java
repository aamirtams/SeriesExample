// Series -

import java.util.Scanner;

public class SeriesExample28 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter length of series : ");
//        int n = sc.nextInt();
        int k = 0;
        int[] a = new int[20];

        for (int i = 2; i <= 50; i++){
            int flag = 0;
            for (int j = 2; j <= i/2; j++){
                if (i%j == 0){
                    flag ++;
                    break;
                }
            }
            if (flag == 0){
                a[k] = i;
                k++;
            }
        }

        for (int i = 0; i < k; i++){
            System.out.print(a[i] + " ");
        }

    }
}
