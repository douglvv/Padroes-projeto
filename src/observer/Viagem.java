package observer;

import java.util.ArrayList;
import java.util.List;

public class Viagem implements Observable{
	String destino;
	String dataPartida;
	List<Observer> passageiros;
	
	
	
	public Viagem(String destino, String dataPartida) {
		super();
		this.destino = destino;
		this.dataPartida = dataPartida;
	}

	@Override
	public void addObserver(Observer observer) {
		getPassageiros().add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		getPassageiros().remove(observer);
		
	}

	@Override
	public void notify(String mensagem) {
		for (Observer p : passageiros)
			p.notify(this, mensagem);
	}

	public void alterarDataPartida(String data) {
		this.dataPartida = data;
	}
	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getDataPartida() {
		return dataPartida;
	}

	public void setDataPartida(String dataPartida) {
		this.dataPartida = dataPartida;
	}

	private List<Observer> getPassageiros() {
		if (passageiros == null)
			this.passageiros = new ArrayList<Observer>();
		return passageiros;
	}
	
}
