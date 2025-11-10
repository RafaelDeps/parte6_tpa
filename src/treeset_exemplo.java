import java.util.TreeSet;

public class treeset_exemplo {
    public static void main(String[] args) {
        TreeSet<Integer> arvore = new TreeSet<>();

        arvore.add(1);
        arvore.add(2);
        arvore.add(3);
        arvore.add(63);
        arvore.add(25);
        arvore.add(124);
        arvore.add(14);
        arvore.add(2);

        System.out.println("arvore ordenada " + arvore);

        System.out.println(("buscar elemento 124 " + arvore.contains(124)));

        arvore.remove(1);

        System.out.println("Itens restantes:");
        for (Integer item : arvore) {
            System.out.println(item);
        }

        System.out.println("primeiro: " +arvore.first());
        System.out.println("ultimo: " + arvore.last());

        arvore.remove(14);

        System.out.println("arvore ordenada " + arvore);


    }
}
