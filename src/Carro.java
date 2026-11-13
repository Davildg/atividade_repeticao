public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidade;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public void acelerar(double valor) {
        if (valor > 0) {
            velocidade += valor;
        }
    }

    public void frear(double valor) {
        if (valor > 0) {
            velocidade -= valor;

            if (velocidade < 0) {
                velocidade = 0;
            }
        }
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidade() {
        return velocidade;
    }
}