package strategy;

public class Frete {
	Veiculo veiculo;
	InterfaceCalculoFrete calculo;
	double distancia;
	double consumo;
		
	public Frete(Veiculo veiculo, InterfaceCalculoFrete calculo, double distancia, double consumo) {
		this.veiculo = veiculo;
		this.calculo = calculo;
		this.distancia = distancia;
		this.consumo = consumo;
	}

	public double valorFrete() {
		return this.calculo.calcularFrete(distancia, consumo);
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public InterfaceCalculoFrete getCalculo() {
		return calculo;
	}

	public void setCalculo(InterfaceCalculoFrete calculo) {
		this.calculo = calculo;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}



}