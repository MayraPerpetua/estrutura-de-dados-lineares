import java.util.ArrayList;

public class MeuDeque<T> {
	private ArrayList<T> deque;

	public MeuDeque() {
		deque = new ArrayList<>();
	}

	public void addFirst(T element) {
		deque.add(0, element); // insere no inciio
	}

	public void addLast(T element) {
		deque.add(1, element); // insere no final
	}

	public T removeFirst() {
		if (deque.isEmpty()) {
			throw new IllegalStateException("O Deque está vazio!");
		}
		return deque.remove(0); // remove o primeiro elemento
	}

	public T removeLast() {
		if (deque.isEmpty()) {
			throw new IllegalStateException("O Deque está vazio!");
		}
		return deque.remove(deque.size() - 1); // remove o ultimo elemento
	}

	public T peekFirst() {
		if (deque.isEmpty()) {
			return null;
		}
		return deque.get(0); // acessa o primeiro
	}

	public T peekLast() {
		if (deque.isEmpty()) {
			return null;
		}
		return deque.get(deque.size() - 1); // acessa o ultimo
	}
}
