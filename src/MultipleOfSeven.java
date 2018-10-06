// WAP to display 1st, 2nd, and 4rth multiple of 7 which when divided by 2,3,4,5,6 gives the reminder as 1

public class MultipleOfSeven {
    public static void main(String[] args) {
        int n = 7;
        int count = 0;
        while (count < 4){
            if (n%2 == 1 && n%3 == 1 && n%4 == 1 && n%5 == 1 && n%6 == 1){
                count++;
                if (count != 3){
                    System.out.println(count + " - " + n);
                }
            }
            n += 7;

        }
    }
}
