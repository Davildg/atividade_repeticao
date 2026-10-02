import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("MENU DE ATIVIDADES");
            System.out.println("1 - Atividade 1");
            System.out.println("2 - Atividade 2");
            System.out.println("3 - Atividade 3");
            System.out.println("4 - Atividade 4");
            System.out.println("5 - Atividade 5");
            System.out.println("6 - Atividade 6");
            System.out.println("7 - Atividade 7");
            System.out.println("8 - Atividade 8");
            System.out.println("9 - Atividade 9");
            System.out.println("10 - Atividade 10");
            System.out.println("11 - Atividade 11");
            System.out.println("12 - Atividade 12");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> atv1.main(args);
                case 2 -> atv2.main(args);
                case 3 -> aatv3.main(args);
                case 4 -> atv4.main(args);
                case 5 -> atv5.main(args);
                case 6 -> atv6.main(args);
                case 7 -> atv7.main(args);
                case 8 -> atv8.main(args);
                case 9 -> atv9.main(args);
                case 10 -> atv10.main(args);
                case 11 -> atv11.main(args);
                case 12 -> atv12.main(args);
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}