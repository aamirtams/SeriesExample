// Series - 23, 21, 24, 19, 26, 15, 28, 11, 30, 7, 36.....N
// prime number once subtracted and once added

import java.util.Scanner;

public class SeriesExample20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of series : ");
        int n = sc.nextInt();
        int i=23, j=2;
        for (int k = 2; k <= 100; k++){
            if (isPrime(k)){
                System.out.print(i + " ");
                if (j%2 == 0)
                    i = i - k;
                else
                    i = i + k;
                j++;
                n--;
            }
            if (n < 1)
                break;
        }
    }
    private static boolean isPrime(int n){
        for (int i = 2; i<=n/2; i++){
            if (n%i == 0)
                return false;
        }
        return true;
    }
}
