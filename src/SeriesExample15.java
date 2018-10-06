//1, 4, 9, 25, 49, 121....N ( Square of prime numbers)

import java.util.Scanner;

public class SeriesExample15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of series : ");
        int n = sc.nextInt();
        int i = 1;
        while (n>0){
            if (isPrime(i)){
                System.out.print((int) (Math.pow(i,2)) + " ");
                n--;
            }
            i++;
        }
    }

    private static boolean isPrime(int n){
        for (int i = 2; i<=n/2; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
}
