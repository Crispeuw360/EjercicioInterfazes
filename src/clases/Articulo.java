package clases;

public abstract class Articulo {

	protected String codigo;
	protected String nombre;
	protected Marca marca;
	protected double precio;
	protected int stock;
	
	public Articulo(String codigo, String nombre, Marca marca, double precio, int stock) 
	{
		this.codigo = codigo;
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
		this.stock = stock;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", nombre=" + nombre + ", marca=" + marca + ", precio=" + precio
				+ ", stock=" + stock + "]";
	}
	
	public  void SumarStock(int stockAñadir)
	{
		this.stock=stock+stockAñadir;
	}
	
	public void QuitarStock(int quitarStock)
	{
		this.stock=stock-quitarStock;
	}
	
	public abstract void printCaracteristicas();
	
	public abstract boolean sano(); 

}
