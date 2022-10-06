package state;

public class Finalizada extends ViagemState{
	
	
	
	public Finalizada(Viagem viagem) {
		super(viagem);
		System.out.println("Viagem para: " + getViagem().getDestino() + " finalizada!");
	}

	@Override
	public void iniciarViagem() {
		getViagem().setState(new Iniciada(getViagem()));
		
	}

	@Override
	public void finalizarViagem() {
		System.out.println("Viagem para: " + getViagem().getDestino() + " já foi finalizada!");

		
	}
	
}
