public class Main {
    public static void main(String[] args) {
        System.out.println("расчет бонусов за пополнение счета связи");
        int check = 100; //счет клиента
        int x = 1000;
        int refill = 3800; //пополнение счета
        int bonus = 100; //дарит ему по 1 рублю за каждые полные 100 рублей пополнения
        if (refill > x) {
            System.out.println((check + refill) + " пополнение счета "  + ( refill/bonus ) + " + Бонус за пополнение счета "
                    + " баланс = " + ((check + refill) + ( refill/bonus ) ));

        } else {
            System.out.println(check + refill + " пополнение счета ");
        }

    }
}