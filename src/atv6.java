import java.util.Locale;
import java.util.Scanner;

public class atv6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        double soma = 0;
        int total = 0;
        int positivos = 0;
        int negativos = 0;

        System.out.print("Digite um valor (0 para encerrar): ");
        double valor = teclado.nextDouble();

        while (valor != 0) {
            soma += valor;
            total++;

            if (valor > 0) {
                positivos++;
            } else {
                negativos++;
            }

            System.out.print("Digite um valor (0 para encerrar): ");
            valor = teclado.nextDouble();
        }

        if (total == 0) {
            System.out.println("Nenhum valor foi informado.");
        } else {
            System.out.printf("Média aritmética: %.2f%n", soma / total);
            System.out.println("Quantidade de positivos: " + positivos);
            System.out.println("Quantidade de negativos: " + negativos);
            System.out.printf("Percentual de positivos: %.2f%%%n", (double) positivos * 100 / total);
            System.out.printf("Percentual de negativos: %.2f%%%n", (double) negativos * 100 / total);
        }

        teclado.close();
    }
}