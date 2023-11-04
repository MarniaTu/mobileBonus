public class Main {
    public static void main(String[] args) {
        int balance = 300;
        int deposit = 850;
        int newBalance = balance + deposit;
        int bonus;
        if (newBalance > 1000) {
            bonus = newBalance / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Ваш итоговый баланс: " + (newBalance + bonus) + " рубль(ля/лей)");
        System.out.println("Вам начислено: " + bonus + " бонусный(ных) рубль(ля/лей)");
    }

}