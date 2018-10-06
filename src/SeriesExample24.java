// Series - 2,3,5,6,,10,11
// add (1,2,1,4,1..)
import java.util.Scanner;

public class SeriesExample24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of series : ");
        int n = sc.nextInt();
        int i = 2, j = 1, k = 2;
        while (n > 0){
            System.out.print(i + " ");
            if (j%2 == 0) {
                i = i + k;
                k = k + 2;
            }
            else
                i = i + 1;
            j++;
            n--;
        }
    }
}
