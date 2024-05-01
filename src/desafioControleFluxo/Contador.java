package desafioControleFluxo;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = scanner.nextInt();

		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = scanner.nextInt();

		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O primeiro parâmetro não pode ser maior que o segundo parâmetro.");
		}
		for (int i = parametroUm; i <= parametroDois; i++) {
			System.out.println(i);
		}
	}
}

class ParametrosInvalidosException extends Exception {
	public ParametrosInvalidosException(String message) {
		super(message);
	}
}
