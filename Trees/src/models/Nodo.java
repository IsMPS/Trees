package models;

import java.util.ArrayList;
import java.util.Iterator;

public class Nodo {

	private String valor;
	private ArrayList<Nodo> array;

	public Nodo(String valor) {
		super();
		this.valor = valor;
		this.array = new ArrayList<Nodo>();
	}

	public void meter(Nodo e) {
		array.add(e);
	}

	public boolean esHoja() {
		return array.size() == 0;
	}

	public boolean tieneHijos(Nodo n, int num) {
		return !(n.array.size() <= num);
	}

	public void preOrden(Nodo n) {
		System.out.print(n.valor + "/");
		for (int i = 0; i < array.size(); i++) {
			if (tieneHijos(n, i)) {
				preOrden(n.array.get(i));
			}
		}
	}

	public void postOrden(Nodo n) {
		for (int i = 0; i < array.size(); i++) {
			if (tieneHijos(n, i)) {
				postOrden(n.array.get(i));
			}
		}
		System.out.print(n.valor + "/");
	}

	public Nodo buscarNodo(String valor) {
		if (this.valor.equals(valor)) {
			return this;
		}
		for (int i = 0; i < array.size(); i++) {
			if (tieneHijos(this, i)) {
				var n = this.array.get(i).buscarNodo(valor);
				if (n != null)
					return n;
			}
		}
		return null;
	}

	public Nodo insertarNodo(Nodo padre, String valor) {
		if (padre != null) {
			Nodo nodo = new Nodo(valor);
			padre.meter(nodo);
			return buscarNodo(valor);
		} else {
			return null;
		}
	}

	public String path(String valor) {
		String n = this.valor;
		int numerito = 0;
		if (tieneHijos(this, 0)) {
			for (int i = 0; i < array.size(); i++) {
				if (this.array.get(i).valor != valor) {
					var pot = this.array.get(i).path(valor);
					if(pot!=null) {
						n = n + "/" + pot;
						break;
					}
				} else {
					return this.valor+"/"+this.array.get(i).valor;
				}
				numerito++;
			}
			if(numerito!=array.size()) {
				return n;
			}
			
		}
		return null;

	}
	
	public void mostrarArbol() {
//		System.out.print(this.valor+"/");
//		if(tieneHijos(this, 0)) {
//			for (int i = 0; i < array.size(); i++) {
//				this.array.get(i).mostrarArbol();
//				System.out.println();
//			}
//			System.out.println();
//		}
	}

	@Override
	public String toString() {
		return "Nodo [valor=" + valor + "]";
	}

}
