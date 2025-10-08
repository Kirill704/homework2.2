//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte b1 = 1;
        short s1 = 200;
        int i1 = 50000;
        long l1 = 3000000000L;
        float f1 = 0.2f;
        double d1 = 0.123456789;
        System.out.println("Значение переменной b1 с типом byte равно " + b1);
        System.out.println("Значение переменной s1 с типом short равно " + s1);
        System.out.println("Значение переменной i1 с типом int равно " + i1);
        System.out.println("Значение переменной l1 с типом long равно " + l1);
        System.out.println("Значение переменной f1 с типом float равно " + f1);
        System.out.println("Значение переменной d1 с типом double равно " + d1);

        float f = 27.15f;
        long l = 987678965549L;
        float f2 = 2.786f;
        short s = 569;
        short s2 = -159;
        short s3 = 27897;
        byte b = 67;

        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short sheetTotal = 480;
        int sheetStudent = sheetTotal / (lp + as + ea);
        System.out.println("На каждого ученика рассчитано " + sheetStudent + " листов бумаги");

        byte bottles = 16;
        byte minutes = 2;
        int botPerMin = bottles / minutes;
        int bot20Min = botPerMin * 20;
        int botDay = botPerMin * 60 * 24;
        int bot3Days = botDay * 3;
        int botMoth = botDay * 30;
        System.out.println("За 20 минут машина произвела " + bot20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + botDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bot3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + botMoth + " штук бутылок");

        byte jarTotal = 120;
        byte whiteRoom = 2;
        byte brownRoom = 4;
        int roomNum = jarTotal / (whiteRoom + brownRoom);
        int whiteJar = roomNum * whiteRoom;
        int brownJar = roomNum * brownRoom;
        System.out.println("В школе, где " + roomNum + " классов, нужно " + whiteJar + " банок белой краски и " + brownJar + " банок коричневой краски");

        byte banan = 5;
        byte banMass = 80;
        byte milk100Gr = 2;
        byte milkMass = 105;
        byte ice = 2;
        byte iceMass = 100;
        byte egg = 4;
        byte eggMass = 70;
        int grWeight = banan * banMass + milk100Gr * milkMass + ice * iceMass + egg * eggMass;
        float kiloWeight = grWeight / 1000f;
        System.out.println("Масса спорт-завтрака " + grWeight + " г или " + kiloWeight + " кг");

        byte massTotal = 7;
        short minDif = 250;
        short maxDif = 500;
        int days250 = massTotal * 1000 / minDif;
        int days500 = massTotal * 1000 / maxDif;
        int daysAverage = (days250 + days500) / 2;
        System.out.println("Если спортсмен теряет в день 250 г, то на похудение потребуется " + days250 + " дней");
        System.out.println("Если спортсмен теряет в день 500 г, то на похудение потребуется " + days500 + " дней");
        System.out.println("В среднем на похудение потребуется " + daysAverage + " дней");

        int nowMasha = 67760;
        int nowDen = 83690;
        int nowCris = 76230;
        float upMasha = nowMasha * 1.1f;
        float upDen = nowDen * 1.1f;
        float upCris = nowCris * 1.1f;
        float anDifMasha = (upMasha - nowMasha) * 12f;
        float anDifDen = (upDen - nowDen) * 12f;
        float anDifCris = (upCris - nowCris) * 12f;
        System.out.println("Маша теперь получает " + upMasha + " рублей. Годовой доход вырос на " + anDifMasha + " рублей");
        System.out.println("Денис теперь получает " + upDen + " рублей. Годовой доход вырос на " + anDifDen + " рублей");
        System.out.println("Кристина теперь получает " + upCris + " рублей. Годовой доход вырос на " + anDifCris + " рублей");
    }
}