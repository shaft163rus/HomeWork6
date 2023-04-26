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
       task9();
       task10();
    }


    public static void task1() {
        System.out.println("Task1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("Task2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("Task3");
        for (int i = 0; i <= 17; i+=2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("Task4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        System.out.println("Task5");
        for (int i = 1904; i <= 2096; i+=4) {
            System.out.println(i + " - високосный год");
        }
    }


    public static void task6() {
        System.out.println("Task6");
        for (int i = 7; i <= 98; i+=7) {
            System.out.println(i);
        }
    }

    public static void task7() {
        System.out.println("Task7");
        for (int i = 2; i <= 512; i *= 2) {
            System.out.println(i);
        }
    }

    public static void task8() {
        System.out.println("Task8");
        int savingsPerMonth = 29000;
        int savings = 0;
        for (int i = 1; i <= 12; i++ ) {
            savings += savingsPerMonth;
            System.out.println("Месяц " + i + " сумма накоплений равна " + savings + " руб.");
        }
    }


    public static void task9() {
        System.out.println("Task9");
        int savingsPerMonth = 29000;
        int savings = 0;

        for (int i = 1; i <= 12; i++ ) {
            savings += savingsPerMonth;
            System.out.println("Месяц " + i + " сумма накоплений равна " +(double) savings * 1.01 + " руб.");
        }
    }




    public static void task10() {
        System.out.println("Task10");

        for (int i = 1; i <= 10; i++) {
            System.out.println(2 + "*" + i + "=" + 2 * i);
        }
    }

}