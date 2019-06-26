package TurneroTest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Modelo.ListaCliente;
import Modelo.ListaLlegada;

class ListaClienteTest {

	ListaCliente listaPrueba = new ListaCliente();

	@Test
	public void testInsertarAlFinal() {
		int datoEnviado = 24548295;
		boolean resultadoEsperado = true;

		listaPrueba.insertarAlFinal(3565656, "Marcela", true, "serv1");
		listaPrueba.insertarAlFinal(1088336105, "Alejandra", true, "serv3");
		listaPrueba.insertarAlFinal(45678796, "Mama", true, "serv3");
		listaPrueba.insertarAlFinal(24548295, "Luz stella", true, "serv2");
		listaPrueba.insertarAlFinal(123456, "Marcela", true, "serv1");

		boolean resultadoObtenido = listaPrueba.buscarElemento(datoEnviado);
		assertEquals(resultadoEsperado, resultadoObtenido);

	}
	
	@Test
	public void testInsertarAlInicio() {
		int datoEnviado = 456;
		boolean resultadoEsperado = true;

		listaPrueba.insertarAlFinal(3565656, "Marcela", true, "serv1");
		listaPrueba.insertarAlFinal(1088336105, "Alejandra", true, "serv3");
		listaPrueba.insertarAlFinal(45678796, "Mama", true, "serv3");
		listaPrueba.insertarAlFinal(24548295, "Luz stella", true, "serv2");
		listaPrueba.insertarAlFinal(123456, "Marcela", true, "serv1");
		listaPrueba.insertarAlInicio(456, "Marcela", true, "serv1");

		boolean resultadoObtenido = listaPrueba.buscarElemento(datoEnviado);
		assertEquals(resultadoEsperado, resultadoObtenido);

	}

	@Test
	public void testListarElemento() {
		listaPrueba.insertarAlFinal(3565656, "Marcela", true, "serv1");
		listaPrueba.insertarAlFinal(1088336105, "Alejandra", true, "serv3");
		listaPrueba.insertarAlFinal(45678796, "Mama", true, "serv3");
		listaPrueba.insertarAlFinal(24548295, "Luz stella", true, "serv2");
		listaPrueba.insertarAlInicio(789, "Isabella", true, "serv5");
		listaPrueba.insertarAlFinal(123456, "Laura", true, "serv1");
		listaPrueba.insertarAlFinal(3565656, "Anibal", true, "serv1");
		listaPrueba.insertarAlFinal(123456789, "Santiago", true, "serv3");
		listaPrueba.insertarAlFinal(987456321, "Diana", true, "serv3");
		listaPrueba.insertarAlFinal(258369147, "Jose", true, "serv2");
		listaPrueba.insertarAlFinal(741258963, "Nestor", true, "serv1");
		listaPrueba.insertarAlInicio(456, "Marcela", true, "serv1");
		listaPrueba.insertarAlInicio(123, "Roberta", true, "serv5");
		
		int[] resultadoEsperado = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12 };
		int[] resultadoObtenido = listaPrueba.listarElemento();
		assertArrayEquals(resultadoEsperado, resultadoObtenido);
	}

}
