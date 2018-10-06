// Series - 2, 3, 5, 11, 23, 29, 41, 53, 83, 89

import java.util.Scanner;

public class PrimeExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of series : ");
        int n =  sc.nextInt();
        for (int i = 2; i <= 500; i++){
            int k = 2*i + 1;
            if (isPrime(i) && isPrime(k)){
                System.out.println(i);
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
