import java.util.Random;

public class ArrayMultiDi {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] arrayMulti = new int[4][4];

        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                arrayMulti[i][j] = random.nextInt(9);
            }
        }
        System.out.println("-MATRIZ: ");
        for (int[] linha : arrayMulti) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");

            }
            System.out.println();
        }

    }
}
