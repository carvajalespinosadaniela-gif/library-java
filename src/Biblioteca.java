import java.util.ArrayList;

public class Biblioteca {

    private String nombre;
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Prestamo> prestamos;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void registrarPrestamo(Prestamo prestamo) {
        Usuario usuario = prestamo.getUsuario();
        int contador = 0;

        for (Prestamo p : prestamos) {
            if (p.getUsuario().equals(usuario) && p.getEstado().equals(EstadoPrestamo.ABIERTO)) {
                contador++;
            }
        }

        if (contador >= 3) {
            System.out.println("No se puede registrar el prestamo. El usuario ya tiene 3 prestamos activos.");
        } else {
            prestamos.add(prestamo);
            System.out.println("Prestamo registrado correctamente.");
        }
    }

    public Libro buscarPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public void buscarPorAutor(String autor) {
        boolean encontrado = false;

        for (Libro libro : libros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                libro.mostrarInformacion();
                System.out.println("-------------------");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron libros de ese autor.");
        }
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            libro.mostrarInformacion();
            System.out.println("-------------------");
        }
    }

    public void mostrarUsuarios() {
        for (Usuario usuario : usuarios) {
            usuario.mostrarInformacion();
            System.out.println("-------------------");
        }
    }

    public void mostrarPrestamos() {
        for (Prestamo prestamo : prestamos) {
            prestamo.mostrarInformacion();
            System.out.println("-------------------");
        }
    }
}