import javax.print.attribute.standard.JobImpressionsSupported;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        menu opciones = new menu();






        System.out.println("Ingresa la primera palabra:");
        String palabra_uno = input.nextLine();
        System.out.println("Ingresa la segunda palabra:");
        String palabra_dos = input.nextLine();
        System.out.println("Ingresa la tercera palabra:");
        String palabra_tes = input.nextLine();

        ExamenFinalVarianteA cadena = new ExamenFinalVarianteA();
        System.out.println(cadena.Concatenacion(palabra_uno, palabra_dos, palabra_tes));

        //


        ExamenFinalVarianteA tabla = new ExamenFinalVarianteA();
        int numero = input.nextInt();
        System.out.println(tabla.tablaMultiplicacion(numero));







    }
}