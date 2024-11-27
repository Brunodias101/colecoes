package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto");
        usuarios.put(2, "Rob");
        usuarios.put(3, "Berto");
        usuarios.put(4, "Rodolfo");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.containsValue("Rob"));

        System.out.println(usuarios.get(3));

        System.out.println(usuarios.remove(1));
        System.out.println(usuarios.remove(4,"Bruno"));

        System.out.println("--------------");

        for (int chave: usuarios.keySet()){
            System.out.println(chave);
        }

        System.out.println("--------------");

        for (String valor: usuarios.values()){
            System.out.println(valor);
        }

        System.out.println("--------------");

        for (Map.Entry<Integer,String> registro: usuarios.entrySet()){
            System.out.println(registro);
        }

    }
}
