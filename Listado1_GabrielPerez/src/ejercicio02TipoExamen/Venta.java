package ejercicio02TipoExamen;

import java.util.ArrayList;

public class Venta {

    private ArrayList<Producto> listaProductos;

    public Venta(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    // Cantidad total de productos por vender
    public int productosPorVender() {
        int total = 0;
        for (Producto p : listaProductos) {
            if (!p.isVendido()) {
                total += p.getNumProductos();
            }
        }
        return total;
    }

    // Dinero total recaudado (solo productos vendidos)
    public double totalRecaudado(double porcentajeGanancia) {
        double total = 0;
        for (Producto p : listaProductos) {
            if (p.isVendido()) {
                total += p.calcularPVP(porcentajeGanancia) * p.getNumProductos();
            }
        }
        return total;
    }

    // Calcular cambio
    public double devolverCambio(double totalPagar, double dineroEntregado) {
        return dineroEntregado - totalPagar;
    }

    // Mostrar listado de productos con mensajes especiales
    public void mostrarProductos(double porcentajeGanancia) {
        for (Producto p : listaProductos) {
            System.out.println(p.toString());
            System.out.println("PVP: " + p.calcularPVP(porcentajeGanancia));

            if (p instanceof Espada && ((Espada) p).getTipo().equalsIgnoreCase("Doble")) {
                System.out.println("¡Cuidadín al sacarla de la bolsa, que hace pupa!");
            }

            System.out.println("--------------------------------------");
        }
    }
}
