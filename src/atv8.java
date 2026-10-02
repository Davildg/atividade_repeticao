import java.util.Locale;
import java.util.Scanner;

public class atv8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        double maiorAltura = 0;
        double menorAltura = Double.MAX_VALUE;
        String nomeMaior = "";
        String nomeMenor = "";

        double somaHomens = 0;
        double somaMulheres = 0;
        double somaTurma = 0;
        int qtdHomens = 0;
        int qtdMulheres = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Nome do amigo " + i + ": ");
            String nome = teclado.next();

            System.out.print("Altura (ex: 1.70): ");
            double altura = teclado.nextDouble();

            System.out.print("Sexo (1 = masculino, 2 = feminino): ");
            int sexo = teclado.nextInt();

            if (altura > maiorAltura) {
                maiorAltura = altura;
                nomeMaior = nome;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
                nomeMenor = nome;
            }

            if (sexo == 1) {
                somaHomens += altura;
                qtdHomens++;
            } else if (sexo == 2) {
                somaMulheres += altura;
                qtdMulheres++;
            }
            somaTurma += altura;
        }

        System.out.printf("Maior altura: %.2f m (%s)%n", maiorAltura, nomeMaior);
        System.out.printf("Menor altura: %.2f m (%s)%n", menorAltura, nomeMenor);

        if (qtdMulheres > 0) {
            System.out.printf("Média das mulheres: %.2f m%n", somaMulheres / qtdMulheres);
        } else {
            System.out.println("Não há mulheres na turma.");
        }
        if (qtdHomens > 0) {
            System.out.printf("Média dos homens: %.2f m%n", somaHomens / qtdHomens);
        } else {
            System.out.println("Não há homens na turma.");
        }
        System.out.printf("Média da turma: %.2f m%n", somaTurma / 15);

        teclado.close();
    }
}