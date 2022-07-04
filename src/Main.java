public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int refill = 1500;
        int bonus = refill / 100;
        int totalBalance = balance + refill + bonus;

        if (refill > 1000) {
            bonus = refill / 100;
            totalBalance = balance + refill + bonus;
        } else {
            bonus = 0;
            totalBalance = balance + refill + bonus;
        }

        System.out.println("Итоговый баланс = " + totalBalance + " Бонус = " + bonus);
    }
}




