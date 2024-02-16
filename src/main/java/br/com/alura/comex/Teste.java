package br.com.alura.comex;

public class Teste {
        public static void main (String[]args) {
                int valor = 20;
                Produto produto = new Produto("Celular");
                produto.setNome("Celular"); // Usando o método setter para definir o nome
                produto.setDescricao("Iphone 15");
                produto.setPrecoUnitario(7000.00);
                produto.setQuantidade(100);

                System.out.println(produto.getNome()); // Usando o método getter para acessar o nome
                System.out.println(produto.getDescricao());
                System.out.println(produto.getPrecoUnitario());
                System.out.println(produto.getQuantidade());

                String livro = "HarryPotter";
                double valor1 = 50.70;

                String celular2 = "MotoG";
                int valor2 = 600;


    }



}
