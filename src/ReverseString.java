import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Stirng : ");
        String s = sc.nextLine();
        reverseSting(s);
        reverseString2(s);
        reverseStirng3(s);
        reverseString4(s);
    }

    private static void reverseSting(String s){
        char[] c = s.toCharArray();
        for (int i=c.length-1; i>=0; i--){
            System.out.print(c[i]);
        }
        System.out.println();
    }

    private static void reverseString2(String s){
        for (int i=s.length() -1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }

    private static void reverseStirng3(String s){
        StringBuffer sb = new StringBuffer(s);
        System.out.print(sb.reverse());
        System.out.println();
    }

    private static void reverseString4(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        System.out.println(stringBuilder.reverse());
        System.out.println();
    }
}
