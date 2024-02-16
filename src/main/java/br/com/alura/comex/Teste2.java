package br.com.alura.comex;

public class Teste2 {
    public static void main(String[] args) {
        Produto produtoA = new Produto("celular");
        produtoA.setNome("celular");
        produtoA.setDescricao("celular novo");
        produtoA.setQuantidade(10);
        produtoA.setPrecoUnitario(1000);

        Produto produtoB = new Produto( "celular");
        produtoB.setNome("celular");
        produtoB.setDescricao("celular novo");
        produtoB.setQuantidade(10);
        produtoB.setPrecoUnitario(1000);

        System.out.println("Produto A:");
        System.out.println("Nome: " + produtoA.getNome());
        System.out.println("Descrição: " + produtoA.getDescricao());
        System.out.println("Quantidade: " + produtoA.getQuantidade());
        System.out.println("Preço Unitário: " + produtoA.getPrecoUnitario());

        System.out.println("\nProduto B:");
        System.out.println("Nome: " + produtoB.getNome());
        System.out.println("Descrição: " + produtoB.getDescricao());
        System.out.println("Quantidade: " + produtoB.getQuantidade());
        System.out.println("Preço Unitário: " + produtoB.getPrecoUnitario());

        int valorA = 40;
        int valorB = 40;

        System.out.println(valorA == valorB);

    }
}
