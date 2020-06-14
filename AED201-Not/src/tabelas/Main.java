package tabelas;
public class Main {

	public static void main(String[] args) {
		
		MapaDispersao<String, String> mapa = new MapaDispersao<String, String>(5);
		
		mapa.inserir("1", "1");
		mapa.inserir("2", "2");
		mapa.inserir("3", "3");
		mapa.inserir("4", "4");
		mapa.inserir("13", "8");
		
//		System.out.println(mapa.imprimir());

//		System.out.println(mapa.remover("2"));

		System.out.println(mapa.imprimir());
		
		System.out.println(mapa.buscar("4"));

	}
	
}
