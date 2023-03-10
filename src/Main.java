public class Main {
    public static void main(String[] args) {
        int amoutOnTheAccount = 100;
        int replenishment = 1100;
        int bonus = 0;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int totalAmount = amoutOnTheAccount + replenishment + bonus;
        System.out.println("Итого сумма на счету клиента: " + totalAmount);
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}


