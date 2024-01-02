public class PrimitivosFloat {
    public static void main(String[] args) {
        float realFloat = 0.00000000015f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("valor maximo de byte es " + Float.MAX_VALUE);
        System.out.println("valor minimo de byte es " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("tipo double corresponde en bites a " + Double.SIZE);
        System.out.println("valor maximo de byte es " + Double.MAX_VALUE);
        System.out.println("valor minimo de byte es " + Double.MIN_VALUE);

        var varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);
    }
}
