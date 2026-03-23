public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private String telefono;

    public Usuario(int id, String nombre, String email, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void solicitarPrestamo() {
        System.out.println(nombre + " solicito un prestamo.");
    }

    public void devolverLibro() {
        System.out.println(nombre + " devolvio un libro.");
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Telefono: " + telefono);
    }
}







