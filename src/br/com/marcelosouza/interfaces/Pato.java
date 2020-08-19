package br.com.marcelosouza.interfaces;

// GitHub: MarceloSouza1983		e-mail: map.souza1983@gmail.com		Cel: (12) 98813-6040

public class Pato implements Voador {

	private int energia = 100, contador = 0;

	@Override
	public void voar() {
		
		if (getEnergia() > 0) {
			energia -= 5;
			System.out.println("Estou voando como um pato");
			contador++;
			System.out.println("O pato voou " + contador + " vez(es)");
		} else {
			System.out.println("Não tenho energia sufiente para voar");
		}
		
		System.out.println("Energia do Pato: " + getEnergia() + "\n");
		
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

}