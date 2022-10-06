package strategy;

public class CalculoVan implements InterfaceCalculoFrete {

	@Override
	public double calcularFrete(double distancia, double consumo) {
		double resultado = distancia / (consumo * 1.5) ;
		return resultado;
	}

}
