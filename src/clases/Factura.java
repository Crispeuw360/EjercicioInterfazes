package clases;

import java.util.ArrayList;

public class Factura implements Facturacion{

	private int numero;
	private String nombre;
	private String apellido;
	private ArrayList<Linea_Factura> lineasFactura;
	private double total;
	
	public Factura(int numero, String nombre, String apellido, ArrayList<Linea_Factura> lineasFactura, double total) 
	{
		this.numero = numero;
		this.nombre = nombre;
		this.apellido = apellido;
		this.lineasFactura = lineasFactura;
		this.total = total;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public ArrayList<Linea_Factura> getLineasFactura() {
		return lineasFactura;
	}

	public void setLineasFactura(ArrayList<Linea_Factura> lineasFactura) {
		this.lineasFactura = lineasFactura;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Factura [numero=" + numero + ", nombre=" + nombre + ", apellido=" + apellido + ", lineasFactura="
				+ lineasFactura + ", Total=" + total + "]";
	}
	
	public void añadirLinea(String codigo,int cantidad,double total)
	{
		Linea_Factura l = new Linea_Factura(codigo,cantidad,total);
		lineasFactura.add(l);
	}
	
	public void print()
	{
		System.out.println(this.toString());
	}
	
	public double calcularTotal()
	{
		return (this.total+(this.total*IVA));
	}

}
