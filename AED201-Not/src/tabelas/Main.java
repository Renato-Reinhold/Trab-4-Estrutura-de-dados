package tabelas;

public class Main {

	public static void main(String[] args) {
		
		MapaDispersao<String, String> mapa = new MapaDispersao<String, String>(5);
		
		mapa.inserir("1", "1");
		mapa.inserir("2", "2");
		mapa.inserir("3", "3");
		mapa.inserir("4", "4");
		mapa.inserir("13", "4");
		
		System.out.println(mapa.imprimir());
		
	}
	
}