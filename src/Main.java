import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> mapa = new TreeMap<>();

        mapa.put(1, "joao");
        mapa.put(2, "david");
        mapa.put(3, "rafael");
        mapa.put(63, "gustavo");
        mapa.put(25, "victorio");
        mapa.put(124, "ze");
        mapa.put(14, "mane");

        System.out.println("arvore: " + mapa);

        System.out.println("matrícula 25 pertence a: " + mapa.get(25));

        mapa.remove(124);

        System.out.println("Itens restantes:");
        for (Integer chave : mapa.keySet()) {
            System.out.println(chave + " → " + mapa.get(chave));
        }

        System.out.println("Primeira chave: " + mapa.firstKey());
        System.out.println("Última chave: " + mapa.lastKey());
    }
}
