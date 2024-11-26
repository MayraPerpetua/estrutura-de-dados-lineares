public class Main {

	public static void main(String[] args) {
		FilaDuplicacao fila = new FilaDuplicacao(5);
		
		fila.enqueue(10);
		fila.enqueue(20);
		fila.enqueue(30);
		fila.enqueue(40);
		fila.enqueue(50);
		
		// A fila será duplicada ao tentar adicionar mais um elemento
        fila.enqueue(60); // Fila duplicada
		
     // Exibindo a fila após duplicação
        System.out.print("Fila atual: ");
        fila.mostraFila();
	}

}
