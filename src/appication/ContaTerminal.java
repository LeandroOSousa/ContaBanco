package appication;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero_conta;
		String agencia, nome_cliente;
		double saldo;
		
		System.out.printf("----- Olá, seja Bem vindo! -----%nPara criar uma nova conta preciso que insira os dados que irei solicitar%n");
		
		System.out.println("Por favor, digite seu nome:");
		nome_cliente = sc.nextLine();
				
		System.out.println("Por favor, digite o número da Agência:");
		agencia = sc.nextLine();
		
		System.out.println("Digite o número da conta:");
		numero_conta = sc.nextInt();
		
		System.out.println("Digite o valor que deseja depositar:");
		saldo = sc.nextDouble();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, seu saldo de %.2f já está disponível para saque",
				nome_cliente, agencia, numero_conta, saldo);
		
		sc.close();
	}

}
