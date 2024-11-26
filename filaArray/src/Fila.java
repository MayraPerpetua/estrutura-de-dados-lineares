package src;

public class Fila {
	int[] fila;
	int tamanho; // quantas pessoas estao na fila
	int capacidade; // quanto cabe na fila

	// construtor da fila

	Fila(int capacidade) {
		this.capacidade = capacidade;
		this.fila = new int[capacidade]; // cria o array
		this.tamanho = 0; // começa vazio
	}

	// adicionar na fila
	void enqueue(int valor) {
		if (tamanho == capacidade) {
			System.out.println("A fila esta cheia!");
		} else {
			fila[tamanho] = valor; // coloca no final
			tamanho++; // aumenta o tamanho
		}
	}

	// remover da fila

	void dequeue() {
		if (tamanho == 0) {
			System.out.println("A fila está vazia! Ninguém para sair.");
			return -1; // Indica que deu errado
		} else {
			int removido = fila[0]; // Pega o primeiro da fila
			// Move todo mundo para frente
			for (int i = 0; i < tamanho - 1; i++) {
				fila[i] = fila[i + 1];
			}
			fila[tamanho - 1] = 0; // Limpa o último lugar
			tamanho--; // Diminui o tamanho
			return removido; // Devolve o que foi removido
		}
	}
	
	// Mostrar a fila
	
    void mostrarFila() {
        System.out.print("Fila: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(fila[i] + " ");
        }
        System.out.println();
    }
}
