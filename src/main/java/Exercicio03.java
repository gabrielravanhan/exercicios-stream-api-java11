import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio03 {

    /**
     * 3. Agrupar Pessoas por Idade
     * Dada uma lista de objetos Pessoa { String nome; int idade; }, agrupe as pessoas por idade utilizando Collectors.groupingBy.
     */
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Ana", 25),
                new Pessoa("Bruno", 30),
                new Pessoa("Carlos", 25),
                new Pessoa("Eduardo", 25)
        );
        Map<Integer, List<Pessoa>> pessoasAgrupadasPorIdade = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getIdade));
        pessoasAgrupadasPorIdade.forEach((idade, lista) -> System.out.println("Idade: " + idade + " - Pessoas: " + lista.toString()));
    }
}

class Pessoa {

    private final String nome;

    private final int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
