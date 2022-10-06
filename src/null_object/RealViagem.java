package null_object;

public class RealViagem extends AbstractViagem{

	public RealViagem(String destino) {
		super();
		this.destino = destino;
	}

	@Override
	public String getDestino() {
		return this.destino;
	}

}
