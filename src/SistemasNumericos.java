import javax.swing.*;

public class SistemasNumericos {

    public static void main(String[] args) {
        String numeroString = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        try {
            int numeroDecimal = Integer.parseInt(numeroString);

            System.out.println("numeroDecimal = " + numeroDecimal);
            String textoBinario = "número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
            System.out.println(textoBinario);

            int numeroBinario = 0b111110100;
            System.out.println("numeroBinario = " + numeroBinario);
            String textoOctal = "numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal);
            System.out.println(textoOctal);
            int numeroOctal = 0764;
            System.out.println("numeroOctal = " + numeroOctal);
            String textoHexadecimal = "numero hexadecimal de " + numeroBinario + " = " + Integer.toHexString(numeroDecimal);
            System.out.println(textoHexadecimal);

            int numeroHex = 0x1F4;
            System.out.println("numeroHex = " + numeroHex);
            String message = textoBinario;
            message += "\n" + textoOctal;
            message += "\n" + textoHexadecimal;
            JOptionPane.showMessageDialog(null, message);
        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }
    }
}
