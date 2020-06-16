package tabelas;
import java.util.Arrays;

public class MapaDispersao<K, T> {

	private Lista<K, T>[] tabela;
	
	public MapaDispersao(int quantidade) {
		double n = 0.5;
		int tamanho = (int) (quantidade / n);
		if (isPrimo(tamanho)) {
			this.tabela = new Lista[tamanho];
		} else {
			for (int i = tamanho + 1; i < tamanho + 40; i++) {
				if (isPrimo(i)) {
					this.tabela = new Lista[i];
					break;
				}
			}
		}
	}
	
	private int caucularHash(K chave) {
		return (chave.hashCode() & 0x7fffffff) % tabela.length;
	}
	
	public boolean inserir(K chave, T dado) {
		int hash = caucularHash(chave);
		boolean result = true;
		Lista<K, T> list = tabela[hash];

		if(list == null) { //primeiro
			list = new Lista<K, T>();
			list.setChave(chave);
			list.setValor(dado);
			tabela[hash] = list;
		} else{
			while (list != null) {
				if (!list.getChave().equals(chave)) {
					Lista<K, T> proxLista = new Lista<K, T>();
					proxLista.setChave(chave);
					proxLista.setValor(dado);
					list.setProx(proxLista);
				}else{
					result = false;
				}
				list = list.getProx();
			}
		}

		return result;
	}
	
	public T remover(K chave) {
		int hash = caucularHash(chave);
		T dado = null;
		Lista<K, T> lista = tabela[hash];
		Lista<K, T> novaLista = null;
		//primeiro
		if(lista != null && lista.getChave().equals(chave)) {
			dado = lista.getValor();
			if (lista.getProx() != null) {
				novaLista = lista.getProx();
			} else {
				novaLista = null;
			}
			tabela[hash] = novaLista;
		}else{
			while(lista != null) {
				if(lista.getChave().equals(chave)) {
					if(lista.getProx() != null){
						novaLista.setProx(lista.getProx());
					}else{
						novaLista.setProx(null);
					}
					dado = lista.getValor();
				}
				novaLista = lista;
				lista = lista.getProx();
			}
		}

		return dado;
	}
	
	public T buscar (K chave) {
		int hash = caucularHash(chave);
		Lista<K, T> lista = tabela[hash];
		if (lista != null && lista.getChave().equals(chave)) {
			T valor = lista.getValor();
			return valor;
		} else {
			while(lista != null) {
				if (lista.getChave().equals(chave)) {
					T valor = lista.getValor();
					return valor;
				}
				lista = lista.getProx();
			}
		}
		return null;
	}
	
	public int quantosElementos() {
		int numero = 0;
		for (int i = 0; i<this.tabela.length; i++) {
			if (this.tabela[i] != null) {
				numero++;
				Lista<K, T> lista = this.tabela[i];
				while(lista.getProx() != null) {
					numero++;
					lista = lista.getProx();
				}
			}
		}
		return numero;
	}
	
	private boolean isPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
	
	public String imprimir() {
		return Arrays.asList(tabela).toString();
	}
	
}
