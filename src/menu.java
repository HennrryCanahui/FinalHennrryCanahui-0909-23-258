import java.util.Scanner;

public class menu {
    private ExamenFinalVarianteA examen;

    public menu() {
        examen = new ExamenFinalVarianteA();
        Scanner input_menu = new Scanner(System.in);

        System.out.println("SERIE 1");
        System.out.println("Opcion #1: Concatenar palabras");
        System.out.println("Opcion #2: Tabla de multiplicación");
        System.out.println("Opcion #3: Operación aritmética");
        System.out.println("Opcion #4: Verificar si un número es primo");

        System.out.println("Digite su opción:");
        String respuesta = input_menu.nextLine();

        switch (respuesta) {
            case "1":
                concatenarPalabras(input_menu);
                break;
            case "2":
                mostrarTablaMultiplicacion(input_menu);
                break;
            case "3":
                realizarOperacionAritmetica();
                break;
            case "4":
                verificarSiNumeroEsPrimo(input_menu);
                break;
            default:
                System.out.println("Respuesta inválida");
                break;
        }
    }

    private void concatenarPalabras(Scanner input) {
        System.out.println("Ingresa la primera palabra:");
        String palabra_uno = input.nextLine();
        System.out.println("Ingresa la segunda palabra:");
        String palabra_dos = input.nextLine();
        System.out.println("Ingresa la tercera palabra:");
        String palabra_tres = input.nextLine();

        System.out.println(examen.Concatenacion(palabra_uno, palabra_dos, palabra_tres));
    }

    private void mostrarTablaMultiplicacion(Scanner input) {
        System.out.println("Ingresa un número para ver su tabla de multiplicación:");
        int numero = Integer.parseInt(input.nextLine());
        System.out.println(examen.tablaMultiplicacion(numero));
    }

    private void realizarOperacionAritmetica() {
        System.out.println(examen.operacion());
    }

    private void verificarSiNumeroEsPrimo(Scanner input) {
        System.out.println("Por último, ingresa un número para verificar si es primo:");
        int numPrimo = Integer.parseInt(input.nextLine());
        boolean esPrimo = examen.esPrimo(numPrimo);
        if (esPrimo) {
            System.out.println(numPrimo + " es un número primo.");
        } else {
            System.out.println(numPrimo + " no es un número primo.");
        }
    }
}
