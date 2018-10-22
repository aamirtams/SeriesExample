// Print american flag

public class PrintAmericanFlag {
    public static void main(String[] args) {
        for (int i=1; i<=15; i++){
            for (int j=1; j<=24; j++){
                if (i <= 9 && j<=6){
                    if (i%2 == 0){
                        if (j==6){
                            System.out.print("  ");
                        }else {
                            System.out.print(" *");
                        }
                    }else {
                        System.out.print("* ");
                    }

                }else {
                    System.out.print("= ");
                }
            }
            System.out.println();
        }
    }

}
