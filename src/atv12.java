import java.util.Locale;
import java.util.Scanner;

public class atv12 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        double maior1 = -1;
        double maior2 = -1;
        int matricula1 = 0;
        int matricula2 = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.print("Matrícula do aluno " + i + ": ");
            int matricula = teclado.nextInt();

            System.out.print("Nota: ");
            double nota = teclado.nextDouble();

            if (nota > maior1) {
                maior2 = maior1;
                matricula2 = matricula1;
                maior1 = nota;
                matricula1 = matricula;
            } else if (nota > maior2) {
                maior2 = nota;
                matricula2 = matricula;
            }
        }

        System.out.printf("1ª maior nota: %.2f (matrícula %d)%n", maior1, matricula1);
        System.out.printf("2ª maior nota: %.2f (matrícula %d)%n", maior2, matricula2);

        teclado.close();
    }
}