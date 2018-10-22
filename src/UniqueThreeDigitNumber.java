import java.util.LinkedList;

public class UniqueThreeDigitNumber {
    public static void main(String[] args) {
        int n=0;
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 4; j++){
                for (int k = 1; k <= 4; k++){
                    if (i !=j && j != k && k != i){
                        System.out.println(i+""+j+""+k);
                        n++;
                    }
                }
            }
        }
        System.out.println("Total number of 3 digit number is : " + n);
    }
}
