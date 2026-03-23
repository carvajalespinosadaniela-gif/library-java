public class Multa {

    private int idMulta;
    private double monto;
    private boolean pagado;

    public Multa(int idMulta, double monto, boolean pagado) {
        this.idMulta = idMulta;
        this.monto = monto;
        this.pagado = pagado;
    }

    public int getIdMulta() {
        return idMulta;
    }

    public double getMonto() {
        return monto;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void calcularMonto() {
        System.out.println("El monto de la multa es: " + monto);
    }

    public void registrarPago() {
        pagado = true;
        System.out.println("La multa fue pagada.");
    }

    public void mostrarInformacion() {
        System.out.println("ID Multa: " + idMulta);
        System.out.println("Monto: " + monto);
        System.out.println("Pagado: " + pagado);
    }
}