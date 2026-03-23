import java.time.LocalDate;
import java.util.List;

public static void main() {

    Biblioteca biblioteca = new Biblioteca("Biblioteca Central");


    // EJEMPLARES
    Ejemplar ejemplar1 = new Ejemplar(1, "Disponible", "Estante A1");
    Ejemplar ejemplar2 = new Ejemplar(2, "Disponible", "Estante A2");
    Ejemplar ejemplar3 = new Ejemplar(3, "Disponible", "Estante A3");
    Ejemplar ejemplar4 = new Ejemplar(4, "Disponible", "Estante A4");

    // Listas de Ejemplares
    List<Ejemplar> ejemplaresLibro1 = List.of(ejemplar1);
    List<Ejemplar> ejemplaresLibro2 = List.of(ejemplar2);
    List<Ejemplar> ejemplaresLibro3 = List.of(ejemplar3);
    List<Ejemplar> ejemplaresLibro4 = List.of(ejemplar4);

    // LIBROS
    Libro libro1 = new Libro("123", "Cien años de soledad", "Gabriel Garcia Marquez", "Sudamericana", 1967, ejemplaresLibro1);
    Libro libro2 = new Libro("456", "Don Quijote", "Miguel de Cervantes", "Editorial A", 1605, ejemplaresLibro2);
    Libro libro3 = new Libro("789", "El Principito", "Antoine de Saint-Exupery", "Editorial B", 1943, ejemplaresLibro3);
    Libro libro4 = new Libro("101", "Soy un hijo victorioso", "Eduardo Cañas", "Editorial C", 2020, ejemplaresLibro4);

    biblioteca.agregarLibro(libro1);
    biblioteca.agregarLibro(libro2);
    biblioteca.agregarLibro(libro3);
    biblioteca.agregarLibro(libro4);

    // USUARIOS
    Usuario usuario1 = new Usuario(1, "Danny", "correo@gmail.com", "3001234567");
    Bibliotecario bibliotecario1 = new Bibliotecario(2, "Emilsen", "emilsen@gmail.com", "3009876543", "EMP001");

    biblioteca.registrarUsuario(usuario1);
    biblioteca.registrarUsuario(bibliotecario1);



    // PRÉSTAMOS
    Prestamo prestamo1  = new Prestamo();
    AsignarAtributosDelPrestamo1(prestamo1, usuario1, ejemplar1);
    Prestamo prestamo2 = new Prestamo(1002, LocalDate.now(), LocalDate.now().plusDays(7), EstadoPrestamo.ABIERTO, usuario1, ejemplar2, null);
    Prestamo prestamo3 = new Prestamo(1003, LocalDate.now(), LocalDate.now().plusDays(7), EstadoPrestamo.ABIERTO, usuario1, ejemplar3, null);
    Prestamo prestamo4 = new Prestamo(1004, LocalDate.now(), LocalDate.now().plusDays(7), EstadoPrestamo.ABIERTO, usuario1, ejemplar4, null);

    biblioteca.registrarPrestamo(prestamo1);
    biblioteca.registrarPrestamo(prestamo2);
    biblioteca.registrarPrestamo(prestamo3);
    biblioteca.registrarPrestamo(prestamo4);

    // MOSTRAR DATOS
    System.out.println("\n=== LIBROS ===");
    biblioteca.mostrarLibros();

    System.out.println("\n=== USUARIOS ===");
    biblioteca.mostrarUsuarios();

    System.out.println("\n=== BIBLIOTECARIO ===");
    bibliotecario1.mostrarInformacion();

    System.out.println("\n=== BUSQUEDA POR TITULO ===");
    Libro libroBuscado = biblioteca.buscarPorTitulo("Don Quijote");
    if (libroBuscado != null) {
        libroBuscado.mostrarInformacion();
    } else {
        System.out.println("Libro no encontrado.");
    }

    System.out.println("\n=== BUSQUEDA POR AUTOR ===");
    biblioteca.buscarPorAutor("Eduardo Cañas");

    System.out.println("\n=== PRESTAMOS ===");
    biblioteca.mostrarPrestamos();

    System.out.println("\n=== MULTA ===");


}

private static void AsignarAtributosDelPrestamo1(Prestamo prestamo1, Usuario usuario1, Ejemplar ejemplar1) {
    prestamo1.setIdPrestamo(1001);
    prestamo1.setFechaInicio(LocalDate.now());
    prestamo1.setFechaFin(LocalDate.now().plusDays(7));
    prestamo1.setEstado(EstadoPrestamo.ABIERTO);
    prestamo1.setUsuario(usuario1);
    prestamo1.setEjemplar(ejemplar1);
    prestamo1.setMulta(new Multa(1, 5000, false));
}