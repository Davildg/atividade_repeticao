import java.util.Scanner;

public class atv1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int continuar;

        do {
            System.out.print("Digite o primeiro número inteiro: ");
            int n1 = teclado.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            int n2 = teclado.nextInt();

            System.out.println("Escolha a operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão (quociente inteiro)");
            System.out.print("Opção: ");
            int operacao = teclado.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Resultado: " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (n1 * n2));
                    break;
                case 4:
                    if (n2 == 0) {
                        System.out.println("Não é possível dividir por zero!");
                    } else {
                        System.out.println("Resultado: " + (n1 / n2));
                    }
                    break;
                default:
                    System.out.println("Operação inválida!");
            }

            System.out.print("Digite 1 para novos valores ou 0 para encerrar: ");
            continuar = teclado.nextInt();

        } while (continuar == 1);

        System.out.println("Programa encerrado. Até logo!");
        teclado.close();
    }
}