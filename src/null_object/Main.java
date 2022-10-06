package null_object;

public class Main {

	public static void main(String[] args) {
		AbstractViagem canoinhas = DAOViagem.getDestino("Canoinhas");
		AbstractViagem tresBarras = DAOViagem.getDestino("Tres Barras");
		AbstractViagem saoCrispim = DAOViagem.getDestino("São Crispim");
		AbstractViagem florianopolis = DAOViagem.getDestino("Florianopolis");
		AbstractViagem samas = DAOViagem.getDestino("Sao Mateus do Sul");
		
		System.out.println("Viagens:");
		//viagens existentes
		System.out.println(canoinhas.getDestino());
		System.out.println(tresBarras.getDestino());
		System.out.println(florianopolis.getDestino());
		
		
		// viagens nao existente
		System.out.println(saoCrispim.getDestino());
		System.out.println(samas.getDestino());
	}

}
