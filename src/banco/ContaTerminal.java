package banco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		
		ContaBanco conta1 = new ContaBanco();
		
		System.out.println("Inserir o numero da conta");
		conta1.numero = (scan.nextInt());
		 System.out.println("Inserir o número da agência:");
	     scan.nextLine(); // Consumir a nova linha deixada por nextInt()
		conta1.agencia = (scan.nextLine());
		System.out.println("Inserir o nome do cliente");
		conta1.NomeCliente = (scan.nextLine());
		System.out.println("Inserir o saldo");
		conta1.saldo = (scan.nextFloat());
		
		System.out.print("Teste");
		
		System.out.println("Olá " + conta1.NomeCliente + " obrigado por criar uma conta no nosso banco, sua Agencia é "
				+ conta1.agencia +  " sua conta " + conta1.numero + " e seu saldo " + conta1.saldo + " já está disponivel para uso");
		
		scan.close();
	}
	

}

