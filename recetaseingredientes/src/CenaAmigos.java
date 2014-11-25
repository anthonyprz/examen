import java.util.*;
import java.io.*;
public class  CenaAmigos {

 	 public static void main(String[] args) throws IOException {
 		

	int numeroRecetas;
	Scanner recet = new Scanner(System.in);
	System.out.println("dime el numero de recetas que deseas utilizar");
	numeroRecetas =  recet.nextInt();

	
	while (numeroRecetas > 0)
		
		String nombreIngrediente;
		int cantidaGramos;
		int cantidadUnidad;
		System.out.println("¿el ingrediente?");
		nombreIngrediente = recet.next();
		System.out.println("¿la cantidad en gramos?");
		cantidaGramos = recet.nextInt();
		System.out.println("¿la cantidad en unidad?");
		cantidadUnidad = recet.nextInt();
		//setters ingrediente
		Ingredientes ingredientes = Ingredientes();
		ingredientes.setNombreIngrediente(nombreIngrediente);
		ingredientes.setCantidadGramos(cantidaGramos);
		ingredientes.setCantidadUnidad(cantidadUnidad);


		
	 try {

	
	//declaración de rutas del archivo
	File buscareceta = new File ("/home/zubiri//home/zubiri/Escritorio/recetaseingredientes/src/recetas.txt");
	Scanner linea = new Scanner(buscareceta);
	ArrayList<Receta> = new ArrayList<Receta>();

	if (linea.hasNextLine())
		System.out.print("\n----informacion de las recetas----\n");

			while (linea.hasNextLine())
						{   

					String puntoycoma = linea.nextLine();
					String[] separarpuntoycoma = puntoycoma.split(";");

					Receta rec = new Receta();
					String nombreReceta = separarpuntoycoma [0]; 
					
					ArrayList<Ingrediente> ingredientes = separarpuntoycoma [1];{
									
										String asterisco = linea.nextLine();
										String[] separarasterisco = asterisco.split("*");
										Ingrediente ing = new Ingrediente();
										String nombreIngrediente = separarasterisco [0];
										int cantidadGramos = separarasterisco [1];
										int setCantidadUnidad = separarasterisco [2];
											}

					String preparación = separarpuntoycoma [2];

						Receta.add(rec);


			for (int c=0; c<Receta.size(); c++){

				System.out.println(" nombre de la receta: "+Receta.get(c).getNombreReceta());
				System.out.println(" ingredientes: "+Receta.get(c).getIngredientes());
				System.out.println("nombre ingrediente " Ingrediente.get(c).getNombreIngrediente);
				System.out.println("nombre ingrediente " Ingrediente.get(c).getCantidadGramos);
				System.out.println("nombre ingrediente " Ingrediente.get(c).getCantidadUnidad);
				System.out.println(" la preparación: "+Receta.get(c).getPreparación());

			}

						 }




			}
			 catch (FileNotFoundException e) 
	{
       		 System.out.println(e.getMessage());
 
			
		}
	 	}
}