
public class Exercicio9 {

    public static void main(String args[]) {
        int n1[][] = {{2, -1, 3}, {1, 0, 4}};

        int n2[][] = {{3, 1}, {0, 2}, {1, 0}};

        int nr[][] = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    nr[i][j] = (int) n1[i][k] * n2[k][j];
                }
            }
        }
        System.out.println("MATRIZ 1 ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(" " + n1[i][j]);
            }
            System.out.println();
        }



    }
}