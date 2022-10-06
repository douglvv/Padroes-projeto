package hook_method;

public class PassagemAVista extends Passagem {

	
	
	public PassagemAVista(double preco) {
		super(preco);
		this.preco = preco;
	}
	
	@Override
	protected double precoPassagem() {
		return this.preco;
	}



}
