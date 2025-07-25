import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio08 {

    /**
     * <h1>Calcular Média de Notas por Aluno</h1>
     * <p>Dada uma lista de objetos Aluno { String nome; List(Double) notas; }, retorne um mapa com o nome do aluno e a média das suas notas.</p>
     */
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Gilmar", Arrays.asList(1d, 3d, 6d));
        Aluno aluno2 = new Aluno("Carlos", Arrays.asList(10d, 10d, 10d));
        Aluno aluno3 = new Aluno("Nilson", Arrays.asList(5d, 5d, 5d));

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3);

        Map<String, Double> mapAlunoEMedia = alunos.stream().collect(Collectors.toMap(
                Aluno::getNome,
                aluno -> aluno.getNotas().stream()
                        .mapToDouble(nota -> nota)
                        .average()
                        .orElse(0d)
        ));

        mapAlunoEMedia.forEach((nome, media) ->
                System.out.println("Aluno: " + nome + " - Média: " + media)
        );
    }
}

class Aluno {

    private String nome;

    private List<Double> notas;

    public Aluno(String nome, List<Double> notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public List<Double> getNotas() {
        return notas;
    }
}
