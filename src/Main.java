public class Main {
    public static void main(String[] args) {
        System.out.println("расчет бонусов за пополнение счета связи");
        int clientAccount = 100; //счет клиента

        int refill = 2_000; //пополнение счета
        int bonus = 0; //дарит ему по 1 рублю за каждые полные 100 рублей пополнения
        if (refill > bonus) {
            bonus = refill / 100;
            System.out.println((clientAccount + refill) + " пополнение счета " + (bonus) + " + Бонус за пополнение счета "
                    + " баланс = " + ((clientAccount + refill) + (bonus)));

        } else {
            System.out.println(clientAccount + refill + " пополнение счета ");
        }

    }
}