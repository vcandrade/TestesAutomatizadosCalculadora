package service;

public class CalculadoraCientificaService {

	public double calcularRaizQuadrada(double a) {

		if (a < 0) {

			throw new ArithmeticException("Não existe raiz quadrada de número racional negativo!");
		}

		return Math.sqrt(a);
	}
}
