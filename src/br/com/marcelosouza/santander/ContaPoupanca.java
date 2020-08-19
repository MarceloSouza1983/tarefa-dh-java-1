package br.com.marcelosouza.santander;

//GitHub: MarceloSouza1983		e-mail: map.souza1983@gmail.com		Cel: (12) 98813-6040

import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ContaPoupanca extends Conta {

	private LocalDate dataAniversario;
	protected double juros;
	private static double taxaJUROS = 0.997;
	private int contadorJuros = 0;

	public ContaPoupanca(double saldoInicial, String num, Cliente tit, Agencia ag, LocalDate dataAniversario) {
		super(saldoInicial, num, tit, ag);
		this.dataAniversario = dataAniversario;
	}

	public ContaPoupanca(String num, Cliente tit, Agencia ag, LocalDate dataAniversario) {
		super(num, tit, ag);
		this.dataAniversario = dataAniversario;
	}

	public LocalDate getDataAniversario() {
		return dataAniversario;
	}
	
	public String getDataAniversarioFormatada() {
		LocalDate data = this.getDataAniversario();
		 
		String formatador = data.format(DateTimeFormatter.ofPattern("dd/MM/uuuu"));
		return formatador;
	}
	
	public LocalDate setDataAniversario(LocalDate dataAniversario) {
		return dataAniversario;
	}

	public double getJuros() {
		if (isTemJuros() == true) {
			return juros = getSaldo() - (getSaldo() * getTaxaJUROS());
		} else {
			return juros = 0;
		}
	}

	// Metodo para verificar se tem juros
	private boolean isTemJuros() {
		LocalDate data = getDataAniversario();
		LocalDate hoje = LocalDate.now();

		long quantidadeDias = ChronoUnit.DAYS.between(data, hoje);

		if (quantidadeDias >= 30) {
			return true;
		} else {
			return false;
		}
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public static double getTaxaJUROS() {
		return taxaJUROS;
	}

	public static void setTaxaJUROS(double taxaJUROS) {
		ContaPoupanca.taxaJUROS = taxaJUROS;
	}

	public void sacarJuros(double valor) {
		if (contadorJuros == 0) {

			System.out.println("\nEfetuando saque de R$" + valor + " da conta " + getNumero());
			if (getJuros() > 0 && valor <= getJuros()) {
				this.juros -= valor;
				contadorJuros++;
				System.out.println("\nJuros restante R$" + this.juros + "\n");
			} else {
				System.out.println("Saldo insuficiente ou poupança ainda não rendeu juros");
			}
			
		} else {
			System.out.println("\nVocê já sacou o juros.");
		}

	}

	public void imprimeDados() {
		System.out.println("\n========= BANCO SANTANDER =========");
		System.out.println("\n--------- CONTA POUPANCA ----------");
		getAgencia().imprimeDados();
		System.out.println("Numero da conta: " + getNumero());
		System.out.println("Data de aniversario: " + getDataAniversarioFormatada());
		getTitular().imprimeDados();
		System.out.println("Saldo: R$" + saldo);
		System.out.println("========================================\n");
	}

}