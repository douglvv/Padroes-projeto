package strategy;

public class VeiculoOnibus extends Veiculo {
	
	public VeiculoOnibus(int id, String placa, String nome) {
		super(id, placa, nome);
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
