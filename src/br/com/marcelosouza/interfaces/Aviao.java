package br.com.marcelosouza.interfaces;

// GitHub: MarceloSouza1983		e-mail: map.souza1983@gmail.com		Cel: (12) 98813-6040

public class Aviao implements Voador {

	private int horasDeVoo;

	@Override
	public void voar() {
		horasDeVoo += 13;
		//contador++;
		System.out.println("Estou voando como um aviao e tenho " + horasDeVoo + " horas de voo.");
		System.out.println("O aviao voou " + horasDeVoo/13 + " vez(es)\n");
	}

	public int getHorasDeVoo() {
		return horasDeVoo;
	}

	public void setHorasDeVoo(int horasDeVoo) {
		this.horasDeVoo = horasDeVoo;
	}

}