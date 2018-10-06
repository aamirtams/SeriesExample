// Series - 1, 5, 3, 9, 17, 29....N
// a+b+c

import java.util.Scanner;

public class SeriesExample16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of series : ");
        int n = sc.nextInt();
        int a=1, b=5, c=3, sum;

        while (n > 0){
            System.out.print(a + " ");
            sum = a+b+c;
            a=b;
            b=c;
            c=sum;

            n--;
        }
    }
}
