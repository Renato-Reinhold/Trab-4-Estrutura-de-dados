package tabelas;

public class Lista<K, T>{

	private K chave;
	private T dado;
	private Lista<K,T> prox;

	public K getChave() {
		return chave;
	}

	public void setChave(K chave) {
		this.chave = chave;
	}

	public T getValor() {
		return dado;
	}

	public void setValor(T dado) {
		this.dado = dado;
	}

	public Lista<K, T> getProx() {
		return prox;
	}

	public void setProx(Lista<K, T> prox) {
		this.prox = prox;
	}
	
	@Override
	public String toString() {
		return "\n["+chave.toString()+"] = " + dado + ((prox != null) ? " | " + prox.toString() : "\n");
	}
}
