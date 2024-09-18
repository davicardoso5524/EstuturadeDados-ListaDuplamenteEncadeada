public class ListaDuplamenteEncadeada {
	private No primeiro;
	private No ultimo;
	
	public ListaDuplamenteEncadeada() {
		this.primeiro = null;
		this.ultimo = null;
	}
	
	public void adicionarNoFinal(int dado) {
		No novoNo = new No(dado);
		
		if (primeiro == null) {
			primeiro = novoNo;
			ultimo = novoNo;
		} else {
			ultimo.proximo = novoNo;
			novoNo.anterior = ultimo;
			ultimo = novoNo;
		}
	}
	
	public void adicionarNoInicio(int dado) {
		No novoNo = new No(dado);
		
		if (primeiro == null) {
			primeiro = novoNo;
			ultimo = novoNo;
		} else {
			novoNo.proximo = primeiro;
            primeiro.anterior = novoNo;
            primeiro = novoNo;
		}
	}
	
	public void remover(int dado) {
		No atual = primeiro;
		while (atual != null) {
			if (atual.dado == dado) {
				if (atual == primeiro) {
					primeiro = atual.proximo;
					if (primeiro != null) {
						primeiro.anterior = null;
					}
				} else if (atual == ultimo) {
					ultimo = atual.anterior;
					if (ultimo != null) {
						ultimo.proximo = null;
					}
				} else {
					
				}
				break;
			}
			atual = atual.proximo;
		}
	}








}
