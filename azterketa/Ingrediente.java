
public class Ingrediente {

	private String nombreIngrediente;
	private int cantidadGramos;
	private int cantidadUnidad;
	private boolean enGramos;




	public String getNombreIngrediente () {
	
		return this.nombreIngrediente;
	}

	public void setNombreIngrediente (String nombreIngrediente1) {

		this.nombreIngrediente = nombreIngrediente1;
	}

	public int getCantidadGramos() {
	
		return this.cantidadGramos;
	}

	public void setCantidadGramos (int cantidadGramos1) {

		this.cantidadGramos = cantidadGramos1;
	}

	public int getCantidadUnidad() {
	
		return this.cantidadUnidad;
	}

	public void setCantidadUnidad (int cantidadUnidad1) {

		this.cantidadUnidad = cantidadUnidad1;
	}

	public boolean getEnGramos() {
	
		return this.enGramos;
	}

	public void setEnGramos (boolean enGramos1) {

		this.enGramos = enGramos1;
	}

}



