//Mônica Luiza
//Renato Muller Reinhold
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

		MapaDispersao<String,String> mapa = new MapaDispersao(7);

		System.out.println(mapa.inserir("1", "1"));
		System.out.println(mapa.inserir("2", "3"));
		System.out.println(mapa.inserir("9", "4"));
		System.out.println(mapa.inserir("6", "5"));
		System.out.println(mapa.inserir("23", "6"));
		System.out.println(mapa.inserir("4", "7"));
		System.out.println(mapa.inserir("0", "8"));
		System.out.println(mapa.inserir("12", "8"));
		System.out.println(mapa.inserir("12", "9"));
		System.out.println(mapa.inserir("12", "10"));
		System.out.println(mapa.inserir("12", "11"));

a		System.out.println(mapa.buscar("23"));

		mapa.remover("9");

		System.out.println(mapa.buscar("9"));

		System.out.println(mapa.quantosElementos());

		System.out.println(mapa.imprimir());

	}
	
}
