package observer;

public class Main {

	public static void main(String[] args) {
		Viagem canoinhas = new Viagem("Canoinhas", "06/10/2022");
		
		Passageiros joao = new Passageiros("Joao");
		Passageiros carlos = new Passageiros("Carlos");
		Passageiros felisberto = new Passageiros("Felisberto");
		Passageiros joana = new Passageiros("Joana");
		Passageiros renatinha = new Passageiros("Renatinha");
		
		canoinhas.addObserver(joao);
		canoinhas.addObserver(carlos);
		canoinhas.addObserver(felisberto);
		canoinhas.addObserver(joana);
		canoinhas.addObserver(renatinha);
		
		String novaDataPartida = "05/03/2022";
		canoinhas.alterarDataPartida(novaDataPartida);
		canoinhas.notify(novaDataPartida);
	}

}
