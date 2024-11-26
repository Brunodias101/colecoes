package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        //Ambos adicionam elementos na fila
        //.add() lançará uma exceção caso a fila esteja cheia.
        //.offer() retorna falso caso a fila esteja cheia.

        fila.add("Ana");
        fila.offer("Bia");
        fila.add("Carlo");
        fila.offer("Bruno");
        fila.add("maria");

        //Quando a fila esta vazia!
        // peek() -> retorna falso
        //element() -> retorna uma excessão

        System.out.println(fila.peek());
        System.out.println(fila.element());

        //poll() -> retorna o primeiro elemeno e remove
        //diferença quando a fila vazia
        System.out.println(fila.poll()); //retorna false(null)
        System.out.println(fila.peek());

        System.out.println(fila.remove()); // lança uma exceção
        System.out.println(fila.peek());
    }
}
