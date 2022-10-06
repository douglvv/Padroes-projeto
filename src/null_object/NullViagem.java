package null_object;

public class NullViagem extends AbstractViagem{

	@Override
	public String getDestino() {
		return "Viagem não existe na base de dados! Tente novamente.";
	}
	
}
