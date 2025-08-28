public class Product {

    private String nombre;
    private double costoUnitario;
    private int stock;


    public Product(String nombre, double costoUnitario, int stock) {
        this.nombre = titulo;
        this.costoUnitario = costoUnitario;
        this.stock = stock;
    }


    public void vender(int unidades) {
        if (unidades <= stock) {
            stock -= unidades;
            System.out.println("Venta realizada: " + unidades + " unidad(es) de " + nombre);
        } else {
            System.out.println("⚠ No hay suficientes existencias de " + nombre + ". Stock disponible: " + stock);
        }
    }


    public void Stock(int unidades) {
        if (unidades > 0) {
            stock += unidades;
            System.out.println(unidades + " unidades añadidas al inventario de " + nombre);
        } else {
            System.out.println("numero de datos no existente...");
        }
    }


    public void mostrarInfo() {
        System.out.println("📦 Producto: " + nombre + 
                           " | Precio: $" + costoUnitario + 
                           " | En inventario: " + stock);
    }


    public static void main(String[] args) {

        Producto p1 = new Product("pc portable", 89.99, 15);
        Producto p2 = new Product("Teclado Mecánico", 149.50, 8);


        p1.mostrarInfo();
        p1.vender(5);
        p1.mostrarInfo();
        p1.vender(20); 
        p1.Stock(10);
        p1.mostrarInfo();

        System.out.println("----------------------------");

        p2.mostrarInfo();
        p2.vender(3);
        p2.mostrarInfo();
        p2.Stock(5);
        p2.mostrarInfo();
    }
}