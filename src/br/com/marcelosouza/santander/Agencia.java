package br.com.marcelosouza.santander;

// GitHub: MarceloSouza1983		e-mail: map.souza1983@gmail.com		Cel: (12) 98813-6040

public class Agencia {

    private String numero;

    public Agencia(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public void imprimeDados() {
        System.out.println("Agencia n.° " + getNumero());
    }

}