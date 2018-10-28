package com.cjgmj.ejercicio5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.Test;

public class OptionalTest {

	/**
	 * Implementad la parte del constructor que falta en el constructor de vivienda
	 * con un parametro
	 */
	@Test
	public void test_constructor_empty() {

		Vivienda vivienda = new Vivienda("Casa mayor");

		assertNotNull(vivienda.getPropietario());
		assertTrue(!vivienda.getPropietario().isPresent());
	}

	/**
	 * Implementad la parte del constructor que falta en el construtor de vivienda
	 * con dos parametros
	 */
	@Test
	public void test_constructor_present() {

		Persona persona = new Persona("Antonia");

		Vivienda vivienda = new Vivienda(persona, "Casa mayor");

		assertNotNull(vivienda.getPropietario());
		assertTrue(vivienda.getPropietario().isPresent());
		assertTrue(vivienda.getPropietario().get().getNombre().equals("Antonia"));
	}

	/**
	 * Implementad el metodo de Vivienda nombrePropietario()
	 */
	@Test
	public void test_vivienda_getNombre_present() {

		Persona persona = new Persona("Antonia");

		Vivienda vivienda = new Vivienda(persona, "Casa mayor");

		Optional<String> nombre = vivienda.nombrePropietario();
		assertNotNull(nombre);
		assertTrue(nombre.isPresent());
		assertEquals("Antonia", nombre.get());

		vivienda = new Vivienda("Casa mayor");

		nombre = vivienda.nombrePropietario();
		assertNotNull(nombre);
		assertFalse(nombre.isPresent());
	}

}
