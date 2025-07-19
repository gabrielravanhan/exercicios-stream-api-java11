import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio14 {

    /**
     * <h1>Remover Palavras Duplicadas e Ordenar por Tamanho</h1>
     * <p>Dada uma lista de palavras, remova as duplicadas e ordene as restantes pelo tamanho da palavra (do menor para o maior). Use distinct e Comparator.comparingInt(String::length).</p>
     */
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Reinaldinho", "Rei", "Reinaldo");

        palavras = palavras.stream().distinct().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());

        palavras.forEach(System.out::println);
    }
}
