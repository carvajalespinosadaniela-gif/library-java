import java.time.LocalDate;

public class Prestamo {

    private Integer idPrestamo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private EstadoPrestamo estado;
    private Usuario usuario;
    private Ejemplar ejemplar;
    private Multa multa;

    public Prestamo() {
    }

    public Prestamo(Integer idPrestamo, LocalDate fechaInicio, LocalDate fechaFin, EstadoPrestamo estado, Usuario usuario, Ejemplar ejemplar, Multa multa) {
        this.idPrestamo = idPrestamo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.usuario = usuario;
        this.ejemplar = ejemplar;
        this.multa = multa;
    }

    public Integer getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(Integer idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public EstadoPrestamo getEstado() {
        return estado;
    }

    public void setEstado(EstadoPrestamo estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public Multa getMulta() {
        return multa;
    }

    public void setMulta(Multa multa) {
        this.multa = multa;
    }

    public void cerrarPrestamo() {
        this.estado = EstadoPrestamo.CERRADO;
    }

    public void abrirPrestamo() {
        this.estado = EstadoPrestamo.ABIERTO;
    }

    public void mostrarInformacion() {
        System.out.println("ID Prestamo: " + idPrestamo);
        System.out.println("Fecha Inicio: " + fechaInicio);
        System.out.println("Fecha Fin: " + fechaFin);
        System.out.println("Estado: " + estado);
        System.out.println("Usuario: " + usuario.getNombre());
    }
}