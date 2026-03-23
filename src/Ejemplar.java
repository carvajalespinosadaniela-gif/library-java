
public class Ejemplar {

    private int idEjemplar;
    private String estado;
    private String ubicacion;


    public Ejemplar() {
    }

    public Ejemplar(int idEjemplar, String estado, String ubicacion) {
        this.idEjemplar = idEjemplar;
        this.estado = estado;
        this.ubicacion = ubicacion;
    }

    public int getIdEjemplar() {
        return idEjemplar;
    }

    public void setIdEjemplar(int idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public void mostrarInformacion() {
        System.out.println("ID Ejemplar: " + idEjemplar);
        System.out.println("Estado: " + estado);
        System.out.println("Ubicacion: " + ubicacion);
    }
}