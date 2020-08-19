package br.com.marcelosouza.interfaces;

// GitHub: MarceloSouza1983		e-mail: map.souza1983@gmail.com		Cel: (12) 98813-6040

public class TorreDeControle {
	
	private Voador[] voadores;

	public TorreDeControle(Voador[] voadores) {
		this.voadores = voadores;
	}
	
	public void voemTodos() {
		/*for (int i = 0; i < voadores.length; i++) {
			voadores[i].voar();
		} */
		
		for (Voador j : voadores) {
            j.voar();
        }
	}
	
}