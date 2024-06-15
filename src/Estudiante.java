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
