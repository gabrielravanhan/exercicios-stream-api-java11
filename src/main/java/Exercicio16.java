import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercicio16 {

    /**
     * <h1>Agrupar Transações por Categoria e Somar Valores</h1>
     * <p>Dada uma lista de objetos TransacaoBig { String categoria; double valor; }, agrupe as transações por categoria e
     * calcule o valor total de cada uma (Map(String, Double)), usando Collectors.groupingBy com summingDouble.</p>
     */
    public static void main(String[] args) {
        TransacaoBig TransacaoBig1 = new TransacaoBig("Categoria 1", BigDecimal.valueOf(80));
        TransacaoBig TransacaoBig2 = new TransacaoBig("Categoria 1", BigDecimal.valueOf(50));
        TransacaoBig TransacaoBig3 = new TransacaoBig("Categoria 1", BigDecimal.valueOf(20));
        TransacaoBig TransacaoBig4 = new TransacaoBig("Categoria 2", BigDecimal.valueOf(10));
        TransacaoBig TransacaoBig5 = new TransacaoBig("Categoria 2", BigDecimal.valueOf(2));
        TransacaoBig TransacaoBig6 = new TransacaoBig("Categoria 3", BigDecimal.valueOf(900));

        List<TransacaoBig> transacoes = Arrays.asList(TransacaoBig1, TransacaoBig2, TransacaoBig3, TransacaoBig4, TransacaoBig5, TransacaoBig6);

        Map<String, BigDecimal> transacaoBigPorCategoria = transacoes.stream()
                .collect(
                        Collectors.groupingBy(
                                TransacaoBig::getCategoria,
                                Collectors.reducing(BigDecimal.ZERO, TransacaoBig::getValor, BigDecimal::add)
                        )
                );

        transacaoBigPorCategoria.forEach((categoria, total) ->
                System.out.println("Categoria: " + categoria + " - Total: " + total)
        );
    }
}

class TransacaoBig {

    private String categoria;

    private BigDecimal valor;

    public TransacaoBig(String categoria, BigDecimal valor) {
        this.categoria = categoria;
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
