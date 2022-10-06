package state;

public class Iniciada extends ViagemState{
	
	public Iniciada(Viagem viagem) {
		super(viagem);
		System.out.println("Viagem para:"+ getViagem().getDestino() + " iniciada!");
	}
	
	
	@Override
	public void iniciarViagem() {
		System.out.println("Viagem para:"+ getViagem().getDestino() + " já foi iniciada!");
	}

	@Override
	public void finalizarViagem() {
		getViagem().setState(new Finalizada(getViagem()));
		
	}

	public Viagem getViagem() {
		return viagem;
	}

	public void setViagem(Viagem viagem) {
		this.viagem = viagem;
	}
	
	
	
}
