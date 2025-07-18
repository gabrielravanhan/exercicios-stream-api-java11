import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio01 {

    /**
     * <h1>1. Filtrar e Mapear Nomes</h1>
     * <p>Dada uma lista de nomes (List<String>), filtre os nomes que possuem mais de 4 letras e retorne uma nova lista contendo os nomes em letras maiúsculas.</p>
     **/
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ronaldinho", "Nilmar", "Ana", "Mel");
        List<String> nomesEmMaiusculoComMaisDeQuatroLetras = nomes.stream().filter(nome -> nome.length() > 4).map(String::toUpperCase).collect(Collectors.toList());
        nomesEmMaiusculoComMaisDeQuatroLetras.forEach(System.out::println);
    }
}
