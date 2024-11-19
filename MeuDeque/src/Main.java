
public class Main {

	public static void main(String[] args) {
		MeuDeque<String> deque = new MeuDeque<>(); // criando o deque
		
		// inserindo elementos fomando o nome MAY
		
		deque.addFirst("A");
		deque.addLast("Y");
		deque.addFirst("M");
		
		//exibindo os elementos
		System.out.println("primeiro elemento: " + deque.peekFirst()); // M
		System.out.println("Ultimo elemento: "+ deque.peekLast()); // Y

		//removendo os elementos
		
		System.out.println("Removendo do início: " + deque.removeFirst());
		System.out.println("Removendo do fim: " + deque.removeLast());
		
		//resultado final
		
		System.out.println("Elemento que restou: " + deque.peekFirst()); // A
	}

}
