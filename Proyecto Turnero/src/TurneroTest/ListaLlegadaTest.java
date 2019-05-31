package TurneroTest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Turnero.ListaLlegada;

public class ListaLlegadaTest {

	ListaLlegada listaPrueba = new ListaLlegada();

	@Test
	public void testInsertarElemento() {
		int datoEnviado = 24548295;
		boolean resultadoEsperado = true;

		listaPrueba.insertarElemento(3565656, "Marcela", true, "serv1");
		listaPrueba.insertarElemento(1088336105, "Alejandra", true, "serv3");
		listaPrueba.insertarElemento(45678796, "Mama", true, "serv3");
		listaPrueba.insertarElemento(24548295, "Luz stella", true, "serv2");
		listaPrueba.insertarElemento(123456, "Marcela", true, "serv1");

		boolean resultadoObtenido = listaPrueba.buscarElemento(datoEnviado);
		assertEquals(resultadoEsperado, resultadoObtenido);

	}

	@Test
	public void testListarElemento() {
		listaPrueba.insertarElemento(3565656, "Marcela", true, "serv1");
		listaPrueba.insertarElemento(1088336105, "Alejandra", true, "serv3");
		listaPrueba.insertarElemento(45678796, "Mama", true, "serv3");
		listaPrueba.insertarElemento(24548295, "Luz stella", true, "serv2");
		listaPrueba.insertarElemento(123456, "Marcela", true, "serv1");
		
		
		
		int[] resultadoEsperado = {0,1,2,3,4};
		int[] resultadoObtenido = listaPrueba.listarElemento();
		assertArrayEquals(resultadoEsperado, resultadoObtenido);
	}
}
