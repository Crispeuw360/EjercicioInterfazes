package clases;

public class Vino extends Articulo{

	private String color;
	private String origen;
	private int año;
	private String uva;
	
	public Vino(String codigo, String nombre, Marca marca, double precio, int stock, String color, String origen,int año, String uva) 
	{
		super(codigo, nombre, marca, precio, stock);
		this.color = color;
		this.origen = origen;
		this.año = año;
		this.uva = uva;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getUva() {
		return uva;
	}

	public void setUva(String uva) {
		this.uva = uva;
	}

	@Override
	public String toString() {
		return this.toString()+"Vino [color=" + color + ", origen=" + origen + ", año=" + año + ", uva=" + uva + "]";
	}
	
	@Override
	public void printCaracteristicas()
	{
		System.out.println(this.toString());
	}
	
	public boolean sano()
	{
		if(this.origen.equalsIgnoreCase("rioja"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
