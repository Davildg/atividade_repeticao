import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU DE ATIVIDADES =====");
            System.out.println("1 - Fatura");
            System.out.println("2 - Elevador");
            System.out.println("3 - Pessoa");
            System.out.println("4 - Produto");
            System.out.println("5 - Conta Bancaria");
            System.out.println("6 - Carro");
            System.out.println("7 - Livro");
            System.out.println("8 - Funcionario");
            System.out.println("9 - Retangulo");
            System.out.println("10 - Aluno");
            System.out.println("11 - Filme");
            System.out.println("12 - Celular");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma atividade: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    Fatura fatura = new Fatura(1, "Teclado", 2, 100);
                    System.out.println("Valor da fatura: R$ " +
                            fatura.calcular_valor_fatura());
                    break;

                case 2:
                    Elevador elevador = new Elevador(5, 10);
                    elevador.entrar();
                    elevador.subir();
                    System.out.println("Andar atual: " + elevador.getAndarAtual());
                    System.out.println("Pessoas no elevador: " + elevador.getPessoas());
                    break;

                case 3:
                    Pessoa pessoa = new Pessoa("Davi", 20, "12345678900");
                    System.out.println("Nome: " + pessoa.getNome());
                    System.out.println("Idade: " + pessoa.getIdade());
                    System.out.println("CPF: " + pessoa.getCpf());
                    break;

                case 4:
                    Produto produto = new Produto("Mouse", 50, 10);
                    System.out.println("Valor total em estoque: R$ " +
                            produto.calcularTotal());
                    break;

                case 5:
                    ContaBancaria conta = new ContaBancaria(123, "Davi");
                    conta.depositar(500);
                    conta.sacar(100);
                    System.out.println("Saldo: R$ " + conta.getSaldo());
                    break;

                case 6:
                    Carro carro = new Carro("Fiat", "Uno", 2010);
                    carro.acelerar(60);
                    carro.frear(20);
                    System.out.println("Velocidade atual: " +
                            carro.getVelocidade() + " km/h");
                    break;

                case 7:
                    Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899);
                    livro.emprestar();
                    System.out.println("Livro: " + livro.getTitulo());
                    System.out.println("Disponível: " + livro.isDisponivel());
                    break;

                case 8:
                    Funcionario funcionario = new Funcionario("João", 3000, "Analista");
                    System.out.println("Funcionário: " + funcionario.getNome());
                    System.out.println("Salário líquido: R$ " +
                            funcionario.calcularSalarioLiquido());
                    break;

                case 9:
                    Retangulo retangulo = new Retangulo(5, 10);
                    System.out.println("Área: " + retangulo.calcularArea());
                    System.out.println("Perímetro: " + retangulo.calcularPerimetro());
                    break;

                case 10:
                    Aluno aluno = new Aluno(123, "Maria", 8.5);
                    System.out.println("Aluno: " + aluno.getNome());
                    System.out.println("Aprovado: " + aluno.verificarAprovacao());
                    break;

                case 11:
                    Filme filme = new Filme("Interestelar", "Christopher Nolan", 2014, 169);
                    filme.exibirInformacoes();
                    break;

                case 12:
                    Celular celular = new Celular("Samsung", "Galaxy S25", 4000, 256);
                    celular.exibirResumo();
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}