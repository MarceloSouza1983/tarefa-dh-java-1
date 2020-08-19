package br.com.marcelosouza.interfaces;

// GitHub: MarceloSouza1983		e-mail: map.souza1983@gmail.com		Cel: (12) 98813-6040

public class SuperHomem implements Voador {

	private int experiencia;

	@Override
	public void voar() {
		experiencia += 3;
		System.out.println("Estou voando como um campeão");
		System.out.println("Minha experiência é de " + getExperiencia() + " pontos.");
		System.out.println("O Super Homem voou " + experiencia/3 + " vez(es)\n");
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

}