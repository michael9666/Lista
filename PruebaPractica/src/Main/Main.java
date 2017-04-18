package Main;

import Models.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lista<Coche> lista = new Lista<Coche>();
		
		// Creamos varios coches para añadirlos a la lista
		Coche coche1 = new Coche("BMW", "535", 2015);
		Coche coche2 = new Coche("Audi", "Q7", 2017);
		Coche coche3 = new Coche("Mercedes", "CLA", 2009);

		// Añadimos los coches a la lista
		lista.add(coche1);
		lista.add(coche2);
		lista.add(coche3);

		// Comprobamos los métodos
		System.out.println(lista.getNext(coche1));
		System.out.println(lista.getPrev(coche3));
		System.out.println(lista.getCurrent(coche1));
		System.out.println(lista.size());
		lista.setIndex(2);
		System.out.println(lista.size());
	}
}
