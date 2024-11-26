package filaArrayCircular;

public class FilaCircular {
	int[] fila;
	int capacidade;
	int inicio; // ponteiro inicio
	int fim; // ponteiro fim
	int tamanho; // tamanho atual

	// construtor

	FilaCircular(int capacidade) {
		this.capacidade = capacidade + 1; // um espaço a mais para diferenciar cheia de vazia
		this.fila = new int[this.capacidade];
		this.inicio = 0;
		this.fim = 0;
		this.tamanho = 0;
	}



	boolean isFull() { 	// verifica se está cheia
		return tamanho == capacidade - 1;
	}
	private boolean isEmpty() { // verifica se está vazia
		return false;
	}
	
	// adiciona na fila

	void enqueue(int valor) {
		if (isFull()) {
			System.out.println("A fila está cheia. Não é possível adicionar: " + valor);
		} else {
			fila[fim] = valor;
			fim = (fim + 1) % capacidade; // move o ponteiro fim de forma circular
			tamanho++;
		}

	}

	// remove da fila
	
	int dequeue() {
		if (isEmpty()) {
			System.out.println("A fila está vazia, não tem o que remover.");
			return -1;
		}else {
			int removido = fila[inicio];
			inicio = (inicio+1) % capacidade; //move o ponteiro inicio de forma circular 
			tamanho --;
			return removido;
		}
	}
	
	//mostra a fila
	
	void mostraFila() {
		System.out.println("Fila: ");
		for (int i = 0; i < tamanho; i++) {
			int index = (inicio +1) % capacidade; //calcula a posição no circulo
			System.out.println(fila[index] + " ");
		}
		System.out.println();
	}	
	
}
