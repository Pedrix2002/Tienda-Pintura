import java.util.Date;

public class Factura {
    // Atributos
    private int id;
    private Pedido pedido;
    private Date fecha;
    private double total;

    // Constructor
    public Factura(int id, Pedido pedido, Date fecha, double total) {
        this.id = id;
        this.pedido = pedido;
        this.fecha = fecha;
        this.total = total;
    }

    // Métodos
    public void mostrarFactura() {
        System.out.println("Factura ID: " + id);
        System.out.println("Fecha: " + fecha);
        System.out.println("Pedido ID: " + pedido.getId());
        System.out.println("Total: $" + total);
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
