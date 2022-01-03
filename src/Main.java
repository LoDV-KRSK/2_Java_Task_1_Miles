public class Main {
    public static void main(String[] args) {

        int ticketPrice = 10_000;   // Стоимость билета (руб)
        int oneMile = 20;           // Кол-во потраченных рублей для начисления 1 мили

        // вычисления
        int bonusMiles = ticketPrice / oneMile;

        System.out.println("Вам будет начислено:");
        System.out.println((bonusMiles) + " бонусных миль");
    }
}
