package br.com.alura.comex;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Tarefa5 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.bairro = "Presidente";
        endereco.cidade = "Araçatuba";
        endereco.estado = "SP";
        endereco.rua = "Maria Madeu Falco";
        endereco.numero = 459;

        Cliente cliente = new Cliente();
        cliente.cpf = "123.123.123-12";
        cliente.nome = "Rejan";
        cliente.telefone ="12345612";
        cliente.endereco = endereco.toString();



        System.out.println(cliente.nome);
        System.out.println(endereco.rua);
        System.out.println(cliente.endereco);






    }
}