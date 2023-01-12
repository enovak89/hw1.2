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
    }

        public static void task1 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача 1");
        System.out.println(dog + " " + cat + " " + paper);
        }

        public static void task2 () {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача 2");
        cat = cat + 4;
        dog = dog + 4;
        paper = paper + 4;
        System.out.println(dog + " " + cat + " " + paper);
        }

        public static void task3 () {
        var dog = 12.0;
        var cat = 7.6;
        var paper = 763793;
        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog + " " + cat + " " + paper);
        }

        public static void task4 () {
        var friend = 19;
        System.out.println("Задача 4" + "\n" + friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 3;
        System.out.println(friend);
        }

        public static void task5 () {
        var frog = 3.5;
        System.out.println("Задача 5" + "\n" + frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        }

        public static void task6 () {
        var weightFighter1 = 78.2;
        var weightFighter2 = 82.7;
        var weightSummary = weightFighter2 + weightFighter2;
        var weightSub = weightFighter2 - weightFighter1;
        System.out.println("Задача 6" + "\n" + weightSummary + "\n" + weightSub);
        }

        public static void task7 () {
        var weightFighter1 = 78.2;
        var weightFighter2 = 82.7;
        var weightSubstraction = weightFighter2 - weightFighter1;
        var weightSub = weightFighter2 % weightFighter1;
        System.out.println("Задача 7" + "\n" + weightSub + "\n" + weightSubstraction);
        }

        public static void task8 () {
        var emplNum = 640 / 8;
        var emplNum2 = emplNum + 94;
        var hoursNum = emplNum2 * 8;
        System.out.println("Задача 8" + "\n" + "Всего работников в компании - " + emplNum + " человек");
        System.out.println("Если в компании работает " + emplNum2 + " человек, то всего " + hoursNum + " часов работы может быть поделено между сотрудниками");
        }

        public static void task9 () {
        System.out.println("\n" + "Задачи повышенной сложности" + "\n" + "Выходит " + 47 / 13 + " и " + 47 % 13 + " в остатке");
        var a = 44;
        var b = a / 10 + a % 10;
        System.out.println(b);
        var y = 345;
        var x = y - (y / 100) * 100;
        var z = y / 100 + x / 10 + y % 10;
        System.out.println(z);
        var c = 4899 + 157 - (4899 + 157) * 10 / 100;
        System.out.println(c + " " + (4899 + 157) / 10d);

        int orangePrice = 73;
        int orangeDiscount = 15;
        int bananaPrice = 95;
        var sum = bananaPrice + orangePrice - ((orangePrice * orangeDiscount) / 100f);
        System.out.println(sum);

        var dDiscount = 2870 - 2870 * 50 / 100d;
        int bread = 27;
        var summary = dDiscount * 7 + bread;
        System.out.println(summary + " " + dDiscount);

        double shamp = 436 * 2.5;
        double mush = 578 * 0.95 * 3.75;
        System.out.println(shamp + mush);

        double h = 0.4;
        double g = 0.87;
        double num1 = 11 * h + g;
        double num2 = (h + 10 * g) - 15 * (h / g);
        System.out.println(num1 + " " + num2);
        }
}