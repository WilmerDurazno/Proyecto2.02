package modelo;

public abstract class Libro {
	private int id;
	private String titulo;
	private String autor;
	private String edicion;
	private double precio;
	
	public double calcularPrecio() {
		double precio= this.getPrecio()+this.calcularComision();
		return precio;
	}
	
	
	public abstract double calcularComision();
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEdicion() {
		return edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", edicion=" + edicion + ", precio="
				+ precio + "]";
	}
	
	
	
	
}