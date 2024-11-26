
public class Main {

	public static void main(String[] args) {
		Fila minhaFila = new Fila(5); // Uma fila com 5 lugares

		minhaFila.enqueue(10); 
		minhaFila.enqueue(20);
		minhaFila.enqueue(30); 
		minhaFila.mostrarFila(); 

		System.out.println("Saiu: " + minhaFila.dequeue()); // Remove o primeiro: 10
		minhaFila.mostrarFila(); // Mostra: 20 30

		minhaFila.enqueue(40); 
		minhaFila.mostrarFila(); 
	}

}
