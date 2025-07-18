import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio07 {

    /**
     * <h1>Converter Lista de Strings para Mapa</h1>
     * <p>Dada uma lista de nomes, crie um Map onde a chave é o nome e o valor é o tamanho do nome.</p>
     */
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Robson", "Célia", "Josué");
        Map<String, Integer> mapNomeETamanho = nomes.stream().collect(Collectors.toMap(nome -> nome, String::length));
        mapNomeETamanho.forEach((nome, tamanho) -> System.out.println("Nome: " + nome + " - Tamanho: " + tamanho));
    }
}
