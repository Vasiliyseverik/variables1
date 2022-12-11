public class Main {
    public static void main(String[] args) {
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        byte people = (byte) (lp + as + ea);
        System.out.println(people);
        short sheets = 480;
        long people1 = sheets / 80;
        System.out.println("на каждого ученика рассчитано" + people1 +  "листов бумаги");

        byte in2Min = 16;
        int in1Min = in2Min / 2;
        System.out.println(" за одну минуту машина произвела " + in1Min + " штук бутылок ");
        int in20Min = 20 * 8;
        System.out.println(" за двадцать минут машина произвела " + in20Min + " штук бутылок ");
        int in1day = 1440 * 8;
        System.out.println("за один день машина произвела " + in1day + " штук бутылок ");
        int in3day = 4320 * 8;
        System.out.println(" за три дня машина произвела " + in3day + " штук бутылок ");
        int in1month = 43200 * 8;
        System.out.println("за один месяц машина произвела " + in1month +" штук бутылок " );
        byte allCans = 120;
        byte classWhite = 2;
        byte classBrown = 4;
        int oneClass = classWhite + classBrown;
        System.out.println("всего банок на один класс " + oneClass + " штук ");
        int allClass = allCans / oneClass;
        System.out.println("всего классов " + allClass + " штук ");
        int whiteCans = classWhite * allClass;
        System.out.println("всего белой краски " + whiteCans + " штук ");
        int brownCans = classBrown * allClass;
        System.out.println("всего коричневой краски " + brownCans + " штук ");
        System.out.println("В школе, где " + allClass + " классов, нужно " + whiteCans + " банок белой краски и " + brownCans + " банок коричневой краски.");

        int bananas = 5 * 80;
        System.out.println(bananas);
        short milk = 2 * 105;
        System.out.println(milk);
        int icecream = 2 * 100;
        System.out.println(icecream);
        int eggs = 4 * 70;
        System.out.println(eggs);
        int allG = bananas + milk + icecream + eggs;
        System.out.println(allG);
        float gramm = 1090;
        float allKg = gramm / 1000;
        System.out.println(allKg);

        int Kg = 7;
        int Gr = Kg * 1000;
        System.out.println(Gr);
        int dayGr = Gr / 250;
        System.out.println(dayGr);
        int dayGrTwo = Gr / 500;
        System.out.println(dayGrTwo);
        int middle = ( dayGr + dayGrTwo  ) / 2;
        System.out.println(middle);

        double procent = 10;
        double marry = 67760 / 100 * 10;
        System.out.println(marry);
        double allMarry = marry + 67760;
        System.out.println(allMarry);
        double denis =  83690 / 100 * 10;
        System.out.println(denis);
        double allDenis = denis + 83690;
        System.out.println(allDenis);
        double kris = 76230 / 100 * 10;
        System.out.println(kris);
        double allKris = kris + 76230;
        System.out.println(allKris);
        double yearMarry = 67760 * 12;
        System.out.println(yearMarry);
        double yearDenis = 83690 * 12;
        System.out.println(yearDenis);
        double yearKris = 76230 * 12;
        System.out.println(yearKris);
        double diffMarry = yearMarry - 67760;
        System.out.println(diffMarry);
        double diffDenis = yearDenis - 83690;
        System.out.println(diffDenis);
        double diffkris = yearKris - 76230;
        System.out.println(yearKris);
        double finishMarry = yearMarry - allMarry;
        System.out.println(finishMarry);
        double finishDenis = yearDenis - allDenis;
        System.out.println(finishDenis);
        double finishKris = yearKris - allKris;
        System.out.println(finishKris);
        System.out.println(" Маша теперь получает " + allMarry + " рублей. Годовой доход вырос на " + finishMarry + "рублей.");
        System.out.println(" Денис теперь получает " + allDenis + " рублей. Годовой доход вырос на " + finishDenis + "рублей.");
        System.out.println(" Кристина теперь получает " + allKris + " рублей. Годовой доход вырос на " + finishKris + "рублей.");



















    }

}