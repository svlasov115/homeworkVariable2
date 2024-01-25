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
    }
}