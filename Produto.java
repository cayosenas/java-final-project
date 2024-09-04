public class Produto {
    public String nome;
    public String categoria;
    public double preco;

    public Produto(String nome, String categoria, double preco){
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", categoria=" + categoria + ", preco=" + preco + "]";
    }
}