import java.util.Scanner;

public class aatv3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contador = 0;
        int numRecente = 0, mesesRecente = Integer.MAX_VALUE;
        int numAntigo = 0, mesesAntigo = Integer.MIN_VALUE;

        while (contador < 300) {
            System.out.print("Número do empregado: ");
            int numero = teclado.nextInt();
            System.out.print("Meses de trabalho: ");
            int meses = teclado.nextInt();

            if (numero == 0 && meses == 0) {
                break;
            }

            if (meses < mesesRecente) {
                mesesRecente = meses;
                numRecente = numero;
            }
            if (meses > mesesAntigo) {
                mesesAntigo = meses;
                numAntigo = numero;
            }
            contador++;
        }

        if (contador == 0) {
            System.out.println("Nenhum empregado foi informado.");
        } else {
            System.out.println("Mais recente: empregado " + numRecente + " (" + mesesRecente + " meses)");
            System.out.println("Mais antigo: empregado " + numAntigo + " (" + mesesAntigo + " meses)");
        }

        teclado.close();
    }
}