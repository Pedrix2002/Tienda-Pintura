public class Empleado {
    // Atributos
    private int id;
    private String nombre;
    private String cargo;
    private String telefono;

    // Constructor
    public Empleado(int id, String nombre, String cargo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.telefono = telefono;
    }

    // Métodos
    public void gestionarPedido(Pedido pedido) {
        System.out.println(nombre + " está gestionando el pedido con ID " + pedido.getId());
    }

    public void actualizarInventario(Inventario inventario, Producto producto) {
        System.out.println(nombre + " está actualizando el inventario para el producto " + producto.getNombre());
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
