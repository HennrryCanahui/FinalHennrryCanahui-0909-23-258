import java.util.Scanner;

public class ExamenFinalVarianteA {

    public ExamenFinalVarianteA(){ //constructor
    }

    public String Concatenacion (String x, String y , String z) {
        String respuesta = x +" "+ y +  " " +z ;
        return respuesta;
    }

    public int tablaMultiplicacion(int num) {
        String respuesta = null;
        for (int i = 0; i > num; i++) {
            int operacion = num * i;

            respuesta = num + "*" + i + "=" + operacion;
        }
        return respuesta;
    }


    public int operacion(){
        Scanner input_menu = new Scanner(System.in);
        System.out.println("Digite el primer numero:");
        String num_uno = input_menu.nextLine();

        System.out.println("Digite el segundo numero:");
        String num_dos = input_menu.nextLine();

        System.out.println("Digite el operador:");
        String operador  = input_menu.nextLine();

        s


        return r

    }






}



