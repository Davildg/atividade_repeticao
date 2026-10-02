import java.util.Locale;
import java.util.Scanner;

public class atv4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        double menorAltura = Double.MAX_VALUE;
        double maiorAltura = 0;
        char sexoMaisAlta = ' ';
        double somaMulheres = 0;
        int qtdMulheres = 0;
        int qtdHomens = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Altura da pessoa " + i + " (ex: 1.75): ");
            double altura = teclado.nextDouble();

            System.out.print("Sexo (M ou F): ");
            char sexo = Character.toUpperCase(teclado.next().charAt(0));

            if (altura < menorAltura) {
                menorAltura = altura;
            }
            if (altura > maiorAltura) {
                maiorAltura = altura;
                sexoMaisAlta = sexo;
            }
            if (sexo == 'F') {
                somaMulheres += altura;
                qtdMulheres++;
            } else if (sexo == 'M') {
                qtdHomens++;
            }
        }

        System.out.printf("a) Menor altura: %.2f m%n", menorAltura);
        if (qtdMulheres > 0) {
            System.out.printf("b) Média das mulheres: %.2f m%n", somaMulheres / qtdMulheres);
        } else {
            System.out.println("b) Não há mulheres no grupo.");
        }
        System.out.println("c) Número de homens: " + qtdHomens);
        System.out.println("d) Sexo da pessoa mais alta: " + sexoMaisAlta);

        teclado.close();
    }
}