import java.util.Locale;
import java.util.Scanner;

public class atv5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        double somaSalarios = 0;
        double maiorSalario = 0;
        int somaFilhos = 0;
        int total = 0;
        int ate250 = 0;

        System.out.print("Salário (negativo para encerrar): ");
        double salario = teclado.nextDouble();

        while (salario >= 0) {
            System.out.print("Número de filhos: ");
            int filhos = teclado.nextInt();

            somaSalarios += salario;
            somaFilhos += filhos;
            total++;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }
            if (salario <= 250) {
                ate250++;
            }

            System.out.print("Salário (negativo para encerrar): ");
            salario = teclado.nextDouble();
        }

        if (total == 0) {
            System.out.println("Nenhum dado foi informado.");
        } else {
            System.out.printf("a) Média salarial: R$ %.2f%n", somaSalarios / total);
            System.out.printf("b) Média de filhos: %.2f%n", (double) somaFilhos / total);
            System.out.printf("c) Maior salário: R$ %.2f%n", maiorSalario);
            System.out.printf("d) Pessoas com salário até R$ 250,00: %.2f%%%n", (double) ate250 * 100 / total);
        }

        teclado.close();
    }
}