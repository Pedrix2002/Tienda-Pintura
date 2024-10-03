import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    // Atributos
    private int id;
    private Date fecha;
    private Cliente cliente;
    private List<Producto> productos;
    private double total;

    // Constructor
    public Pedido(int id, Date fecha, Cliente cliente) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.total = 0.0;
    }

    // Métodos
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        total += producto.getPrecio();
    }

    public double calcularTotal() {
        return total;
    }

    public Factura generarFactura() {
        return new Factura(id, this, fecha, total);
    }

    public void mostrarPedido() {
        System.out.println("Pedido ID: " + id);
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Productos:");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
        System.out.println("Total: $" + calcularTotal());
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
