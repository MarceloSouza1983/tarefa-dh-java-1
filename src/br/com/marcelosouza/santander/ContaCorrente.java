package br.com.marcelosouza.santander;

// GitHub: MarceloSouza1983		e-mail: map.souza1983@gmail.com		Cel: (12) 98813-6040

public class ContaCorrente extends Conta {

	private double limite;

	public ContaCorrente(double saldoInicial, String num, Cliente tit, Agencia ag, double limite) {
		super(saldoInicial, num, tit, ag);
		setLimite(limite);
	}

	public ContaCorrente(String num, Cliente tit, Agencia ag, double limite) {
		super(num, tit, ag);
		setLimite(limite);
	}

	public void sacar(double valor) {
		System.out.println("\nEfetuando saque de R$" + valor + " da conta " + getNumero());
		if (valor > 0) {
			if ((saldo + limite) >= valor) {
				saldo -= valor;
			} else
				System.out.println("Saldo insuficiente");
		} else {
			System.out.println("O valor de saque deve ser positivo");
		}
	}
	
	public void depositarCheque(double valor, String banco, String dataPagamento) {
        System.out.println("Depósito de R$" + valor + " na conta " + getNumero());
        System.out.println("Será realizado no dia: " + dataPagamento);
        System.out.println("Saldo anterior R$" + getSaldo());
        if (valor >= 0) {
            this.saldo += valor;
            System.out.println("O novo saldo será de R$" + getSaldo());
        } else
            System.out.println("O valor do deposito deve ser positivo");
    }

	public void imprimeDados() {
		System.out.println("\n=========== BANCO SANTANDER ===========");
		System.out.println("\n----------- CONTA CORRENTE ------------");
		getAgencia().imprimeDados();
		System.out.println("Numero da conta: " + getNumero());
		System.out.println("Limite de R$ " + getLimite());
		getTitular().imprimeDados();
		System.out.println("Saldo: R$" + saldo);
		System.out.println("========================================\n");
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}