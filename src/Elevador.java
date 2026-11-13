public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoas;

    public Elevador(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.pessoas = 0;
    }

    public void entrar() {
        if (pessoas < capacidade) {
            pessoas++;
        }
    }

    public void sair() {
        if (pessoas > 0) {
            pessoas--;
        }
    }

    public void subir() {
        if (andarAtual < totalAndares) {
            andarAtual++;
        }
    }

    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        if (andarAtual >= 0 && andarAtual <= totalAndares) {
            this.andarAtual = andarAtual;
        }
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        if (totalAndares >= 0 && andarAtual <= totalAndares) {
            this.totalAndares = totalAndares;
        }
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        if (capacidade >= pessoas) {
            this.capacidade = capacidade;
        }
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        if (pessoas >= 0 && pessoas <= capacidade) {
            this.pessoas = pessoas;
        }
    }
}