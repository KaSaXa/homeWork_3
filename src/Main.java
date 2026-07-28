public class Main {
    public static void main(String[] args) {
//task 1
         int i = 1;
         byte b = 2;
         short s = 3;
         long l = 4;
         float f = 5f;
         double d = 6d;
            System.out.println("Значение переменной " + i + " с типом " + " int " + " равно " + i);
            System.out.println("Значение переменной " + i + " с типом " + " byte " + " равно " + b);
            System.out.println("Значение переменной " + i + " с типом " + " short " + " равно " + s);
            System.out.println("Значение переменной " + i + " с типом " + " long " + " равно " + l);
            System.out.println("Значение переменной " + i + " с типом " + " float " + " равно " + f);
            System.out.println("Значение переменной " + i + " с типом " + " double " + " равно " + d);

//task 2
         double an = 27.12;
         long ales = 987678965;
         double rus = 2.786;
         int main = 569;
         int ileas = -159;
         int brus = 27897;
         byte old = 67;
//task 3
        short ludm = 23;
        short anna = 27;
        short kate = 30;
        int allList = 480;
            int allStud = ludm + anna + kate;
            int oneStudList = allList / allStud;
                System.out.println(" На каждого ученика рассчитано " + oneStudList + " листов бумаги");
//task 4
        short min2 = 16;
        int min20 = min2 * 10;
            System.out.println("За 20 минут машина произвела " + min20 + " штук бутылок. ");
        int days1 = min20 * 70;
            System.out.println("За 1 день машина произвела " + days1 + " штук бутылок. ");
        int days3 = days1 * 3;
            System.out.println("За 3 дня машина произвела " + days3 + " штук бутылок. ");
        int days30 = days3 * 10;
            System.out.println("За месяц машина произвела " + days30 + " штук бутылок. ");
//task 5
        byte ttlBanks = 120;
        short banksPerClass = 6;
        int classes = ttlBanks / banksPerClass;
        int whitebank = classes * 2;
        int brownbank = classes * 4;
            System.out.println("В школе, где " + classes + " классов, нужно " + whitebank + " банок белой краски и " + brownbank + " банок коричневой краски.");
//task 6
        int banana = 5 * 80;
        int milk = 105 * 2;
        int iceCream = 2 * 100;
        int egg = 4 * 70;
            int allWeightGr = banana + milk + iceCream + egg;
            float allWeightKg = allWeightGr / 1000;
                System.out.println("Всего в рецепте " + allWeightGr + " граммов сырья или " + allWeightKg + " килограмм.");
//task 7
        int weightToLose = 7000;
        int daysAt250 = weightToLose / 250;
        int daysAt500 = weightToLose / 500;
        int averageDays = (daysAt250 + daysAt500) / 2;
            System.out.println("Если терять по 250 грамм в день, потребуется " + daysAt250 + " дней.");
            System.out.println("Если терять по 500 грамм в день, потребуется " + daysAt500 + " дней.");
            System.out.println("В среднем потребуется " + averageDays + " дней.");
//task 8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;

            double increasePercent = 10.0;
            double increaseFact = 1 + increasePercent / 100;

        double mashaNewSal = masha * increaseFact;
        double denisNewSal = denis * increaseFact;
        double kristinaNewSal = kristina * increaseFact;

            double mashaAnnualCur = masha * 12;
            double mashaAnnualNew = mashaNewSal * 12;
            double mashaAnnualDif = mashaAnnualNew - mashaAnnualCur;

        double denisAnnualCur = denis * 12;
        double denisAnnualNew = denisNewSal * 12;
        double denisAnnualDif = denisAnnualNew - denisAnnualCur;

        double kristinaAnnualCur = kristina * 12;
        double kristinaAnnualNew = kristinaNewSal * 12;
        double kristinaAnnualDif = kristinaAnnualNew - kristinaAnnualCur;

            System.out.println("Маша теперь получает " + mashaNewSal + " рублей. Годовой доход вырос на " + mashaAnnualDif + " рублей.");
            System.out.println("Денис теперь получает " + denisNewSal + " рублей. Годовой доход вырос на " + denisAnnualDif + " рублей.");
            System.out.println("Кристина теперь получает " + kristinaNewSal + " рублей. Годовой доход вырос на " + kristinaAnnualDif + " рублей.");
    }
}

