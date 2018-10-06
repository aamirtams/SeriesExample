

import java.util.Scanner;

public class SeriesExample9 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter length of the series : ");
        int n = sc.nextInt();
        Q1(n);

    }

    // Series - 1,12,123,1234,12345,123456

    static void Q1(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.print(",");
        }
    }

    // Series - 19,21,18,23,16,27





}

