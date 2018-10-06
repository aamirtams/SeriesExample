import java.util.Scanner;

// Series - 15,29,56,108,208,400
/*  15*2 - 2^0
    29*2 - 2^1
    56*2 - 2^2
 */
public class SeriesExample13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of series : ");
        int n = sc.nextInt();
        int a = 15;
        for (int i = 0; i < n; i++){
            System.out.print(a + " ");
            a = (int) (a*2 - Math.pow(2, i));

        }
    }
}
