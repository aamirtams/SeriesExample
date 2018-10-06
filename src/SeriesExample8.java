// Series - 1,2,4,8,32,64,128,512

import java.util.Scanner;

public class SeriesExample8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of series : ");
        int n = sc.nextInt();
        int s=1;
        for (int i = 1; i<=n; i++){
            System.out.print(s + " ");
            if (i == 4 || i == 7){
                s = s*2;
            }
            s = s*2;
        }

    }
}
