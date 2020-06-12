package tabelas;

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
		return 0;
	}
	
	public boolean inserir(K chave, T dado) {
		return false;
	}
	
	public T remover(K chave) {
		return null;
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
	
	private static boolean isPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }
	
	public int aaa() {
		return this.tabela.length;
	}
	
}
