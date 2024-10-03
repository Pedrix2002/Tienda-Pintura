public class Producto {
    // Atributos
    private int id;
    private String nombre;
    private String color;
    private int cantidad;
    private double precio;

    // Constructor
    public Producto(int id, String nombre, String color, int cantidad, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // Métodos
    public void actualizarCantidad(int nuevaCantidad) {
        this.cantidad = nuevaCantidad;
    }

    public void mostrarInfo() {
        System.out.println("Producto ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio: $" + precio);
    }

    // Getters y Setters (opcional, dependiendo de la necesidad)
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
