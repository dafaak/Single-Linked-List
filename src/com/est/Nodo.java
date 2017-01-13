package com.est;

public class Nodo {
	private String elemento;
	private Nodo siguiente;
	
	public Nodo(String s, Nodo n){
	elemento =s;
	siguiente= n;
	
	}
	public Nodo (String s){//Primer nodo
		this.elemento=s;
		this.siguiente=null;
	}
	
	public String getElement(){return elemento;}
	public Nodo getSiguiente(){return siguiente;}
	public void setElement(String elemento){this.elemento=elemento;}
	public void setSiguiente(Nodo siguiente){this.siguiente=siguiente;}
	
	

}
