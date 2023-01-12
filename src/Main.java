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
}