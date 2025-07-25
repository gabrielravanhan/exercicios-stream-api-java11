import java.util.Arrays;
import java.util.List;

public class Exercicio10 {

    /**
     * <h1>Verificar se Todos os Números São Positivos</h1>
     * <p>Dada uma lista de inteiros, use allMatch para verificar se todos os números são positivos.</p>
     */
    public static void main(String[] args) {
        List<Integer> inteiros = Arrays.asList(0, 1, 2, 5, 4, 9, -8);

        boolean todosSaoPositivos = inteiros.stream().allMatch(numero -> numero > 0);

        System.out.println("Todos são positivos: " + (todosSaoPositivos ? "sim." : "não"));
    }
}
