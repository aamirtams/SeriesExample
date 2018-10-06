// Series - 1,3,7,13,21,43,57,73,91,111,157,183,211


public class SeriesExample5 {
    public static void main(String[] args) {
        int i = 1, j = 2;
        for (int k = 1; k <= 15; k++){
            System.out.print(i + " ");
            if (k >= 5 && k%5 == 0){
                i+=j;
                j+=2;
            }
            i+=j;
            j+=2;
        }
    }

}
