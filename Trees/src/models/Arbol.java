package models;

public class Arbol {
	private Nodo raiz;

	public Arbol(Nodo raiz) {
		super();
		this.raiz = raiz;
	}
	
	public void preOrden() {
		this.raiz.preOrden(raiz);
	}
	
	public void postOrden() {
		this.raiz.postOrden(raiz);
	}
	
	public Nodo buscarNodo(String valor) {
        return this.raiz.buscarNodo(valor);
}
	
	public Nodo insertarNodo(Nodo padre, String valor) {
		return this.raiz.insertarNodo(padre, valor);
	}
	
	public String path(String valor) {	
		return this.raiz.path(valor);
	}
	
	public void mostrarArbol() {
		this.raiz.mostrarArbol();
	}
}
