package hook_method;

public class PassagemParcelado extends Passagem{

	
	
	
	public PassagemParcelado(double preco) {
		super(preco);
		this.preco = preco;
	}
	
	

	@Override
	public double precoPassagem() {
		return this.preco;
	}


	
}
