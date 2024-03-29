import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();

        System.out.println("Variables configuracion ambiente = " + varEnv);
        System.out.println("---------- LISTANDO VARIABLES DEL SISTEMA ---------");
        for (String key: varEnv.keySet()){
            System.out.println(key + " => " + varEnv.get(key));
        }
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String tempDir = System.getenv("TEMP");
        System.out.println("tempDir = " + tempDir);

        String path = System.getenv("PATH");
        System.out.println("path = " + path);

        String path2 = varEnv.get("PATH");
        System.out.println("path2 = " + path2);
    }
}
