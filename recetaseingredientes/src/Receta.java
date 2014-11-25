import java.util.*;
import java.io.*;

public class Receta {
	
	String nombreReceta;
	ArrayList<Ingrediente> ingredientes;
	String preparación;

	//getters 
 	public String getNombreReceta() {

		return this.nombreReceta;
	}	
	
		public ArrayList<Ingrediente> getIngredientes (){
		return this.ingredientes;
	}
	public String getPreparación() {
		return this.preparación;
	}

	//setters 
	public void setNombreReceta(String nombreReceta) {

		this.nombreReceta = nombreReceta;
	}
	public void setIngredientes(ArrayList<Ingrediente> ingredientes){
		this.ingredientes = ingredientes;
	}
	public void setPreparación(String preparación){
		this.preparación = preparación;
	}
	


}