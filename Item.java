package P3.PROVA2;

public class Item {
    private String nome;
    private int codigo;
    private double valor;
    private int quantidadeEmEstoque;
    private boolean disponibilidade;

    public Item() {
    }

    public Item(String nome, int codigo, double valor, int quantidadeEmEstoque, boolean disponibilidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.disponibilidade = disponibilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
