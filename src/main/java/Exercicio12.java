import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio12 {

    /**
     * <h1>Juntar Strings com Delimitador</h1>
     * <p>Dada uma lista de palavras (List(String)), crie uma única string contendo todas as palavras separadas por vírgula (, ), usando Collectors.joining.</p>
     * <p>Exemplo de entrada: ["banana", "maçã", "uva"]</p>
     * <p>Saída esperada: "banana, maçã, uva"</p>
     */
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("banana", "maçã", "uva");

        String juncaoDePalavras = palavras.stream().collect(Collectors.joining(", ")); // ou somente String.join(", ", palavras)

        System.out.println(juncaoDePalavras);
    }
}
