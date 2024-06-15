public class Estudiante {
    private String nombre;
    private double clasificacion;

    // Constructor
    public Estudiante(String nombre, double clasificacion) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
    }

    // Método para obtener el nombre del estudiante
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la clasificación del estudiante
    public double getClasificacion() {
        return clasificacion;
    }
}


// utilizando arraylist escribe un metodo que gestione una lista de estudiantes cada estudiante tiene un nombre y na calificacion , el metodo debe permetir agregar estuantes a la lista y se tiene que repetir 5 veces para almecenar 5 estudantes