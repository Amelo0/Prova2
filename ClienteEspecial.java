package P3.PROVA2;

public class ClienteEspecial extends Cliente{
    private int pontos;
    private double saldoDeCompras;

    public ClienteEspecial(){

    }

    public ClienteEspecial(String nome, int idade, String cpf, String endereço, boolean bomCliente, Item[] carrinhoDeCompras, int pontos, double saldoDeCompras) {
        super(nome, idade, cpf, endereço, bomCliente, carrinhoDeCompras);
        this.pontos = pontos;
        this.saldoDeCompras = saldoDeCompras;
    }

    @Override
    public double finalizarCompra() {
        double totalCompra = super.finalizarCompra();
        double desconto = totalCompra * 0.05;
        if (saldoDeCompras > 100) {
            pontos += 5;
            saldoDeCompras -= 100;
        }
        if (pontos > 0) {
            int pontosNecessarios = (int) (totalCompra / 2 );
            if (pontos >= pontosNecessarios) {
                pontos -= pontosNecessarios;
                return 0; //
            }
        }
        saldoDeCompras += desconto;
        return totalCompra - desconto;
    }
}
