package clases;

public class Linea_Factura {

	private String Codigo; 
	private int Cantidad;
	private double totalLinea;
	
	public Linea_Factura(String codigo, int cantidad, double totalLinea) 
	{
		Codigo = codigo;
		Cantidad = cantidad;
		this.totalLinea = totalLinea;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public double getTotalLinea() {
		return totalLinea;
	}

	public void setTotalLinea(double totalLinea) {
		this.totalLinea = totalLinea;
	}

	@Override
	public String toString() {
		return "Linea_Factura [Codigo=" + Codigo + ", Cantidad=" + Cantidad + ", totalLinea=" + totalLinea + "]";
	}
}
