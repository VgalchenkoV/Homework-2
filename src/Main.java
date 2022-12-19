public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задачи 1-3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


    }

    public static void task2 () {
        System.out.println("Задачи 4 - 5");
        // Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        // Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task3 () {
        System.out.println("Задачи 6 - 7");
        //Задача 6
        var weiFirBox = 78.2;
        var weiSecBox = 82.7;
        var totalWeight = weiFirBox + weiSecBox;
        System.out.println("Общий вес двух бойцов: " + totalWeight);
        var weightDifference = weiSecBox - weiFirBox;
        System.out.println("Разница в весе бойцов: " + weightDifference);
        /*Задача 7
        Согласно задаче, необходимо:
        Вычитание из большего веса меньшего.
        Ранее я проделал данную операцию.  var weightDifference = weiSecBox - weiFirBox; */
        var remainder = (weiSecBox + weiFirBox) % weightDifference;
        System.out.println("Остаток от делания " + remainder);


    }
    public static void task4 () {
        System.out.println("Задача 8");
        var time = 640;
        var workingHours = 8;
        var totalEmployees = time / workingHours;
        System.out.println("Всего работников в компании — " + totalEmployees + " человек");
        var numberOfEmployees = workingHours + 94;
        var canBeShared = time / numberOfEmployees;
        System.out.println("Если в компании работает " + numberOfEmployees + " человека, то всего "+ canBeShared + " часов работы может быть поделено между сотрудниками");

    }
}