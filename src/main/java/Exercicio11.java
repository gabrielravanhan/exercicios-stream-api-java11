import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercicio11 {

    /**
     * <h1>Encontrar o Nome Mais Longo</h1>
     * <p>Dada uma lista de nomes (List(String)), encontre o nome com o maior número de caracteres. Em caso de empate, retorne o primeiro encontrado. Use max(Comparator).</p>
     */
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Cleiton", "Carolina", "Waldemar");

        String nomeComMaiorNumeroDeCaracteres = nomes.stream().max(Comparator.comparingInt(String::length)).stream().findFirst().orElse("Lista vazia.");

        System.out.println(nomeComMaiorNumeroDeCaracteres);
    }
}
