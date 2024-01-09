public class EjemploMatricesMarco {
    public static void main(String[] args) {
        int[][] matriz = new int[8][8];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 0 || i == matriz.length - 1 || j == 0 || j == matriz[i].length - 1 || i == j) matriz[i][j] = 1;
            }
        }
        imprimirMatrix(matriz);
    }
    private static void imprimirMatrix(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
