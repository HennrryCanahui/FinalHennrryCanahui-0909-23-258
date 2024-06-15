import java.util.Scanner;
import javax.print.attribute.standard.JobImpressionsSupported;
public class menu {

    public menu(){

        System.out.println("SERIE 1");
        System.out.println("Opcion #1");
        System.out.println("Opcion #1");
        System.out.println("Opcion #1");
        System.out.println("Opcion #1");
        System.out.println("Opcion #1");

        System.out.println("SERIE 2");
        System.out.println("Opcion #1");
        System.out.println("Opcion #1");
        System.out.println("Opcion #1");


        Scanner input_menu = new Scanner(System.in);
        System.out.println("Digite su respuesta:");
        String respuesta = input_menu.nextLine();
        if(respuesta == "1"){
            // opcion 1
        } else if (respuesta == "2") {
            // opcion 2
        }else if (respuesta == "3") {
            // opcion 3
        }else if (respuesta == "4") {
            // opcion 4
        }else if (respuesta == "5") {
            // opcion 5
        }else if (respuesta == "6") {
            // opcion 6
        }else if (respuesta == "7") {
            // opcion 7
        }else if (respuesta == "8") {
            // opcion 8
        }
        else {
            System.out.println("Respuesta invalida");
        }
    }



}
