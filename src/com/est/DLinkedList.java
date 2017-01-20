package com.est;

public class DLinkedList {
	private Nodo cabeza;
	private Nodo cola;


	public DLinkedList() {
		super();
		this.cabeza=null;
		this.cola=null;
	
	}
	
	public boolean estaVacia(){
		return (cabeza==null);
	}
	
	
	
	public Nodo getAnterior() {
		return cabeza;
	}

	public void setAnterior(Nodo anterior) {
		this.cabeza = anterior;
	}


	public void insertarInicio(String dato){
		Nodo aux=new Nodo(dato);
		Nodo p=cabeza;
		if (estaVacia()){cabeza=aux; }
		else{cabeza=aux;
		     cabeza.setSiguiente(p);
		     
		     
			
		}
		
	}
	

}
