package com.cjgmj.ejercicio2;

import java.util.Collection;

public interface Agrupador {

	void add (Object elemento);
	
	int numeroElementos();
	
	default void addAll(Collection<Object> col) {
		for (Object o: col) {
			add(o);
		}
	}
}
