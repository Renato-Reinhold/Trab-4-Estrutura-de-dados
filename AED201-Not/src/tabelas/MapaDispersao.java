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
		Lista<K, T> list = tabela[hash];
		
		if(list != null) {
			while(list.getProx() != null) {
				if(list.getChave().equals(chave)) {
					return false;
				}
				list = list.getProx();
			}
			Lista<K, T> proxLista = new Lista<K, T>();
			proxLista.setChave(chave);
			proxLista.setValor(dado);
			list.setProx(proxLista);
		}
		
		if(list == null) {
			list = new Lista<K, T>();
			list.setChave(chave);
			list.setValor(dado);
		}
		
		if(tabela[hash] == null) {
			tabela[hash] = list;
		}
		
		return true;
	}
	
	public T remover(K chave) {
		int hash = caucularHash(chave);
		T dado = null;
		Lista<K, T> lista = tabela[hash];

		while(lista != null) {
			if(lista.getChave().equals(chave)) {
				dado = lista.getValor();
				lista = null;
			}
			lista = lista.getProx();
		}
		
		tabela[hash] = lista;
		return dado;
	}
	
	public T buscar (K chave) {
		return null;
	}
	
	public int quantosElementos() {
		int numero = 0;
		for (int i = 0; i<=this.tabela.length; i++) {
			if (this.tabela[i] != null) {
				numero++;
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
