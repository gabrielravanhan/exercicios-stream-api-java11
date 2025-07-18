import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio04 {

    /**
     * <h1>4. Contar Palavras por Letra Inicial</h1>
     * Dada uma lista de palavras, conte quantas palavras começam com cada letra (ex: 'a', 'b', etc). Retorne um Map(Character, Long).
     */
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Café", "Cigarro", "Almoço", "Limonada");
        Map<Character, Long> quantidadeDePalavrasPorLetraInicial = palavras.stream().collect(Collectors.groupingBy(palavra -> palavra.toUpperCase().charAt(0), Collectors.counting()));
        quantidadeDePalavrasPorLetraInicial.forEach((palavra, quantidade) -> System.out.println("Palavra: " + palavra + " - Quantidade: " + quantidade));
    }
}
