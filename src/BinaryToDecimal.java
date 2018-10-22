import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter binary number : ");
        long a = scanner.nextLong();
        int sum = 0;
        int i=0;
        while (a > 0){
            sum =sum + (int) ((a%10)*Math.pow(2,i));
            i++;
            a=a/10;
        }
        System.out.println(sum);
    }
}
