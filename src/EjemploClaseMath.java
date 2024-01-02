public class EjemploClaseMath {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);
        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        long entero = Math.round(3.5);
        System.out.println("entero = " + entero);

        //Funcion exponencial de Euler
        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        //Logaritmo natural
        double log = Math.log(10);
        System.out.println("log = " + log);

        //Potenciación
        double potencia = Math.pow(10,3);
        System.out.println("potencia = " + potencia);
        //Raiz cuadrada
        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("Convertir a grados = " + grados);

        double radianes = Math.toRadians(90.00);
        System.out.println("Convertir de grados a radianes = " + radianes);

        System.out.println("sin(90): " +Math.sin(radianes));
        System.out.println("cos(90): " +Math.cos(radianes));

        radianes = Math.toRadians(180.00);
        System.out.println("sin(180): " +Math.sin(radianes));
        System.out.println("cos(180): " +Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("sin(0): " +Math.sin(radianes));
        System.out.println("cos(0): " +Math.cos(radianes));
    }
}
