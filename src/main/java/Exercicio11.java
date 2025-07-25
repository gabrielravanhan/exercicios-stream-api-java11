import java.util.*;

public class Exercicio11 {

    /**
     * <h1>Encontrar o Nome Mais Longo</h1>
     * <p>Dada uma lista de nomes (List(String)), encontre o nome com o maior número de caracteres. Em caso de empate, retorne o primeiro encontrado. Use max(Comparator).</p>
     */
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(Arrays.asList("teste", "robinho jr."));

        Optional<String> max = nomes.stream().max(Comparator.comparingInt(String::length));

        max.ifPresentOrElse(System.out::println, () -> System.out.println("lista vazia"));
    }
}
