public class Celular {
    private String marca;
    private String modelo;
    private double preco;
    private int armazenamento;

    public Celular(String marca, String modelo, double preco, int armazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.armazenamento = armazenamento;
    }

    public void exibirResumo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Armazenamento: " + armazenamento + " GB");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        if (armazenamento > 0) {
            this.armazenamento = armazenamento;
        }
    }
}