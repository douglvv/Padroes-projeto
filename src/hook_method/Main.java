package hook_method;

public class Main {

	public static void main(String[] args) {
		Passagem aVista = new PassagemAVista(500.0);
		Passagem parcelada = new PassagemParcelado(500.0);
		
		aVista.precoAVista();
		parcelada.precoParcelado(5);
		
		

	}

}
