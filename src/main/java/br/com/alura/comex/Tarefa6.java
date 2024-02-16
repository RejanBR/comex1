package br.com.alura.comex;

public class Tarefa6 {
    public static void main(String[] args) {



        Produto produto = new Produto("Senhor dos Aneis");
        produto.setNome("Senhor dos Aneis");
        produto.setDescricao("Sociedade do anel");
        produto.setPrecoUnitario(49.50);
        produto.setQuantidade(30);

        System.out.println(produto.getNome());

    }
}
