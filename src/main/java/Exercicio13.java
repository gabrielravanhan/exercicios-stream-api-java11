import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio13 {

    /**
     * <h1>Obter os 3 Maiores Números Únicos</h1>
     * <p>Dada uma lista de inteiros (com possíveis repetições), retorne uma lista com os 3 maiores números distintos em ordem decrescente. Utilize distinct, sorted, limit.</p>
     */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 99, 98, 99, 100);

        List<Integer> tresMaioresNumerosEmOrdemDecrescente = numeros.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());

        tresMaioresNumerosEmOrdemDecrescente.forEach(System.out::println);
    }
}
