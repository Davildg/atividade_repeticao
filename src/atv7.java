import java.util.Scanner;

public class atv7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        final int TOTAL = 75;
        int soma = 0;
        int quantidade = 0;

        for (int i = 1; i <= TOTAL; i++) {
            int numero;

            do {
                System.out.print("Digite o número " + i + " (inteiro positivo): ");
                numero = teclado.nextInt();

                if (numero <= 0) {
                    System.out.println("Valor inválido! Digite um número positivo.");
                }
            } while (numero <= 0);

            soma += numero;
            quantidade++;
        }

        double media = (double) soma / quantidade;

        System.out.printf("Média: %.2f%n", media);
        System.out.println("Quantidade de números lidos: " + quantidade);

        teclado.close();
    }
}