package filaArrayCircular;

public class Main {

	public static void main(String[] args) {
		FilaCircular fila = new FilaCircular(5);
		
		fila.enqueue(10);
		fila.enqueue(20);
		fila.enqueue(30);
		fila.enqueue(40);
		
		fila.mostraFila();
		
		System.out.println("Removido: " + fila.dequeue()); // Remove 10
        fila.mostraFila(); 

        fila.enqueue(50); 
        fila.enqueue(60); 
        fila.mostraFila(); 

        fila.enqueue(70); // Tenta adicionar 70, mas está cheia
	}

}
