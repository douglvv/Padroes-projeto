package strategy;

public abstract class Veiculo {
	
	int id;
	String placa;
	String nome;
	
	public Veiculo(int id, String placa, String nome) {
		this.id = id;
		this.placa = placa;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	 
}


