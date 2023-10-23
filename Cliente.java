package P3.PROVA2;

public class Cliente {
    private String nome;
    private int idade;
    private String cpf;
    private String endereço;
    private boolean bomCliente;
    private Item[] carrinhoDeCompras = new Item[100];

    public Cliente() {
    }

    public Cliente(String nome, int idade, String cpf, String endereço, boolean bomCliente, Item[] carrinhoDeCompras) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereço = endereço;
        this.bomCliente = bomCliente;
        this.carrinhoDeCompras = carrinhoDeCompras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public boolean isBomCliente() {
        return bomCliente;
    }

    public void setBomCliente(boolean bomCliente) {
        this.bomCliente = bomCliente;
    }

    public Item[] getCarrinhoDeCompras() {
        return carrinhoDeCompras;
    }

    public void setCarrinhoDeCompras(Item[] carrinhoDeCompras) {
        this.carrinhoDeCompras = carrinhoDeCompras;
    }

    //metodo adicionar
    public void adicionar(Item i1, Item[] carrinhoDeCompras) {
        for (int i = 0; i <= carrinhoDeCompras.length - 1; i++) {
            if (carrinhoDeCompras[i] == null) {
                carrinhoDeCompras[i] = i1;
            }

        }
    }

    //metodo cancelar
    public void cancelar(int codigoProduto, Item[] carrinhoDeCompras) {

        for (int i = 0; i <= carrinhoDeCompras.length - 1; i++) {
            if (carrinhoDeCompras[i].getCodigo() == codigoProduto) {
                carrinhoDeCompras[i] = null;
            }
        }
    }

    //metodo finalizar compra
    public double finalizarCompra() {
        double soma = 0;
        for (int i = 0; i <= carrinhoDeCompras.length - 1; i++) {
            if (carrinhoDeCompras[i] != null) {
                soma = +carrinhoDeCompras[i].getValor();
                carrinhoDeCompras[i].setQuantidadeEmEstoque(carrinhoDeCompras[i].getQuantidadeEmEstoque() - 1);
            }
        }
        return soma;
    }
}


