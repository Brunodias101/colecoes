package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pìlha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<String>();

        livros.add("O pequeno Principe");
        livros.push("Don quixote");
        livros.push("O hobbit");

        for (String livro: livros){
            System.out.println(livro);
        }

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.pop());
        System.out.println(livros.poll());
    }
}
