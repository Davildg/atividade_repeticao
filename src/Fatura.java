public class Fatura {
    private int numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public Fatura(int numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade > 0 ? quantidade : 0;
        this.preco = preco > 0 ? preco : 0.0;
    }

    public double calcular_valor_fatura() {
        return quantidade * preco;
    }
}