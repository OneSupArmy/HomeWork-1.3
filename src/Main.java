public class Main {
    //Опять забыл что мы делаем все в бранчах, постоянно вместо пулл реквеста просто пушу мастер ветку
    public static void main(String[] args) {
        //Задача 1
        int thisIsInt = 888;
        byte thisIsByte = 8;
        short thisIsShort = 8888;
        long thisIsLong = 8_888_888L;
        float thisIsFloat = 8.888F;
        double thisIsDouble = 8.88888888;
        System.out.println("Значение переменной thisIsInt с типом int равно " + thisIsInt);
        System.out.println("Значение переменной thisIsByte с типом byte равно " + thisIsByte);
        System.out.println("Значение переменной thisIsShort с типом short равно " + thisIsShort);
        System.out.println("Значение переменной thisIsLong с типом long равно " + thisIsLong);
        System.out.println("Значение переменной thisIsFloat с типом float равно " + thisIsFloat);
        System.out.println("Значение переменной thisIsDouble с типом double равно " + thisIsDouble);
        System.out.println("");
        //Задача 2
        float firstFloat = 27.12f;
        long firstLong = 987_678_965_549L;
        double firstByte = 2.786;
        boolean firstBoolean = false;
        char firstChar = 569;
        short secondShort = -159;
        int firstInt = 27897;
        byte secondByte = 67;
        //Задача 3
        byte amountInLPClass = 23;
        byte amountInASClass = 27;
        byte amountInEAClass = 30;
        short amountOfLists = 480;
        int amountOfListsForOneStudents = amountOfLists/(amountInASClass + amountInEAClass + amountInLPClass);
        System.out.println("На каждого ученика рассчитано " + amountOfListsForOneStudents + " листов бумаги");
        System.out.println("");
        //Задача 4
        byte bottlesForOneMinute = 16/2;
        short bottlesForTwentyMinutes = (short)(bottlesForOneMinute * 20);
        short minutesInOneDay = 24 * 60;
        short bottlesForOneDay = (short)(bottlesForOneMinute * minutesInOneDay);
        int bottlesForThreeDays = bottlesForOneMinute * minutesInOneDay * 3;
        int avgMinutesInMonth = 30 * minutesInOneDay;
        int bottlesForOneMonth = bottlesForOneMinute * avgMinutesInMonth;
        System.out.println("За 20 минут машина произвела бутылок " + bottlesForTwentyMinutes + " штук");
        System.out.println("За один день машина произвела бутылок " + bottlesForOneDay + " штук");
        System.out.println("За три дня машина произвела бутылок " + bottlesForThreeDays + " штук");
        System.out.println("За один месяц машина произвела бутылок " + bottlesForOneMonth + " штук");
        System.out.println("");
        //Задача 5
        byte amountOfPaintCans = 120;
        byte whiteColorForOneClass = 2;
        byte brownColorForOneClass = 4;
        byte paintCansForOneClass = (byte)(whiteColorForOneClass + brownColorForOneClass);
        byte amountOfClasses = (byte)(amountOfPaintCans/paintCansForOneClass);
        byte totalAmountOfWhiteCans = (byte)(amountOfClasses*whiteColorForOneClass);
        byte totalAmountOfBrownCans = (byte)(amountOfClasses*brownColorForOneClass);
        System.out.println("В школе, где " + amountOfClasses + " классов, нужно " + totalAmountOfWhiteCans + " банок белой краски и " + totalAmountOfBrownCans + " банок коричневой краски");
        System.out.println("");
        //Задача 6
        byte amountOfBananas = 5;
        byte weightOfOneBananas = 80;
        short amountOfMilk = 200;
        byte weightOfThousandMilk = 105;
        float weightOfOneGramMilk = (float)(weightOfThousandMilk*1.0/100);
        byte amountOfIceCream = 2;
        byte weightOfOneIceCream = 100;
        byte amountOfEggs = 4;
        byte weightOfOneEgg = 70;
        short totalWeightOfBananas = (short)(amountOfBananas*weightOfOneBananas);
        short totalWeightOfMilk = (short)(Math.round(amountOfMilk*weightOfOneGramMilk));
        short totalWeightOfIceCream = (short)(amountOfIceCream*weightOfOneIceCream);
        short totalWeightOfEggs = (short)(amountOfEggs*weightOfOneEgg);
        short totalWeightInGrams = (short)(totalWeightOfEggs + totalWeightOfBananas + totalWeightOfMilk + totalWeightOfIceCream);
        short gramsInOneKg = 1000;
        float totalWeightInKg =(float)(totalWeightInGrams*1.0/gramsInOneKg);
        System.out.println("Общий вес такого завтрака " + totalWeightInKg + " кг.");
        System.out.println("");
        //Задача 7
        byte loosingWeightInKg = 7;
        short loosingWeightInGrams = (short)(loosingWeightInKg*gramsInOneKg);
        short firstDiet = 250;
        short secondDiet = 500;
        byte firstDietResult = (byte)(loosingWeightInGrams/firstDiet);
        byte secondDietResult = (byte)(loosingWeightInGrams/secondDiet);
        byte avgDaysForResult = (byte)((firstDietResult+secondDietResult)/2);
        System.out.println("Нужный результат при похудании на " + firstDiet + " грамм в день, будет достигнут через " + firstDietResult + " дней.");
        System.out.println("Нужный результат при похудании на " + secondDiet + " грамм в день, будет достигнут через " + secondDietResult + " дней.");
        System.out.println("В среднем резльутат будет достигнут через " + avgDaysForResult + " день.");
        System.out.println("");
        //Задача 8
        int mashaSalary = 67760;
        int denisSalary = 84690;
        int kristinaSalary = 76230;
        float salaryCoeff = 1.1f;
        float newMashaSalary = mashaSalary *salaryCoeff;
        float newDenisSalary = denisSalary*salaryCoeff;
        float newKristinaSalary = kristinaSalary *salaryCoeff;
        int oldYearMashaSalary = mashaSalary*12;
        int oldYearDenisSalary = denisSalary*12;
        int oldYearKristinaSalary = kristinaSalary*12;
        float newMashaYearSalary = newMashaSalary*12;
        float newDenisYearSalary = newDenisSalary*12;
        float newKristinaYearSalary = newKristinaSalary *12;
        float mashaYearDiffSalary = newMashaYearSalary- oldYearMashaSalary;
        float denisYearDiffSalary = newDenisYearSalary- oldYearDenisSalary;
        float kristinaYearDiffSalary = newKristinaYearSalary - oldYearKristinaSalary;
        System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " + mashaYearDiffSalary + " рубля.");
        System.out.println("Кристина теперь получает " + newKristinaSalary + " рубля. Годовой доход вырос на " + kristinaYearDiffSalary + " рублей");
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + denisYearDiffSalary + " рублей");
    }
}