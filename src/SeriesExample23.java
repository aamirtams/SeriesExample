// Series - 2,3,5,6,7,10,11
// No perfect square and cube
import java.util.Scanner;

public class SeriesExample23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of series : ");
        int n = sc.nextInt();

        for (int i=1; i<=100; i++){
            if (!isSquareOrCube(i)){
                System.out.print(i + " ");
                n--;
            }
            if (n < 1)
                break;
        }
    }

    private static boolean isSquareOrCube(int n){
        if (n == 0 || n == 1)
            return true;
        for (int i = 1; i<=n/2; i++){
            int x = i*i;
            int y = i*i*i;
            if (x == n || y == n)
                return true;
        }
        return false;
    }
}
