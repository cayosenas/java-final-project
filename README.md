criação do método construtor:

public class Produto {
    public String nome;
    public String categoria;
    public double preco;

    public Produto(String nome, String categoria, double preco){
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

lista de produtos será criada em class Loja usando um ArrayList

método adicionarProdutos adiciona os produtos na lista

método listarProdutos retorna todos os itens adicionados na lista

buscarCategoria retorna os itens selecionados por categoria criando uma lista, comparando a categoria dos itens e adicionando os itens da categoria escolhida na lista criada anteriormente

buscarNome retorna as características do item selecionado

        Loja loja = new Loja();

        Produto p1 = new Produto("Maçã", "Fruta", 1);
        Produto p2 = new Produto("Mamão", "Fruta", 2);
        Produto p3 = new Produto("Celular", "Eletrônicos", 3000);
        Produto p4 = new Produto("Sabonete", "Higiene", 10);

os itens são adicionados a Loja usando o método construtor criado anteriormente
