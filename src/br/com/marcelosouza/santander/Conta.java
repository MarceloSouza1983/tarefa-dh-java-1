package br.com.marcelosouza.santander;

// GitHub: MarceloSouza1983		e-mail: map.souza1983@gmail.com		Cel: (12) 98813-6040

public abstract class Conta {

    protected double saldo;
    private String numero;
    private Cliente titular;
    private Agencia agencia;
    
    public Conta(double saldoInicial, String numeroConta, Cliente titular, Agencia ag) {
        this.saldo = saldoInicial;
        this.numero = numeroConta;
        this.titular = titular;
        this.agencia = ag;
    }

    public Conta(String numeroConta, Cliente titular, Agencia ag) {
        this(0, numeroConta, titular, ag);
    }

    public void sacar(double valor) {
        System.out.println("Efetuando saque de R$" + valor + " da conta " + numero);
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
            } else
                System.out.println("\nSaldo insuficiente");
        } else {
            System.out.println("O valor de saque deve ser positivo");
        }
    }

    public void depositar(double valor) {
        System.out.println("Efetuando depósito de R$" + valor + " na conta " + numero);
        if (valor >= 0) {
            this.saldo += valor;
        } else
            System.out.println("O valor do deposito deve ser positivo");
    }

    public void imprimeDados() {
        System.out.println("======================================");
        agencia.imprimeDados();
        System.out.println("Numero da conta: " + this.numero);
        titular.imprimeDados();
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("======================================\n");
    }

    public double getSaldo() {
        return saldo;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    
}