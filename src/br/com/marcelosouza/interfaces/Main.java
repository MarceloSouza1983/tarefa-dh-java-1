package br.com.marcelosouza.interfaces;

// GitHub: MarceloSouza1983		e-mail: map.souza1983@gmail.com		Cel: (12) 98813-6040

public class Main {

	public static void main(String[] args) {
		
		Pato pato = new Pato();
		Aviao aviao = new Aviao();
		SuperHomem clark = new SuperHomem();
		
		Voador[] voadores = {pato, aviao, clark};
		
		TorreDeControle torre = new TorreDeControle(voadores);
		torre.voemTodos();
		torre.voemTodos();
		torre.voemTodos();
		torre.voemTodos();
		torre.voemTodos();
		
		/*
		pato.setEnergia(10);
		pato.voar();
		pato.voar();
		pato.voar();
		pato.voar();
		pato.voar(); // 5
		clark.voar();
		clark.voar();
		clark.voar(); // 3
		aviao.voar();
		aviao.voar();
		aviao.voar();
		aviao.voar();
		aviao.voar(); // 5 */
		
	}

}