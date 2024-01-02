public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Por favor ingresar una operación " +
                    "(suma, resta, div o multi) y dos números");
            System.exit(-1);
        }
        String operation = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double resultado = 0.00;
        switch (operation) {
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a - b;
                break;

            case "multi":
                resultado = a * b;
            case "div":
                if (b == 0) {
                    System.exit(-1);
                    System.out.println("Division por cero indefinida");
                }
                resultado = (double) a / b;
            default:
                resultado = a + b;
        }
        System.out.println("El resultado de la operacion es: " + resultado);
    }
}
