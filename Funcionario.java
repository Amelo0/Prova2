package P3.PROVA2;

import java.util.Scanner;

public class Funcionario extends ClienteEspecial{
    private String setor;
    private int id;
    private double salario;

    public Funcionario(){

    }

    public Funcionario(String nome, int idade, String cpf, String endereço, boolean bomCliente, Item[] carrinhoDeCompras, int pontos, double saldoDeCompras, String setor, int id, double salario) {
        super(nome, idade, cpf, endereço, bomCliente, carrinhoDeCompras, pontos, saldoDeCompras);
        this.setor = setor;
        this.id = id;
        this.salario = salario;
    }

    public void renovarEstoque(Item item){
        Scanner in = new Scanner(System.in);
        System.out.println("Insira a quantidade à ser reposta o estoque: ");
        int reposição = in.nextInt();

        item.setQuantidadeEmEstoque(item.getQuantidadeEmEstoque()+reposição);
    }

    public void bloquearItem(Item item){
        if (item.isDisponibilidade() == true){
            item.setDisponibilidade(false);
        }else item.setDisponibilidade(true);
    }
}
