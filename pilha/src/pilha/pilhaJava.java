package pilha;

public class pilhaJava {

	public Object[] pilha;
	public int posicaoPilha;
	
	public int pilha() {
		this.posicaoPilha = -1; // indica vazio, pq a posição zero ja armazena informação
		this.pilha = new Object[10]; //criando uma pilha com 10 posições
	}
	
	public boolean pilhaVazia() {
		if(this.posicaoPilha == -1) {
			return true; //verifica se o atributo posicaoPilha é -1, se sim, a pilha é nula (ainda esta vazia)
			}
			
	}
	
	public int tamanho() {
		if(this.pilhaVazia()) {
			return 0; // indica que nao tem conteudo na pilha
		}
		return this.posicaoPilha +1; // indica quantos elementos tem na pilha (indice+1)
}
	

	
