package strategy;

public class Main {

	public static void main(String[] args) {
		Veiculo van = new VeiculoVan(1, "ABC123", "Van");
		Veiculo onibus = new VeiculoOnibus(2, "DEF456", "Onibus");
		
		Frete freteVan = new Frete(van, new CalculoVan(), 1500.35, 7.0);
		System.out.printf("Veículo: " + freteVan.getVeiculo().getNome() + "\tPlaca: " + 
		freteVan.getVeiculo().getPlaca() +"\t Valor do Frete: R$ %.2f ",freteVan.valorFrete());
		
		Frete freteOnibus = new Frete(onibus, new CalculoOnibus(), 1500.35, 3);
		System.out.printf("\nVeículo: " + freteOnibus.getVeiculo().getNome() + "\tPlaca: " + 
				freteOnibus.getVeiculo().getPlaca() +"\t Valor do Frete: R$ %.2f ",freteOnibus.valorFrete());
	}

}
