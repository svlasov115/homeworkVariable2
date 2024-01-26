public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        int a = 2147483647;
        System.out.println("Значение переменной a c типом int равно " + a + ".");

        byte b = -128;
        System.out.println("Значение переменной b c типом byte равно " + b + ".");

        short l = 32767;
        System.out.println("Значение переменной l c типом int равно " + l + ".");

        long d = -9223372036854775808L;
        System.out.println("Значение переменной d c типом long равно " + d + ".");

        float pi = 3.1415926f;
        System.out.println("Значение переменной pi c типом float равно " + pi + ".");

        double pi1 = 3.1415926535897932;
        System.out.println("Значение переменной pi1 c типом int равно " + pi1 + ".");

        //Задача 2
        float k = 27.12f;
        long h = 987678965549L;
        double j = 2.786;
        short i = 569;
        int q = -159;
        short m = 27897;
        byte z = 67;

        //Задача 3
        System.out.println("Задача 3");
        byte pupilsOfLyudmilaPavlovna = 23;
        byte pupilsOfAnnaSergeevna = 27;
        byte pupilsOfEkaterinaAndreevna = 30;
        short quantityOfSheetsOfPaperForThreeClasses = 480;
        int totalPupils = pupilsOfLyudmilaPavlovna + pupilsOfAnnaSergeevna + pupilsOfEkaterinaAndreevna;
        int quantityOfSheetsOfPupil = quantityOfSheetsOfPaperForThreeClasses / totalPupils;
        System.out.println("На каждого ученика рассчитано " + quantityOfSheetsOfPupil + " листов бумаги.");

        //Задача 4
        System.out.println("Задача 4");
        byte quantityOfBottles= 16;
        byte productionTimeOf16Bottles = 2;
        int machinePerformanceInTwentyMinutes = (quantityOfBottles / productionTimeOf16Bottles) * 20;
        System.out.println("За 20 минут машина произвела " + machinePerformanceInTwentyMinutes + " бутылок.");
        int machinePerformanceInThreeDays = (quantityOfBottles / productionTimeOf16Bottles) * (1440 * 3);
        System.out.println("За 3 дня машина произвела " + machinePerformanceInThreeDays + " бутылок.");
        int machinePerformanceInOneMonth = (quantityOfBottles / productionTimeOf16Bottles) * (1440 * 31);
        System.out.println("За 1 месяц машина произвела " + machinePerformanceInOneMonth + " бутылок.");

        //Задача 5
        System.out.println("Задача 5");
        byte quantityOfCansOfPaint = 120;
        byte quantityOfCansWith_WhitePaintForOneClass = 2;
        byte quantityOfCansWith_BrownPaintForOneClass = 4;
        int quantityOfCansOfPaintForOneClass = quantityOfCansWith_WhitePaintForOneClass + quantityOfCansWith_BrownPaintForOneClass;
        int totalClasses = quantityOfCansOfPaint / quantityOfCansOfPaintForOneClass;
        int quantityOfCansWith_WhitePaint = totalClasses * quantityOfCansWith_WhitePaintForOneClass;
        int quantityOfCansWith_BrownPaint = totalClasses * quantityOfCansWith_BrownPaintForOneClass;
        System.out.println( "В школе, где " + totalClasses + " классов, нужно " + quantityOfCansWith_WhitePaint + " белой краски и " + quantityOfCansWith_BrownPaint + " коричневой краски.");

        //Задача 6
        System.out.println("Задача 6");
        byte quantityOfBananas = 5;
        byte weightOfOneBanana = 80;
        int weightOfBananas = quantityOfBananas * weightOfOneBanana;

        short milkVolume = 200;
        byte weightOf100MlOfMilk = 105;
        byte volumeOf105GrOfMilk = 100;
        int weightOfMilk = (milkVolume / volumeOf105GrOfMilk) * weightOf100MlOfMilk;

        byte quantityOfIceCreamBriquette = 2;
        byte weightOfOneBriquetteOfIceCream = 100;
        int weightOfIceCreamBriquettes = quantityOfIceCreamBriquette * weightOfOneBriquetteOfIceCream;

        byte quantityOfRawEggs = 4;
        byte weightOfOneRawEgg = 70;
        int weightOfRawEggs = quantityOfRawEggs * weightOfOneRawEgg;

        int weightOfBreakfastOfGr = (weightOfBananas + weightOfMilk + weightOfIceCreamBriquettes + weightOfRawEggs);
        System.out.println("Вес завтрака спортсмена составляет " + weightOfBreakfastOfGr + " грамм.");

        int grPerKg = 1000;
        float weightOfBreakfastOfKg = weightOfBreakfastOfGr / (float)grPerKg;
        System.out.println("Вес завтрака спортсмена составляет " + weightOfBreakfastOfKg + " килограмм.");

        //Задача 7
        System.out.println("Задача 7");
        byte weightLossOfSportsmanOfKg = 7;
        int weightLossOfSportsmanOfGr =  weightLossOfSportsmanOfKg * grPerKg;

        short weightLossOfSportsmanInOneDayOfGr = 250;
        int dietDaysOfSportsman = weightLossOfSportsmanOfGr / weightLossOfSportsmanInOneDayOfGr;
        System.out.println("Если спортсмен будет сбрасывать " + weightLossOfSportsmanInOneDayOfGr +  " грамм каждый день, то его диета займёт " + dietDaysOfSportsman + " дней.");

        short weightLossOfSportsmanInOneDayOfGr2 = 500;
        int dietDaysOfSportsman2 = weightLossOfSportsmanOfGr / weightLossOfSportsmanInOneDayOfGr2;
        System.out.println("Если спортсмен будет сбрасывать " + weightLossOfSportsmanInOneDayOfGr2 +  " грамм каждый день, то его диета займёт " + dietDaysOfSportsman2 + " дней.");

        int averageOfDietDaysOfSportsman = (dietDaysOfSportsman + dietDaysOfSportsman2) / 2;
        System.out.println("Чтобы добиться результата похудения спортсмена, потребуется в среднем " + averageOfDietDaysOfSportsman + " день.");

        //Задача 8
        System.out.println("Задача 8");
        int SalaryOfMashaInMonth = 67760;
        int SalaryOfDenisInMonth = 83690;
        int SalaryOfKristinaInMonth = 76230;
        byte percentageOfSalaryIncrease = 10;

        float SalaryIncreaseOfMashaInMonth = ((percentageOfSalaryIncrease / (float) 100) *  SalaryOfMashaInMonth) + SalaryOfMashaInMonth;
        long SalaryIncreaseOfMashaInYear =  (long)(SalaryIncreaseOfMashaInMonth * 12) - (SalaryOfMashaInMonth * 12);
        System.out.println("Маша теперь получает " + (int) SalaryIncreaseOfMashaInMonth + " рублей." + " Годовой доход вырос на "  + SalaryIncreaseOfMashaInYear + " рублей.");

        float SalaryIncreaseOfDenisInMonth = ((percentageOfSalaryIncrease / (float) 100) *  SalaryOfDenisInMonth) + SalaryOfDenisInMonth;
        long SalaryIncreaseOfDenisInYear =  (long)(SalaryIncreaseOfDenisInMonth * 12) - (SalaryOfDenisInMonth * 12);
        System.out.println("Денис теперь получает " + (int) SalaryIncreaseOfDenisInMonth + " рубля." + " Годовой доход вырос на "  + SalaryIncreaseOfDenisInYear + " рублей.");

        float SalaryIncreaseOfKristinaInMonth = ((percentageOfSalaryIncrease / (float) 100) *  SalaryOfKristinaInMonth) + SalaryOfKristinaInMonth;
        long SalaryIncreaseOfKristinaInYear =  (long)(SalaryIncreaseOfKristinaInMonth * 12) - (SalaryOfKristinaInMonth * 12);
        System.out.println("Кристина теперь получает " + (int) SalaryIncreaseOfKristinaInMonth + " рубля." + " Годовой доход вырос на "  + SalaryIncreaseOfKristinaInYear + " рублей.");
    }
}