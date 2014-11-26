import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class CenaAmigosdos {
		
	public static void main(String[] args) throws IOException {
		
		//se importa el arraylist de recetas e ingredientes
		ArrayList<Receta> recetas = new ArrayList<Receta>();
		ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
	//se pregunta el numero de recetas deseadas	
		System.out.println("Hola, cúantas recetas quieres insertar?");
		Scanner scan = new Scanner(System.in);
		int numRecetas = scan.nextInt();
		int numIngredientes = 0;
		
	//primer for en causa de que i sea igual a cero, menor al numero de recetas y en ordencreciente realizar lo siguiente
			for (int i = 0; i<numRecetas; i++) {
	// se crea el objeto receta llamando a la clase receta
				Receta receta = new Receta();
	//se pide el nombre de la receta
				System.out.println("Dame el nombre de la receta");
				receta.setNombreReceta(scan.next());
	//te pide el numero de recetas
				System.out.println("Dame el nº de ingredientes de la receta");
				numIngredientes = scan.nextInt();

	// segundo for en causa de que j sea igual a 0, menor al numero de ingredientes y en orden creciente realizar lo siguiente
				for (int j= 0; j < numIngredientes; j++) {
	// se crea el objeto ingrediente llamando a la clase ingrediente
					Ingrediente ingrediente = new Ingrediente();

					System.out.println("Dame el nombre del ingrediente" + (j+1));
					ingrediente.setNombreIngrediente(scan.next());
					char enGramos;
					do{
						System.out.println("La cantidad es en gramos?(Y/N)");
						enGramos = scan.next().charAt(0);
						switch (enGramos) {
							case 'Y':
								ingrediente.setEnGramos(true);
								System.out.println("Dame la cantidad en gramos");
								ingrediente.setCantidadGramos(scan.nextInt());
								break;
							case 'N':
								ingrediente.setEnGramos(false);
								System.out.println("Dame la cantidad en unidades");
								ingrediente.setCantidadUnidad(scan.nextInt());
								break;
							default:
								System.out.println("Lo siento, inténtalo otra vez");
								break;
						}
					} while((enGramos != 'Y') && (enGramos != 'N'));
		
					ingredientes.add(ingrediente); 
				}
				receta.setIngredientes(ingredientes);
				System.out.println("Finalmente, explícame brevemente su preparación");
				receta.setPreparación(scan.next());
				recetas.add(receta);
			}

			File archivo = new File ("recetas.txt");
			FileWriter fw = new FileWriter (archivo);

			for (int k=0; k<recetas.size(); k++) {

				fw.write(recetas.get(k).getNombreReceta() + ";");

				for (int l=0; l<ingredientes.size(); l++) {
					fw.write(ingredientes.get(l).getNombreIngrediente() + "*");
					fw.write(ingredientes.get(l).getCantidadUnidad() + "*");
					fw.write(ingredientes.get(l).getCantidadGramos() + "*");
		
					if (l == ingredientes.size() - 1) {
					fw.write(ingredientes.get(l).getEnGramos() + ";");
					}
					else {
					fw.write(ingredientes.get(l).getEnGramos() + "#");
					}

				}

				fw.write(recetas.get(k).getPreparación() + "\n");
		
			}
			fw.close();
			
			File archivo2 = new File ("recetas.txt");
			//FileReader fr = new FileReader(archivo2);
			FileInputStream fis = new FileInputStream(archivo2);
	        
	        InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br2 = new BufferedReader(isr);
			
			String linea;
			linea = br2.readLine();
			String [] campos = null;
			System.out.println("\n estas son tus recetas");
			

			while (linea != null) {
			campos = linea.split(";");
	        	System.out.println("<><><><><><><><><><><><><><><><>");
	        	System.out.println("Nombre: "+campos[0]);
	       		System.out.println("Descripcion: "+campos[2]);
	       		String ingre = campos[1];
	       		campos = ingre.split("#");
	       		
	       		for(int x=0; x<campos.length; x++){
	       			String ingreAtribSeparados = campos[x];
	       			String [] campos2 = ingreAtribSeparados.split("\\*");
	       			System.out.println("Ingredientes: "+numIngredientes);
	       			System.out.println("Nombre: "+campos2[0]);
	       			System.out.println("Gramos: "+campos2[2]);
	       			System.out.println("Unidades: "+campos2[1]);
	       			System.out.println("<><><><><><><><><><><><><><><><>");
				
			}
			linea = br2.readLine();

			//fr.close();


		}
	}
}	

