package hook_method;

public abstract class Passagem {
	double preco;
	
	

	public Passagem(double preco) {
		super();
		this.preco = preco;
	}

	protected abstract double precoPassagem();
	
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void precoAVista() {
		double desconto = 0.9;
		double precoFinal = precoPassagem() * desconto;
		System.out.println("O preço da passagem a vista é de R$: "+ precoFinal);
	}

	public void precoParcelado(double numParcelas) {
		double precoFinal = this.getPreco() / numParcelas;
		System.out.println("O preço da passagem parcelada em "+numParcelas+" vezes é de R$: "+precoFinal);
	}
	
}
