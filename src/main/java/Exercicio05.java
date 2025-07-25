import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exercicio05 {

    /**
     * <h1>Encontrar o Primeiro Número Divisível por 3 e 7</h1>
     * <p>Dada uma lista de inteiros, encontre o primeiro número que é divisível por 3 e 7. Retorne como Optional(Integer) usando filter e findFirst.</p>
     */
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 2, 21, 14);

        Optional<Integer> numeroOptional = numeros.stream()
                .filter(numero -> numero % 3 == 0 && numero % 7 == 0)
                .findFirst();

        System.out.println(numeroOptional.isPresent() ? numeroOptional.get() : "Não há número divisível por 3 e 7 na lista.");
    }
}
