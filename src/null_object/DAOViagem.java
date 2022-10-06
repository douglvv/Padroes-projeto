package null_object;

public class DAOViagem {
	public static final String[] viagens = { "Canoinhas", "Tres Barras", "Florianopolis" };

	public static AbstractViagem getDestino(String destino) {
		for (int i = 0; i < viagens.length; i++) 
			if (viagens[i].equalsIgnoreCase(destino)) 
				return new RealViagem(destino);			
		
		return new NullViagem();
	}
}
