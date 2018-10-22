import java.util.Scanner;

public class CountLetterSpaceNumberOther {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = sc.nextLine();
        countDetails(s);

    }

    private static void countDetails(String s){
        char[] c = s.toCharArray();
        int letter = 0, spaces = 0, number = 0, other = 0;
        for (int i=0; i<c.length; i++){
            if (Character.isLetter(c[i]))
                letter++;
            else if (Character.isDigit(c[i]))
                number++;
            else if (Character.isSpaceChar(c[i]))
                spaces++;
            else
                other++;
        }
        System.out.print("Letter = " + letter + "\n" +
                    "Numbers = " + number + "\n" +
                    "Spaces = " + spaces + "\n" +
                    "Others = " + other);
    }
}
