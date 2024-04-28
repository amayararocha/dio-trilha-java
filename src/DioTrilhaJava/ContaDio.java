package DioTrilhaJava;

import java.util.Scanner;

public class ContaDio {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String agencia, nomeCliente;
		
		int numero;
		
		float saldo;
		
		System.out.println("Por favor, digite o número da conta: ");
		numero = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Por favor, digite o número da agência: ");
		agencia = scanner.nextLine();
		
		System.out.println("Por favor, digite o seu nome: ");
		nomeCliente = scanner.nextLine();
		
		System.out.println("Por favor, digite o seu saldo: ");
		saldo = scanner.nextFloat();
		scanner.nextLine();
		
		System.out.println("Olá, " + nomeCliente + " obrigada por criar uma conta em nosso banco, sua agência é " 
				+ agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
		
		scanner.close();
	}

}
