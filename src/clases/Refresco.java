package clases;

public class Refresco extends Articulo {

	private String sabor;
	private boolean zumo;
	private boolean gas;
	private int azucar;

	public Refresco(String codigo, String nombre, Marca marca, double precio, int stock, String sabor, boolean zumo,boolean gas, int azucar) 
	{
		super(codigo, nombre, marca, precio, stock);
		this.sabor = sabor;
		this.zumo = zumo;
		this.gas = gas;
		this.azucar = azucar;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public boolean isZumo() {
		return zumo;
	}

	public void setZumo(boolean zumo) {
		this.zumo = zumo;
	}

	public boolean isGas() {
		return gas;
	}

	public void setGas(boolean gas) {
		this.gas = gas;
	}

	public int getAzucar() {
		return azucar;
	}

	public void setAzucar(int azucar) {
		this.azucar = azucar;
	}

	@Override
	public String toString() {
		return super.toString()+"Refresco [sabor=" + sabor + ", zumo=" + zumo + ", gas=" + gas + ", azucar=" + azucar + "]";
	}

	@Override
	public void printCaracteristicas()
	{
		System.out.println(this.toString());
	}

	@Override
	public boolean sano()
	{
		if(this.azucar<25)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
