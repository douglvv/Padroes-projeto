package state;

public class NaoIniciada extends ViagemState {	
	
	public NaoIniciada(Viagem viagem) {
		super(viagem);
		System.out.println("Viagem para: "+ getViagem().getDestino()+ " ainda não foi iniciada.");
	}

	@Override
	public void iniciarViagem() {
		getViagem().setState(new Iniciada(getViagem()));
		
	}

	@Override
	public void finalizarViagem() {
		System.out.println("Impossível finalizar. Viagem para: " + getViagem().getDestino() + " ainda não foi iniciada.");
		
	}

	public Viagem getViagem() {
		return viagem;
	}

	public void setViagem(Viagem viagem) {
		this.viagem = viagem;
	}

	
	
}
