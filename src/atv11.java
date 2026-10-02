import java.util.Scanner;

public class atv11 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int inferior;
        int superior;

        do {
            System.out.print("Limite inferior (inteiro positivo): ");
            inferior = teclado.nextInt();
        } while (inferior <= 0);

        do {
            System.out.print("Limite superior (inteiro positivo): ");
            superior = teclado.nextInt();
        } while (superior <= 0);

        if (inferior > superior) {
            int temp = inferior;
            inferior = superior;
            superior = temp;
        }

        int soma = 0;

        for (int i = inferior; i <= superior; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos pares entre " + inferior + " e " + superior + " é: " + soma);

        teclado.close();
    }
}