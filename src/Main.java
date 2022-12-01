public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.6;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3/5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var capacityLeft = boxerWeight1 + boxerWeight2;
        System.out.println(" общий вес боксеров " + capacityLeft + " кг ");
        capacityLeft = boxerWeight1 - boxerWeight2;
        System.out.println(" разница " + capacityLeft + " кг ");
        var overload = (boxerWeight2 - boxerWeight1) % capacityLeft;
        System.out.println(overload);
        var employeeHours = 8;
        var hours = 640;
        hours = hours / 8;
        System.out.println(" Всего работников в компании " + hours + " человек ");
        var man = 80;
        man = man + 94;
        System.out.println(" Всего человек работает " + man);
        var totalPerson = 174;
        totalPerson = totalPerson * 8;
        System.out.println("Если в компании работает 174 человека, то всего" + totalPerson + " часов работы может быть поделено между сотрудниками");













    }
}