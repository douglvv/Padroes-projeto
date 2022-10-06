package observer;

public class Passageiros implements Observer{
	String nome;
	
	public Passageiros(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public void notify(Observable viagem, String notificacao) {
		System.out.println("Atenção, " + this.getNome()+"! Sua viagem teve a data de partida alterada para: "+ notificacao);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
