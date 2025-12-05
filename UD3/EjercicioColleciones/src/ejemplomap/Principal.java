package ejemplomap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pelicula p1 = new Pelicula(1L, "Barbie", "Fantasía", 5, 1.20);
		Pelicula p3 = new Pelicula(2L, "Fast and Furious", "Carreras", 7, 2.30);
		Pelicula p4 = new Pelicula(3L, "Zoopolis", "Fantasía", 5, 2);
		
		List<String> generos = new ArrayList<String>();
		
		generos.add("Fantasía");
		generos.add("Carreras");
		
		Map<Long, Pelicula> peliculas = new HashMap<Long, Pelicula>();
		
		peliculas.put(1L, p1);
		peliculas.put(2L, p3);
		peliculas.put(3L, p4);
		
		Gestion gestion = new Gestion(peliculas);
		
		double precioMin;
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Diga por que precio quiere ver las peliculas");
		precioMin = Double.parseDouble(sc.nextLine());
		
		
		System.out.println(gestion.ordenarPeliculasPorPrecio(precioMin));
		System.out.println(gestion.verPeliculasPorGenero("Fantasía"));

	}

}
