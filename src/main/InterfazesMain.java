package main;

import utilidades.Utilidades;

import java.util.ArrayList;

import clases.*;

public class InterfazesMain {

	public static int mostrarMenu() {
		System.out.println("GESTION DE VENTAS");
        System.out.println("1- Realizar una venta (crear factura)");
        System.out.println("2- Listar articulos");
        System.out.println("3- Listar articulos sanos");
        System.out.println("4- Pedir un codigo y mostrar los articulos que tienen el precio equivalente del articulo");
        System.out.println("5- Listar los productos mas caros");
        System.out.println("6- Listar los productos con stock bajo");
        System.out.println("7- Pedir codigo de articulo y aumentar stock");
        System.out.println("0- Salir");
        System.out.print("Opcion: ");
		return Utilidades.leerInt();
	}
	
	public static void crearFac(ArrayList<Factura> facturas)
	{
		int numero;
		String nombre;
		String apellido;
		double total;

		String codigo;
		int cantidad;
		double totalLinea;
		
		System.out.println("Introduce numero de factura:");
		numero = Utilidades.leerInt();
		
		System.out.println("Introduce el nombre:");
		nombre = Utilidades.introducirCadena();
		
		System.out.println("Introduce el apellido:");
		apellido = Utilidades.introducirCadena();
				
		System.out.println("Introduce Total: ");
		total = Utilidades.leerDouble();
		
		ArrayList<Linea_Factura> l = new ArrayList<>();
		
		Factura f = new Factura(numero,nombre,apellido,l,total);
		
		facturas.add(f);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;
		
		ArrayList<Articulo> a = new ArrayList<>();
		ListaArticulo articulos = new ListaArticulo(a);
		ArrayList<Factura> facturas = new ArrayList<>();
		
		articulos.fillData();
		
		do {
			switch (opcion = mostrarMenu()) 
			{
			case 0:
				System.out.println("Agur!");
				break;
				
			case 1:
				
				break;

			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				

				break;
			case 6:
				
				break;
				
			case 7:
				break;
			}
		} while (opcion != 0);
	}

}
