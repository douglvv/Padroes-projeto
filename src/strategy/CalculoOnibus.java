
package strategy;

public class CalculoOnibus implements InterfaceCalculoFrete {

	@Override
	public double calcularFrete(double distancia, double consumo) {
		double resultado = distancia / consumo * 2.5;
		return resultado;
	}

}
