public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задание 1");

        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + salary;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println(" Задание 2 ");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (i = 10; i > 0; i--) {

            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    public static void task3() {
        System.out.println(" Задание 3 ");
        int countryY = 12_000_000;
        float fertility = 0.017f;
        float mortality = 0.008f;
        float growth = 0;
        int year = 0;
        while (year < 10) {
            growth = fertility - mortality;
            countryY += countryY * growth;

            year++;
            System.out.println("Год " + year + ", численность населения составляет " + countryY);
        }
    }

    public static void task4() {
        System.out.println(" Задание 4");
        int i = 1;
        int initialDepositAmount = 15000;
        int total = 0;
        while (total <= 12_000_000) {
            total = total + total / 100 * 7;
            total = total + initialDepositAmount;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
            i++;
        }
    }

    public static void task5() {
        System.out.println(" Задание 5 ");
        int i = 1;
        int initialDepositAmount = 15000;
        int total = 0;
        while (total < 12_000_000) {
            total = total + total / 100 * 7;
            total = total + initialDepositAmount;
            if (i % 6 == 0)
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
            i++;
        }
    }

    public static void task6() {
        System.out.println(" Задание 6 ");
        int month = 1;
        int i = 0;
        int initialDepositAmount = 15000;
        int total = 0;
        while (month <= 108) {
            total = total + total / 100 * 7;
            total = total + initialDepositAmount;
            if (i % 6 == 0)
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей.");
            month++;
            i++;


        }
    }

    public static void task7() {
        System.out.println(" Задание 7 ");
        int friday = 1;
        while (friday <= 31) {

            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7;
        }
    }

    public static void task8() {
        System.out.println(" Задание 8 ");
        int yearNow = 2022;
        int yearsEarlier = yearNow - 200;
        int yearNext = yearNow + 100;
        int comet = 0;
        for (comet = yearsEarlier; comet < yearNext; comet++){
            if (comet % 79 == 0){
                System.out.println(comet);
            }
        }

    }
}
