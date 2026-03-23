public class Bibliotecario extends Usuario {

    private String codigoEmpleado;

    public Bibliotecario(int id, String nombre, String email, String telefono, String codigoEmpleado) {
        super(id, nombre, email, telefono);
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void registrarLibro() {
        System.out.println("El bibliotecario registró un libro.");
    }

    public void aprobarPrestamo() {
        System.out.println("El bibliotecario aprobó el préstamo.");
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Codigo Empleado: " + codigoEmpleado);
    }
}