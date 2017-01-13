package com.est;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLinkedlist l= new SLinkedlist();
		int opcion=0;
		do{
			
		String dato="";
	
		
		
		String []btns={"Ingresar al inicio","Ingresar al final","Buscar un elemento","Imprimir la lista"};
		int accion=JOptionPane.showOptionDialog(null, "Selecione la acción", "", JOptionPane.INFORMATION_MESSAGE, 1, null, btns, btns[0]);
		
		switch(accion){
		case 0:
			dato=JOptionPane.showInputDialog("Ingrese un String: ");
			l.insertarInicio(dato);
			break;
		case 1:
			dato=JOptionPane.showInputDialog("Ingrese un String: ");
			l.insertarFinal(dato);
			break;
		case 2:
			dato=JOptionPane.showInputDialog("Ingrese un String: ");
			if (l.existeElemento(dato)==true){JOptionPane.showMessageDialog(null, "El elemento existe!!!");}else {JOptionPane.showMessageDialog(null, "El elemento no existe!!!!!!");}
			break;
		case 3:
			JOptionPane.showMessageDialog(null, l.toString());
			break;
			
		
		
		}
		
			opcion=JOptionPane.showConfirmDialog(null, "Volver al menú?","*****************",JOptionPane.YES_NO_OPTION);
		}while (opcion==JOptionPane.YES_OPTION);
		JOptionPane.showMessageDialog(null,l.toString());
		

	}

}
