package service;

import org.junit.*;
import static org.junit.Assert.*;

public class CalculadoraCientificaServiceTest {

	private CalculadoraCientificaService calculadoraCientificaService;
	
	@Before
	public void instanciarObjetos() {

		// MONTAGEM DO CENÁRIO
		calculadoraCientificaService = new CalculadoraCientificaService();
	}
	
	@After
	public void destruirObjetos() {
		
		calculadoraCientificaService = null;
	}

	@Test
	public void testCalcularRaizQuadradaPositivo() {

		// EXECUÇÃO
		double result = calculadoraCientificaService.calcularRaizQuadrada(81);

		// VERIFICAÇÃO
		assertEquals(9.0, result, 0.1);
	}

	@Test
	public void testCalcularRaizQuadradaNegativo() {

		try {

			// EXECUÇÃO
			double result = calculadoraCientificaService.calcularRaizQuadrada(-9);

			fail("Efetuou um cálculo inexistente!");

		} catch (ArithmeticException e) {

			// VERIFICAÇÃO
			assertEquals("Não existe raiz quadrada de número racional negativo!", e.getMessage());
		}
	}

	@Test
	public void testCalcularRaizQuadradaZero() {

		// EXECUÇÃO
		double result = calculadoraCientificaService.calcularRaizQuadrada(0);

		// VERIFICAÇÃO
		assertEquals(0.0, result, 0.1);
	}
}
