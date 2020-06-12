package tabelas;

public class Lista<K, T>{

	private K chave;
	private T valor;
	private Lista<K,T> prox;
	
	public boolean inserir(K chave, T valor) {
		return false;
	}
	
	public T remover(K chave) {
		return null;
	}

	public K getChave() {
		return chave;
	}

	public void setChave(K chave) {
		this.chave = chave;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	public Lista<K, T> getProx() {
		return prox;
	}

	public void setProx(Lista<K, T> prox) {
		this.prox = prox;
	}
}
