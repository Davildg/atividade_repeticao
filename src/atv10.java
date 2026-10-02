public class atv10 {

    public static void main(String[] args) {

        final double CM_POR_POLEGADA = 2.54;

        System.out.println("Polegadas | Centímetros");
        System.out.println("----------|------------");

        for (int pol = 1; pol <= 20; pol++) {
            double cm = pol * CM_POR_POLEGADA;
            System.out.printf("%9d | %11.2f%n", pol, cm);
        }
    }
}