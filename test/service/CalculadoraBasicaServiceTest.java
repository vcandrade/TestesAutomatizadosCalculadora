package service;

import org.junit.*;
import static org.junit.Assert.*;

public class CalculadoraBasicaServiceTest {

	private CalculadoraBasicaService calculadoraBasicaService;
	
	@Before
	public void instanciarObjetos() {

		// MONTAGEM DO CENÁRIO
		calculadoraBasicaService = new CalculadoraBasicaService();
	}
	
	@After
	public void destruirObjetos() {
		
		calculadoraBasicaService = null;
	}

	@Test
	public void testSomarPP() {

		// EXECUÇÃO
		int result = calculadoraBasicaService.somar(3, 5);

		// VERIFICAÇÃO
		assertEquals(8, result);
	}

	@Test
	public void testSomarNN() {

		// EXECUÇÃO
		int result = calculadoraBasicaService.somar(-3, -5);

		// VERIFICAÇÃO
		assertEquals(-8, result);
	}

	@Test
	public void testSomarPN() {

		// EXECUÇÃO
		int result = calculadoraBasicaService.somar(3, -5);

		// VERIFICAÇÃO
		assertEquals(-2, result);
	}

	@Test
	public void testSomarNP() {

		// EXECUÇÃO
		int result = calculadoraBasicaService.somar(-3, 5);

		// VERIFICAÇÃO
		assertEquals(2, result);
	}

	@Test
	public void testSomarZP() {

		// EXECUÇÃO
		int result = calculadoraBasicaService.somar(0, 5);

		// VERIFICAÇÃO
		assertEquals(5, result);
	}

	@Test
	public void testSomarZN() {

		// EXECUÇÃO
		int result = calculadoraBasicaService.somar(0, -5);

		// VERIFICAÇÃO
		assertEquals(-5, result);
	}

	@Test
	public void testSomarPZ() {

		// EXECUÇÃO
		int result = calculadoraBasicaService.somar(3, 0);

		// VERIFICAÇÃO
		assertEquals(3, result);
	}

	@Test
	public void testSomarNZ() {

		// EXECUÇÃO
		int result = calculadoraBasicaService.somar(-3, 0);

		// VERIFICAÇÃO
		assertEquals(-3, result);
	}
}
