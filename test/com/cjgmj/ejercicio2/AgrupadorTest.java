package com.cjgmj.ejercicio2;

import org.junit.Test;

import java.util.Arrays;

import org.junit.Assert;

public class AgrupadorTest {

	/**
	 * Completad la definición de la clase AgrupadorConList para que implemente la
	 * interface (este ejercicio es de repaso, no usa los métodos default)
	 */
	@Test
	public void test_add() {

		Agrupador agrupador = new AgrupadorConList();
		Assert.assertEquals(0, agrupador.numeroElementos());

		agrupador.add("primero");
		Assert.assertEquals(1, agrupador.numeroElementos());

	}

	/**
	 * definid un método default addAll que acepte un Collection y añada cada objeto
	 * al agrupador
	 */
	@Test
	public void test_addAll() {

		Agrupador agrupador = new AgrupadorConList();
		agrupador.addAll(Arrays.asList("primero", "segundo"));

		Assert.assertEquals(2, agrupador.numeroElementos());
	}
}
