import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


public class CenaAnthony  {

	public static void main(String[] args) throws IOException {
			
			//se importa el arraylist de recetas e ingredientes
		ArrayList<Receta> recetas = new ArrayList<Receta>();
		ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		//se pregunta el numero de recetas deseadas	
		System.out.println("Hola, cúantas recetas quieres insertar?");
		Scanner scan = new Scanner(System.in);
		int numerorecetas = scan.nextInt();
		//se crean estas variables para que no de errores
		int numIngredientes = 0;
		String preparacion = null;

		for (int a = 0; a <  numerorecetas; a++ ) {

			Receta receta = new Receta();
			System.out.println("dime el nombre de la receta");
		}






		}	
}