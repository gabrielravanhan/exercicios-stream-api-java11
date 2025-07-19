import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio15 {

    /**
     * <h1>Agrupar Transações por Categoria e Somar Valores</h1>
     * <p>Dada uma lista de objetos Transacao { String categoria; double valor; }, agrupe as transações por categoria e
     * calcule o valor total de cada uma (Map(String, Double)), usando Collectors.groupingBy com summingDouble.</p>
     */
    public static void main(String[] args) {
        Transacao transacao1 = new Transacao("Categoria 1", 80d);
        Transacao transacao2 = new Transacao("Categoria 1", 50d);
        Transacao transacao3 = new Transacao("Categoria 1", 20d);
        Transacao transacao4 = new Transacao("Categoria 2", 10d);
        Transacao transacao5 = new Transacao("Categoria 2", 2d);
        Transacao transacao6 = new Transacao("Categoria 3", 900d);

        List<Transacao> transacoes = Arrays.asList(transacao1, transacao2, transacao3, transacao4, transacao5, transacao6);

        Map<String, Double> transacaoPorCategoria = transacoes.stream().collect(Collectors.groupingBy(Transacao::getCategoria, Collectors.summingDouble(Transacao::getValor)));

        transacaoPorCategoria.forEach((categoria, total) -> System.out.println("Categoria: " + categoria + " - Total: " + total));
    }
}

class Transacao {

    private String categoria;

    private double valor;

    public Transacao(String categoria, double valor) {
        this.categoria = categoria;
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
