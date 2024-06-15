import java.util.Scanner;

public class ExamenFinalVarianteA {

    public ExamenFinalVarianteA() { // Constructor
    }

    public String Concatenacion(String x, String y, String z) {
        String respuesta = x + " " + y + " " + z;
        return respuesta;
    }

    public String tablaMultiplicacion(int num) {
        StringBuilder respuesta = new StringBuilder();
        for (int i = 1; i <= 10; i++) { // Corregido para que i comience en 1 y se repita hasta 10
            int operacion = num * i;
            respuesta.append(num).append("*").append(i).append("=").append(operacion).append("\n");
        }
        return respuesta.toString();
    }

    public String operacion() {
        Scanner input_menu = new Scanner(System.in);
        System.out.println("Digite el primer numero:");
        int num_uno = Integer.parseInt(input_menu.nextLine());

        System.out.println("Digite el segundo numero:");
        int num_dos = Integer.parseInt(input_menu.nextLine());

        System.out.println("Digite el operador:");
        String operador = input_menu.nextLine();

        int resultado;
        switch (operador) {
            case "+":
                resultado = num_uno + num_dos;
                break;
            case "-":
                resultado = num_uno - num_dos;
                break;
            case "*":
                resultado = num_uno * num_dos;
                break;
            case "/":
                resultado = num_uno / num_dos;
                break;
            default:
                return "Operador no válido";
        }

        return num_uno + " " + operador + " " + num_dos + " = " + resultado; // Retorna la operación y el resultado
    }

    public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // El número 1 y los negativos no son primos
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Si es divisible por cualquier número aparte de sí mismo y 1, no es primo
            }
        }
        return true; // El número es primo
    }
}
