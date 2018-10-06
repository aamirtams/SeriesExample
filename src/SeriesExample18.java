// Series - 1, 1, 2, 12, 14, 26, 40, 264, 304, 568.....N
/*  1+1       = 2
    (1+2)*4   = 12
    2+12      = 14
    12+14     = 26
    14+26     = 40
    (26+40)*4 = 264
    40+264    = 304
    264+304   = 568
    (304+568)*4 = 3488
*/
import java.util.Scanner;

public class SeriesExample18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of series : ");
        int n = sc.nextInt();

        int a=1, b=1,c=1;
        System.out.print(a + " ");
        for (int i = 1; i <= n; i++){
            if(i<2){
                System.out.print(a + " ");
            }else {
                c = a + b;
                if (i%7 == 0 || (i-3)%7 == 0){
                    c *= 4;
                }
                System.out.print(c + " ");
                a = b;
                b = c;
            }

        }

    }
}
