//Series - 5, 8, 12, 18, 24, 30, 36, 42, 52
// Addition of prime number 2+3=5, 3+5=8, 5+7=12

import java.util.Scanner;

public class SeriesExample22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of series : ");
        int n = sc.nextInt();
        int a = 2, b = 3, s = 0;
        for (int i=5; i<=100; i++){
            if (isPrime(i)){
                s = a + b;
                System.out.print(s + " ");
                a = b;
                b = i;
                n--;
            }
            if (n < 1)
                break;
        }
    }

    private static boolean isPrime(int n){
        for (int i = 2; i <= n/2; i++){
            if (n%i == 0)
                return false;
        }
        return true;
    }
}
