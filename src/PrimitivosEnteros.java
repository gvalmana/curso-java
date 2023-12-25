public class PrimitivosEnteros {

    public static void main(String[] args) {

        byte numeroByte = 7;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("valor maximo de byte es " + Byte.MAX_VALUE);
        System.out.println("valor minimo de byte es " + Byte.MIN_VALUE);

        short numeroShort = 32767;

        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en byte a " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("valor maximo de short es " + Short.MAX_VALUE);
        System.out.println("valor minimo de short es " + Short.MIN_VALUE);

        int numeroInt = 32768;

        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("valor maximo de int es " + Integer.MAX_VALUE);
        System.out.println("valor minimo de int es " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo int corresponde en byte a " + Long.BYTES);
        System.out.println("tipo int corresponde en bites a " + Long.SIZE);
        System.out.println("valor maximo de int es " + Long.MAX_VALUE);
        System.out.println("valor minimo de int es " + Long.MIN_VALUE);

        var numeroVar = 127;
    }
}
