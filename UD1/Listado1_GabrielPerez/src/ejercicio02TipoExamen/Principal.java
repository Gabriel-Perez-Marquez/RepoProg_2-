package ejercicio02TipoExamen;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Producto> lista = new ArrayList<>();

        
        lista.add(new Movil(400, 2, "Galaxy S24", true, "Samsung", 256, 8));
        lista.add(new Movil(300, 1, "iPhone SE", false, "Apple", 128, 4));
        lista.add(new Espada(150, 1, "Espada Jedi Azul", true, "simple"));
        lista.add(new Espada(200, 1, "Espada Doble Roja", false, "doble"));

        
        Venta ventas = new Venta(lista);

        double porcentajeGanancia = 20;

        System.out.println("LISTADO DE PRODUCTOS");
        ventas.mostrarProductos(porcentajeGanancia);

        System.out.println("\nCANTIDAD DE PRODUCTOS POR VENDER");
        System.out.println(ventas.productosPorVender());

        System.out.println("\nTOTAL RECAUDADO");
        System.out.println(ventas.totalRecaudado(porcentajeGanancia) + " €");

    }
}
