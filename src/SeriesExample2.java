// Series - 4, 6, 12, 30, 42, 60, 72, 102, 108

import java.util.Scanner;

public class SeriesExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range : ");
        int n = sc.nextInt();

        for (int i = 3; i <= 500; i++){
            if (isPrime(i-1) && isPrime(i+1)){
                System.out.print(i + " ");
                n--;
            }
            if (n == 0){
                break;
            }
        }

    }
    static boolean isPrime(int n){
        for (int i = 2; i <= n/2; i++){
            if (n%i == 0)
                return false;
        }
        return true;
    }
}
