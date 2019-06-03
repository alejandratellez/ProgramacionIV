package TurneroTest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Modelo.ListaCliente;
import Modelo.ListaServicio;

class ListaServicioTest {
	ListaCliente listaPrueba = new ListaCliente();
	ListaServicio listaServicio = new ListaServicio();

	@Test
	public void testInsertarElemento() {
		boolean resultadoEsperado = true;

		listaPrueba.insertarAlFinal(3565656, "Marcela", true, "serv1");
		listaPrueba.insertarAlFinal(1088336105, "Alejandra", true, "serv3");
		listaPrueba.insertarAlFinal(45678796, "Mama", true, "serv3");
		listaPrueba.insertarAlFinal(24548295, "Luz stella", true, "serv2");
		listaPrueba.insertarAlFinal(123456, "Marcela", true, "serv1");

		listaServicio.insertarElemento(listaPrueba,"serv1");

		boolean resultadoObtenido = listaServicio.buscarElemento(listaPrueba);
		assertEquals(resultadoEsperado, resultadoObtenido);

	}

	@Test
	public void testListarElemento() {
		listaPrueba.insertarAlFinal(3565656, "Marcela", true, "serv1");
		listaPrueba.insertarAlFinal(1088336105, "Alejandra", true, "serv3");
		listaPrueba.insertarAlFinal(45678796, "Mama", true, "serv3");
		listaPrueba.insertarAlFinal(24548295, "Luz stella", true, "serv2");
		listaPrueba.insertarAlFinal(123456, "Marcela", true, "serv1");

		listaServicio.insertarElemento(listaPrueba,"serv1");
		listaServicio.insertarElemento(listaPrueba,"serv2");
		listaServicio.insertarElemento(listaPrueba,"serv3");
		int[] resultadoEsperado = { 0,1,2 };
		int[] resultadoObtenido = listaServicio.listarElemento();
		assertArrayEquals(resultadoEsperado, resultadoObtenido);
	}

}
