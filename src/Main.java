public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Задача 1");

        for (int arrow = 1; arrow <= 10; arrow++) {
            System.out.println("Стрела " + arrow);
        }

        // task 2
        System.out.println("Задача 2");

        for (int second = 10; second > 0; second--) {
            System.out.println("Секунд осталось " + second);
        }

        // task 3
        System.out.println("Задача 3");

        for (int table = 0; table < 17; table = table + 2) {
            System.out.println("Таблица четных чисел " + table);
        }

        // task 4
        System.out.println("Задача 4");

        for (int temperature = 10; temperature >= -10; temperature--) {
            System.out.println("Температура " + temperature);
        }

        // task 5
        System.out.println("Задача 5");

        for (int leapYear = 1904; leapYear < 2096; leapYear = leapYear + 4) {
            System.out.println(leapYear + " год является високосным");
        }

        // task 6
        System.out.println("Задача 6");

        for (int seven = 7; seven <= 98; seven = seven + 7) {
            System.out.println(seven);
        }

        // task 7
        System.out.println("Задача 7");

        for (int memory = 1; memory <= 512; memory = memory * 2) {
            System.out.println("Память диска " + memory);
        }

        // task 8
        System.out.println("Задача 8");

        int money = 29000;
        int savings = 0;
        for (int total = 1; total <= 12; total++) {
            savings = savings + money;
            System.out.println("Месяц " + total + ", сумма накоплений равна " + savings + " рублей");
        }

        // task 9
        System.out.println("Задача 9");

        int monthlyIncrease = 0;
        for (int month = 1; month <= 12; month++) {
            monthlyIncrease = monthlyIncrease + money/100;
            monthlyIncrease = monthlyIncrease + money;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + monthlyIncrease + " рублей");
        }

        // task 10
        System.out.println("Задача 10");

        int two = 2;
        for (int byTwo = 1; byTwo <= 10; byTwo++) {
            System.out.println(two + " * " + byTwo + " = " + byTwo * two);

        }
    }
}