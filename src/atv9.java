import java.util.Locale;
import java.util.Scanner;

public class atv9 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        System.out.print("Quantos alunos tem a turma? ");
        int n = teclado.nextInt();

        double maior = 0;
        double menor = 15;

        for (int i = 1; i <= n; i++) {
            double nota;

            do {
                System.out.print("Nota do aluno " + i + " (0 a 15): ");
                nota = teclado.nextDouble();

                if (nota < 0 || nota > 15) {
                    System.out.println("Nota inválida! Digite entre 0 e 15.");
                }
            } while (nota < 0 || nota > 15);

            if (nota > maior) {
                maior = nota;
            }
            if (nota < menor) {
                menor = nota;
            }
        }

        if (n > 0) {
            System.out.printf("Maior nota: %.2f%n", maior);
            System.out.printf("Menor nota: %.2f%n", menor);
        }

        teclado.close();
    }
}