public class EjemploMatrices {
    public static void main(String[] args) {
        int[][] numbers = new int[2][4];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        int number = 1;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers[i].length; j++) {
                numbers[i][j] = number++;
            }
        }
        System.out.println("números de filas: " + numbers.length);
        System.out.println("números de columnas: " + numbers[0].length);
        System.out.println("El primer elemento de la matriz: " + numbers[0][0]);
        System.out.println("El último elemento de la matriz: " + numbers[numbers.length-1][numbers[0].length-1]);
        int num1 = numbers[0][0];
    }
}
