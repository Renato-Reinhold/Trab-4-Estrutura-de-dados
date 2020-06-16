package tabelas;
public class Main {

	public static void main(String[] args) {

//		MapaDispersao<String,Veiculo> mp = new MapaDispersao(2000);
//
//		Veiculo v = new Veiculo();
//		v.setPlaca("AAA-0123");
//		v.setModelo("Hyundai Creta");
//		v.setAno(2017);
//		v.setProprietario("João da Silva");
//		mp.inserir(v.getPlaca(), v);
//
//		System.out.println(mp.imprimir());

//		mapa.inserir("1", "1");
//		mapa.inserir("2", "2");
//		mapa.inserir("3", "3");
//		mapa.inserir("4", "4");
//		mapa.inserir("5", "4");
//		mapa.inserir("6", "4");
//		mapa.inserir("7", "4");
//		mapa.inserir("8", "4");
//		mapa.inserir("9", "4");
//		mapa.inserir("10", "4");
//		mapa.inserir("11", "4");
//		mapa.inserir("12", "4");
//		mapa.inserir("13", "8");
//		mapa.inserir("14", "8");
//		mapa.inserir("15", "8");
//		mapa.inserir("16", "8");
//		mapa.inserir("17", "8");
//		mapa.inserir("18", "8");
//		mapa.inserir("19", "8");
//		mapa.inserir("20", "8");
//		mapa.inserir("21", "8");
//		mapa.inserir("22", "8");
//		mapa.inserir("23", "8");
//		mapa.inserir("24", "8");
//		mapa.inserir("25", "8");
//		mapa.inserir("26", "8");
//		mapa.inserir("27", "8");
//		mapa.inserir("28", "8");
//		mapa.inserir("29", "8");
//		mapa.inserir("30", "8");
//
//
//		System.out.println(mapa.imprimir());

//		System.out.println("\nChave 2 removido: " + mapa.remover("2") +"\n");

//		System.out.println(mapa.imprimir());

//		System.out.println("\nChave 10 removida: " + mapa.remover("10") + "\n");
//
//		System.out.println(mapa.imprimir());
//
//		System.out.println("\nChave 24 removida: " + mapa.remover("24") + "\n");
//
//		System.out.println(mapa.imprimir());
		
//		System.out.println(mapa.buscar("4"));

		MapaDispersao<String,String> mapa = new MapaDispersao(7);

		mapa.inserir("1", "1");
		mapa.inserir("2", "3");
		mapa.inserir("9", "4");
		mapa.inserir("6", "5");
		mapa.inserir("23", "6");
		mapa.inserir("4", "7");
		mapa.inserir("0", "8");
		System.out.println(mapa.inserir("12", "8"));
		System.out.println(mapa.inserir("12", "9"));
		System.out.println(mapa.inserir("12", "10"));
		System.out.println(mapa.inserir("12", "11"));

		System.out.println(mapa.buscar("23"));

//		mapa.remover("9");

		System.out.println(mapa.buscar("9"));

		System.out.println(mapa.quantosElementos());

		System.out.println(mapa.imprimir());

	}
	
}
