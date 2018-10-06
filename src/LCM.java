import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int n2 = sc.nextInt();
        System.out.print("Enter third number : ");
        int n3 = sc.nextInt();

        int i = 0, flag = 0;
        while (flag == 0){
            i++;
            if (i%n1==0 && i%n2==0 && i%n3==0){
                System.out.print("LCM is : " + i);
                flag = 1;
            }
        }



    }
}
