package com.cjgmj.ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * El objetivo de esta clase es validar que objetos del tipo T cumplen unos
 * determinados requisitos. Estos requisitos son dinámicos (se pueden configurar
 * durante la ejecución), por lo que, en lugar de tener una comprobación fija,
 * tendremos una lista de validadores individuales. El usuario de esta clase
 * podrá sumar validadores mediante un metodo add ( que tenéis que implementar
 * ). El método valida deberá devolver true si el objeto que se pasa como
 * parámetro cumple con todos los validadores de la lista y false si no.
 * 
 * Para completar esta clase falta: - indicar el tipo de los elementos de la
 * List validadores: pensad, debe ser un tipo que nos diga si un objeto del tipo
 * T cumple con una condición o no. - implementar el método add para aceptar un
 * nuevo validador individual y acumularlo a la lista validadores - implementar
 * el método valida para que realice la acción indicada más arriba. Será
 * necesario cambiar el tipo del parámetro de Object al tipo adecuado
 */
public class Validador<T> {

	// falta indicar el tipo de List
	List<Predicate<T>> validadores = new ArrayList<>();

	public boolean valida(T valor) { // cambiar Object por el tipo adecuado
		// true si pasa todos los validadores, falso si no
		for (Predicate<T> validador : validadores) {
			if (!validador.test(valor)) {
				return false;
			}
		}
		return true;
	}

	// falta un metodo add que admite nuevas validaciones
	public void add(Predicate<T> nuevo) {
		validadores.add(nuevo);
	}
}
