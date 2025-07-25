import java.util.Arrays;
import java.util.List;

public class Exercicio02 {

    /**
     * <h1>Soma de Quadrados de Números Pares</h1>
     * <p>Dada uma lista de inteiros, filtre apenas os números pares, eleve-os ao quadrado e retorne a soma desses valores utilizando reduce.</p>
     **/
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int soma = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .map(numero -> (int) Math.pow(numero, 2))
                .reduce(0, Integer::sum);

        System.out.println("Soma: " + soma);
    }
}
