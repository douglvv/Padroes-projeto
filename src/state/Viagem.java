package state;

public class Viagem {
	String destino;
	ViagemState state;
	
	public Viagem(String destino) {
		this.destino = destino;
		this.state = new NaoIniciada(this);
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public ViagemState getState() {
		return state;
	}

	public void setState(ViagemState state) {
		this.state = state;
	}
	
	public void iniciarViagem() {
		state.iniciarViagem();
		
	}

	public void finalizarViagem() {
		state.finalizarViagem();
		
	}
	
}
