package userinterface;

import java.util.Scanner;
import service.CalculadoraBasicaService;

public class CalculadoraBasicaUI {

	private CalculadoraBasicaService calculadoraBasicaService;

	public CalculadoraBasicaUI() {

		this.calculadoraBasicaService = new CalculadoraBasicaService();
	}

	public void solicitarDados() {

		Scanner entradaDados = new Scanner(System.in);

		System.out.println("Informe o valor de A:");
		int a = entradaDados.nextInt();

		System.out.println("Informe o valor de B:");
		int b = entradaDados.nextInt();

		int result = calculadoraBasicaService.somar(a, b);

		System.out.println("Resultado: " + result);

		entradaDados.close();
	}
}
