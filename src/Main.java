public class Main {
    public static void main(String[] args) {
        System.out.println("расчет бонусов за пополнение счета связи");
        int check = 100; //счет клиента
        int x = 1000;
        int a = 3200; //пополнение счета
        int y = 100; //дарит ему по 1 рублю за каждые полные 100 рублей пополнения
        if (a > x) {
            System.out.println((check + a + (a / y)) + " пополнение счета " + "+" + " Бонус за пополнение счета ");

        } else {
            System.out.println(check + a + " пополнение счета ");
        }

    }
}