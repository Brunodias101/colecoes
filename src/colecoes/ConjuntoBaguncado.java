package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto =  new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("teste");
        conjunto.add(1);
        conjunto.add("X");

        System.out.println("Tamanho é " + conjunto.size());

        conjunto.add("Teste");
        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.remove("teste"));
        System.out.println("Tamanho é " + conjunto.size());

        System.out.println(conjunto.contains(1));

        //

        Set nuns =  new HashSet();
        nuns.add(1);
        nuns.add(2);
        nuns.add(3);

        System.out.println(nuns);
        System.out.println(conjunto);

        //conjunto.addAll(nuns); //união entre dois conjuntos
        conjunto.retainAll(nuns); //deixa so o que tem nos dois conjuntos

        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);


    }
}
