
import java.util.ArrayList;
import java.util.List;

public class Loja {
    public List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }

    public List<Produto> listarProdutos(){
        return new ArrayList<>(produtos);
    }

    public List<Produto> buscarCategoria(String categoria){
        List<Produto> listaPorCategoria = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.categoria.equals(categoria)) {
                listaPorCategoria.add(produto);
                return listaPorCategoria;
            }
        }
        return null;
    }

    public Produto buscarNome(String nome){
        for (Produto produto : produtos) {
            if (produto.nome.equals(nome)) {
               return produto;
                
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Loja loja = new Loja();

        Produto p1 = new Produto("Maçã", "Fruta", 1);
        Produto p2 = new Produto("Mamão", "Fruta", 2);
        Produto p3 = new Produto("Celular", "Eletrônicos", 3000);
        Produto p4 = new Produto("Sabonete", "Higiene", 10);

        loja.adicionarProduto(p1);
        loja.adicionarProduto(p2);
        loja.adicionarProduto(p3);
        loja.adicionarProduto(p4);

        System.out.println(loja.buscarNome("Celular").toString());

        System.out.println(loja.buscarCategoria("Fruta").toString());

        System.out.println(loja.listarProdutos().toString());
    }
}