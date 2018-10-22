// Series - 1,4,9,25,49,121,169,289,361,529,841

import java.util.Scanner;

public class SeriesExample6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of series : ");
        int n = sc.nextInt();

        for (int i = 1; i <= 500; i++){
            if (isPrime(i)){
                System.out.print(i*i + " ");
                n--;
            }
            if (n < 1)
                break;
        }
    }
    private static boolean isPrime(int n){
        for (int i = 2; i <= n/2; i++){
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
