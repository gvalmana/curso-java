public class RefactorCaracteres {

    public static void main(String[] args) {
        char character = '\u0040';
        char decimal = 64;
        char symbol = '@';
        System.out.println("character = " + character);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal == character " + (decimal == character));
        System.out.println("symbol = " + symbol);

        char espacio = '\u0020';
        char retroceso = '\b'; //backspace
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("tipo char corresponde en byte a:" + System.lineSeparator() + Character.BYTES);
        System.out.println("tipo char corresponde en bites a " + Character.SIZE);
        System.out.println("valor maximo de byte es " + Character.MAX_VALUE);
        System.out.println("valor minimo de byte es " + Character.MIN_VALUE);
    }
}
