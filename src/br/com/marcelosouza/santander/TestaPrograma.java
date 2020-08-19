package br.com.marcelosouza.santander;

//GitHub: MarceloSouza1983		e-mail: map.souza1983@gmail.com		Cel: (12) 98813-6040

import java.time.LocalDate;

public class TestaPrograma {

	public static void main(String[] args) {
		
		// Criando Agencia
		Agencia santanderJacarei = new Agencia("190");
		
		// Criando cliente              nome         rg           cpf      id
		Cliente cliente1 = new Cliente("Souza", "435777832", "33344455541", 1);
		Cliente cliente2 = new Cliente("Almeida", "555117991", "77711133322", 2);
		
		
		// Criando Conta Poupanca com saldo
		ContaPoupanca conta1 = new ContaPoupanca(1000, "34567", cliente1, santanderJacarei, LocalDate.of(2020, 7, 17));
		
		// Criando conta poupanca sem saldo
		ContaPoupanca conta2 = new ContaPoupanca("11000", cliente2, santanderJacarei, LocalDate.of(2020, 8, 17));
		
		// Criando conta corrente
		ContaCorrente cc1 = new ContaCorrente(500, "5000", cliente2, santanderJacarei, 1000);
		
		// Faz depósito de R$500
		conta1.depositar(500);
		
		conta1.imprimeDados();
		
		// Faz saque de R$550.50
		conta1.sacar(550.50);
		
		conta1.imprimeDados();
		
		if (conta1.getSaldo() == 949.50) {
			System.out.println("O saldo da Conta está correto.\n");
		} else {
			System.out.println("Consulte a gerência, a um problema no saldo da sua conta.\n");
		}
		
		conta2.sacar(100); // Nao deixa sacar conta2 nao tem saldo
		conta2.depositar(500);
		conta2.sacar(100); // saldo de 400
		
		conta2.imprimeDados();
		
		
		// Trabalhando com a conta corrente
		cc1.sacar(1500);
		cc1.imprimeDados();
		
		cc1.depositarCheque(1000, "Santander", "21/8/2020");
		cc1.depositar(100); // deposita 100
		
		cc1.imprimeDados(); // Saldo = 100
		
		
		/*
		// Trabalhando com popanca sacar juros
		
		Cliente cliente3 = new Cliente("Mendonça", "111222888", "11122255591", 3);
		Cliente cliente4 = new Cliente("Gonçalves", "991222899", "43522255657", 4);
		
		// Criando Conta Poupanca com saldo diferenca de 29 dias
		ContaPoupanca conta3 = new ContaPoupanca(1000, "99000", cliente3, santanderJacarei, LocalDate.of(2020, 7, 20));
		
		// Criando Conta Poupanca com saldo diferenca de 30 dias
		ContaPoupanca conta4 = new ContaPoupanca(1000, "77500", cliente4, santanderJacarei, LocalDate.of(2020, 7, 19));
		
		
		// Nao permite sacar juros, nao tem mais de 30 dias da data de aniversario da poupanca
		System.out.printf("%.2f", conta3.getJuros());
		conta3.sacarJuros(3);
		

		// Permite sacar juros, tem mais de 30 dias da data de aniversario da poupanca
		conta4.setDataAniversario(LocalDate.of(2020, 7, 19));
		System.out.printf("Juros R$%.2f", conta4.getJuros());
		conta4.sacarJuros(3);
		
		// Não permite sacar juros, tem mais de 30 dias mas saque > juros
		conta4.setDataAniversario(LocalDate.of(2020, 7, 19));
		System.out.printf("Juros R$%.2f", conta4.getJuros());
		conta4.sacarJuros(6);
		conta4.imprimeDados(); */
		
		
		
	}

}