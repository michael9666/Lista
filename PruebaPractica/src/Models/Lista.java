package Models;

import java.util.Arrays;

public class Lista<T> {

	// 1. ATRIBUTOS
	private T[] elementos;
	private int index;

	// 2. CONSTRUCTORES
	// Creamos un constructor vacío
	public Lista() {
		this.elementos = (T[]) new Object[this.index];
		this.index = 0;
	}

	// MÉTODOS
	// Método que nos inserta elementos en la lista
	public void add(T elementos) {
		this.elementos = Arrays.copyOf(this.elementos, this.index + 1);
		this.elementos[this.index++] = (T) elementos;
	}

	// Método que nos borra elementos de la lista
	public void remove(T elementos) {
		for (int i = 0; i < this.index; i++) {
			// Se elimina el elemento que el usuario introduce si es el mismo
			// que hay en la lista
			if (this.elementos[i] == elementos) {
				this.elementos[i] = null;
				this.index--;
			}
			// El elemento eliminado se pone al final de la lista
			if (this.elementos[i] == null && i != this.index) {
				this.elementos[i] = this.elementos[i + 1];
				this.elementos[i + 1] = null;
			}
		}

		this.elementos = Arrays.copyOf(this.elementos, this.index);
	}

	// Método para devolver el siguiente elemento de la lista
	public T getNext(T elementos) {
		int i = 0;
		for (i = 0; i < this.index; i++) {
			if (this.elementos == elementos) {
				this.elementos[i] = this.elementos[i + 1];
			}
		}
		return (T) this.elementos;
	}

	// Método para devolver el elemento anterior de la lista
	public T getPrev(T elementos) {
		int i = 0;
		for (i = 0; i < this.index; i++) {
			if (this.elementos == elementos) {
				this.elementos[i] = this.elementos[i - 1];
			}
		}
		return (T) this.elementos;
	}

	// Método para devolver el elemento actual de la lista
	public T getCurrent(T elementos) {
		int i = 0;
		for (i = 0; i < this.index; i++) {
			if (this.elementos[i] == elementos) {
				this.elementos[i] = elementos;
			}
		}

		return (T) this.elementos;
	}

	public int size() {
		return this.index;
	}

	// Método para establecer el index
	public int setIndex(int i) {
		if (this.index > i) {
			this.index = i;
		} else {
			this.index = -1;
		}
		return i;
	}
}
