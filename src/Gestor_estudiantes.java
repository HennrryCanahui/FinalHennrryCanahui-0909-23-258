import java.util.ArrayList;
import java.util.Scanner;

public class Gestor_estudiantes {
    private ArrayList<Estudiante> listaEstudiantes;

    public Gestor_estudiantes() {
        listaEstudiantes = new ArrayList<>();
    }

    public void agregarEstudiantes() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el nombre del estudiante:");
            String nombre = scanner.nextLine();
            System.out.println("Introduce la calificación del estudiante:");
            double calificacion = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer del scanner

            Estudiante nuevoEstudiante = new Estudiante(nombre, calificacion);
            listaEstudiantes.add(nuevoEstudiante);
        }
    }

    // Método para imprimir la lista de estudiantes
    public void imprimirListaEstudiantes() {
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre() + ", Calificación: " + estudiante.getClasificacion());
        }
    }
}
