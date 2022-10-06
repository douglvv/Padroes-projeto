package state;

public abstract class ViagemState {
	Viagem viagem;

	public ViagemState(Viagem viagem) {
		super();
		this.viagem = viagem;
	}
	
	public abstract void iniciarViagem();
	
	public abstract void finalizarViagem();

	
	public Viagem getViagem() {
		return viagem;
	}

	public void setViagem(Viagem viagem) {
		this.viagem = viagem;
	}

}
