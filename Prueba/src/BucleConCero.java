import java.util.Scanner;

public class BucleConCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Introduce números (para salir, escribe 0):");

        numero = sc.nextInt(); // Primer valor

        while (numero != 0) { // Mientras no sea 0
            System.out.println("Has introducido: " + numero);

            // Pedimos otro número
            System.out.print("Introduce otro número (0 para salir): ");
            numero = sc.nextInt();
        }

        System.out.println("Fin del programa. 👋");
        sc.close();
    }
}
