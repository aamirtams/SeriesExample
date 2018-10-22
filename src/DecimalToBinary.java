import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter decimal number : ");
        int a = scanner.nextInt();
        int[] sum = new int[50];
        int i=0;
        while (a > 0){
            sum[i++] = a%2;
            a = a/2;
        }
        --i;
        while (i >= 0){
            System.out.print(sum[i--]);
        }

    }
}
