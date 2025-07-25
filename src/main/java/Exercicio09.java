import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio09 {

    /**
     * <h1>Agrupar Palavras por Tamanho</h1>
     * <p>Dada uma lista de palavras, agrupe as palavras por seu tamanho. Exemplo: palavras de 3 letras em uma lista,
     * palavras de 5 letras em outra, etc. Retorne um Map(Integer, List(String)).</p>
     */
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Carro", "Bicicleta", "Moto", "Maçã", "Uva", "Juíz");

        Map<Integer, List<String>> palavrasPorTamanho = palavras.stream().collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(palavra -> palavra, Collectors.toList())
                )
        );

        palavrasPorTamanho.forEach((tamanho, palavrasAgrupadas) ->
                System.out.println("Tamanho: " + tamanho + " - Palavras: " + palavrasAgrupadas.toString())
        );
    }
}
