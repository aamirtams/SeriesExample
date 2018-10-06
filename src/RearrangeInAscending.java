import java.util.Scanner;

public class RearrangeInAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4 digit number : ");
        int n = sc.nextInt();
        int temp = n;
        for (int i = 0; i <= 9; i++){
            while (n!=0){
                int r = n%10;
                if (i == r){
                    System.out.print(i);
                }
                n=n/10;
            }
            n = temp;

        }
    }


}
