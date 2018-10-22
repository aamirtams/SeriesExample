import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first binary number : ");
        long a = scanner.nextLong();
        System.out.print("Enter second binary number : ");
        long b = scanner.nextLong();
        int[] sum = new int[20];
        int i = 0,rem = 0;
        while (a != 0 || b != 0) {
            sum[i++] = (int)((a%10 + b%10 + rem)%2);
            rem = (int) ((a%10 + b%10 + rem)/2);
            a = a / 10;
            b = b / 10;
        }
        if (rem != 0){
            sum[i++] = rem;
        }
        --i;
        while (i >= 0){
            System.out.print(sum[i--]);
        }

    }
}
