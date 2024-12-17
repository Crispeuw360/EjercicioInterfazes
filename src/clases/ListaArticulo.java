package clases;

import java.util.ArrayList;

public class ListaArticulo {

	private ArrayList<Articulo> lista;

	public ListaArticulo(ArrayList<Articulo> lista) 
	{
		this.lista = lista;
	}

	public ArrayList<Articulo> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Articulo> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "ListaArticulo [lista=" + lista + "]";
	}
	
	public void fillData()
	{
		lista = new ArrayList<>(); // Inicializa la lista si es nula

		// Agregar Refrescos
        lista.add(new Refresco("R001", "Coca-Cola", Marca.JUVER, 1.5, 100, "Cola", false, true, 35));
        lista.add(new Refresco("R002", "Sprite", Marca.JUVER, 1.2, 150, "Limon", false, true, 20));
        lista.add(new Refresco("R003", "Fanta Naranja", Marca.JUVER, 1.3, 120, "Naranja", false, true, 40));
        lista.add(new Refresco("R004", "Aquarius", Marca.JUVER, 1.1, 80, "Limon", true, false, 15));

        // Agregar Vinos
        lista.add(new Vino("V001", "Marqués de Cáceres", Marca.RAMON_BILBAO, 12.0, 50, "Tinto", "Rioja", 2018, "Tempranillo"));
        lista.add(new Vino("V002", "Ramón Bilbao", Marca.RAMON_BILBAO, 15.0, 30, "Blanco", "Rueda", 2020, "Verdejo"));
        lista.add(new Vino("V003", "Protos", Marca.RAMON_BILBAO, 18.5, 40, "Tinto", "Ribera del Duero", 2019, "Tempranillo"));
        lista.add(new Vino("V004", "Viña Tondonia", Marca.RAMON_BILBAO, 25.0, 25, "Tinto", "Rioja", 2015, "Garnacha"));

        System.out.println("Datos iniciales cargados en la lista de artículos.");
	}
	
	/*public ArrayList<Articulo> reponer()
	{
		if(this.lista)
		{
			
		}
	}*/
}
