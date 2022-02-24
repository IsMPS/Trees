package mainapp;

import models.Arbol;
import models.Nodo;

public class MainApp {
	
	public MainApp() {
		super();
	}

	public static void main(String[] args) {

		Nodo a = new Nodo("~");
		Nodo pollo = new Nodo("pollo");
		Nodo cerdo = new Nodo("cerdo");
		Nodo ternera = new Nodo("ternera");
		Nodo uno = new Nodo("uno");
		Nodo dos = new Nodo("dos");
		Nodo cinco = new Nodo("cinco");
		Nodo seis = new Nodo("seis");
		
		a.meter(pollo);
		a.meter(cerdo);
		a.meter(ternera);
		
		pollo.meter(uno);
		pollo.meter(dos);
		
		dos.meter(cinco);
		
		cinco.meter(seis);
		
		Arbol arbol = new Arbol(a);
		
		arbol.preOrden();
		
		System.out.println();
		
		arbol.postOrden();
		System.out.println();
		System.out.println(arbol.buscarNodo("pollo"));
		
		System.out.println(arbol.insertarNodo(cerdo, "tres"));
		System.out.println(arbol.insertarNodo(ternera, "cuatro"));
		arbol.preOrden();
		System.out.println();
		System.out.println("path");
		System.out.println(arbol.path("cuatro"));
		System.out.println("le arbol");
		arbol.mostrarArbol();
	}
}
