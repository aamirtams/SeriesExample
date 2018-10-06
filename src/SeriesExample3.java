// Series - 6, 15, 35, 77, 143, 221, 323, 437, 667, 899

import java.util.Scanner;

public class SeriesExample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 2, b;
        for (int i = 3; i <= 100; i++) {
            if (isPrime(i)){
                b = a * i;
                a = i;
                System.out.print(b + " ");
                n--;
            }
            if (n == 0){
                break;
            }
        }
    }
    static boolean isPrime(int n){
        for (int i = 2; i <=n/2; i++){
            if (n%i == 0)
                return false;
        }
        return true;
    }

}
