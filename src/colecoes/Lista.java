package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");

        lista.add(u1);
        lista.add(new Usuario("Maria"));
        lista.add(new Usuario("Julia"));
        lista.add(new Usuario("Bruno"));
        lista.add(new Usuario("Joao"));

        System.out.println(lista.get(2));

        System.out.println("Tem? "+lista.contains(new Usuario("Maria")));
        System.out.println("Tem? "+u1);

        for (Usuario u:lista){
            System.out.println(u);
        }
    }
}
