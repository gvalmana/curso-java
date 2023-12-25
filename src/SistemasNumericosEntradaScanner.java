import javax.swing.*;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        String numeroString = scanner.nextLine();
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroString);
        } catch (NumberFormatException exception) {
            System.out.println("Debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }
        System.out.println("numeroDecimal = " + numeroDecimal);
        String textoBinario = "número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String textoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String textoHexadecimal = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        String message = textoBinario;
        message += "\n" + textoOctal;
        message += "\n" + textoHexadecimal;
        System.out.println(message);
    }
}
