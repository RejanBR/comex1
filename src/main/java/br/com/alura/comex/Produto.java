package br.com.alura.comex;

public class Produto {
    public String nome;// Renomeado para 'nome'

    private String descricao;
    private double precoUnitario;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Produto(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {

        return """
                >>Dados do produto
                ::Nome: %s           
                ::Descirção: %d
                ::Preço Unitário: %.2f
                """.formatted(nome, descricao, quantidade, precoUnitario);





    }
}
