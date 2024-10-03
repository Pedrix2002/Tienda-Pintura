import java.util.ArrayList;
import java.util.List;

public class Inventario {
    // Atributos
    private List<Producto> productos;

    // Constructor
    public Inventario() {
        productos = new ArrayList<>();
    }

    // Métodos
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public boolean verificarDisponibilidad(Producto producto) {
        return productos.contains(producto) && producto.getCantidad() > 0;
    }

    public void actualizarInventario(Producto producto, int cantidad) {
        for (Producto p : productos) {
            if (p.getId() == producto.getId()) {
                p.actualizarCantidad(cantidad);
            }
        }
    }

    // Método para mostrar los productos en el inventario
    public void mostrarInventario() {
        System.out.println("Inventario de Productos:");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    // Getters y Setters
    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
