//  Series - 11, 41, 102, 196, 325
/*  Logic - (11 + 30 = 41 ----- 30+0)
            (41 + 61 = 102 ---- 30+30+1*1)
            (102 + 94 = 196 --- 60+30+2*2)
            (196 + 129 = 325 -- 90+30+3*3)
*/

import java.util.Scanner;

public class SeriesExample4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of series : ");
        int n = sc.nextInt();
        int a=11, b=0,sum, i=0;
        while(n > 0){
            sum = a + b;
            a = sum;
            b = 30*(i+1) + i*i;
            i++;
            System.out.print(sum + " ");
            n--;
        }
    }
}
