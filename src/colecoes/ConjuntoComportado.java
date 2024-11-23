package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        //Set<String> listaAprovados = new HashSet<>();
        SortedSet<String> listaAprovados = new TreeSet<>();

        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for (String canditado: listaAprovados){
            System.out.println(canditado);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(13);
        nums.add(156);
        nums.add(178);

        for (int n: nums){
            System.out.println(n);
        }


    }
}
