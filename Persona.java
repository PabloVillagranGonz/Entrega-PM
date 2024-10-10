public class Persona implements Imprimible  {
    private String nombre;
    private String apellidos;
    private String dni;

    public Persona(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    // Metodos get
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    // Metodo para validar Nombre o Apellido
    public static boolean validarNombreApellido(String texto){
        return texto.matches("[a-zA-ZÁÉÍÓÚáéíóúñÑ]+");
    }

    // Metodo para validar DNI
    public static boolean validarDNI(String dni) {
        return dni.matches("\\d{8}[A-Za-z]");
    }

    // Implementacion del metodo de la interfaz imprimible
    @Override
    public String devolverInfoString() {
        return nombre + " " + apellidos + " (DNI: " + dni + ")";
    }
}