import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Exercicio06 {

    /**
     * <h1>Listar Produtos Únicos de Pedidos</h1>
     * <p>Dada uma lista de pedidos (Pedido { int id; List(Produto) produtos; }), obtenha uma lista sem repetição de todos os produtos utilizando flatMap e distinct.</p>
     */
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz");
        Produto produto2 = new Produto("Feijão");
        Produto produto3 = new Produto("Macarrão");
        Produto produto4 = new Produto("Carne");

        Pedido pedido1 = new Pedido(1, Arrays.asList(produto1, produto2));
        Pedido pedido2 = new Pedido(2, Arrays.asList(produto3, produto4));
        Pedido pedido3 = new Pedido(3, Arrays.asList(produto1, produto4));

        List<Pedido> pedidos = Arrays.asList(pedido1, pedido2, pedido3);

        List<Produto> produtosSemRepeticao = pedidos.stream()
                .flatMap(pedido -> pedido.getProdutos().stream())
                .distinct()
                .collect(Collectors.toList());

        produtosSemRepeticao.forEach(produto -> System.out.println(produto.getNome()));
    }
}

class Pedido {

    private int id;

    private List<Produto> produtos;

    public Pedido(int id, List<Produto> produtos) {
        this.id = id;
        this.produtos = produtos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}

class Produto {

    private String nome;

    public Produto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
