package com.est;

public class SLinkedlist {
protected Nodo inicio;
protected long longitud;

public SLinkedlist(){
	inicio=null;
	longitud=0;
}
public boolean estaVacia(){
	return (inicio==null);
}

public void insertarInicio(String dato){
	if(estaVacia())
	{inicio=new Nodo(dato);}
	else {inicio= new Nodo(dato,inicio);}
	this.longitud+=1;
	
	}

public void insertarFinal(String dato){
	
	Nodo aux= new Nodo(dato);
	if (estaVacia()){inicio=new Nodo(dato);}
	else{Nodo p=inicio;
	Nodo q=null;
	while(p!=null){
	q=p;
	p=p.getSiguiente();
	}
	q.setSiguiente(aux);
	}
	this.longitud+=1;
	
}

public boolean existeElemento(String dato){
	Nodo p=inicio;
	if (estaVacia()==true){return false;}
	else {
	while(p!=null){
		if(p.getElement().equalsIgnoreCase(dato)){return true;};
		p=p.getSiguiente();
	}}return false;
}

public String toString(){
	if (estaVacia()==true){return "Lista vacia!!!";}
	else{
String salida="";
Nodo p =inicio;
{salida+=" Lista de nodos:\n";
salida+=p.getElement()+"\n";
p=p.getSiguiente();
while(p!=null){
	salida+=p.getElement()+"\n";
	p=p.getSiguiente();}
	
	
}
	return salida;
}
	
}


}
