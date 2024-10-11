import java.util.Scanner;

import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {
        // 2.5. С некоторого момента прошло 234 дня. Сколько полных недель прошло за этот период?");
        int days = 234;
        int weeks = days/7;
        System.out.println("Ответ:  " + weeks + " полных недель");

        //  С начала суток прошло n секунд. Определить:
        //а) сколько полных часов прошло с начала суток;
        //б) сколько полных минут прошло с начала очередного часа;
        //в) сколько полных секунд прошло с начала очередной минуты.

        int nseconds = 32423;
        int hours = nseconds/3600;
        int min = (nseconds % 3600)/60;
        int seconds = (nseconds % 3600) % 60;
        System.out.println("С начала дня прошло " + nseconds + " секунд, илм же " + hours + " часов, " + min + " минут и " + seconds + " секунд");

        //"Дано трехзначное число. Найти число, полученное при прочтении его цифр справа налево.;

        int number = 123;
        int number1 = number;
        int reverted = 0;
        int count = 3;
       for (int i = 0; i < count; i++){
           int digit = number1 % 10;
           reverted = reverted * 10 + digit;
           number1 = number1/10;
        }
       System.out.println("Reverted " + number + " is " + reverted);

       // Дано четырехзначное число. Найти: а) сумму его цифр; б) произведение его цифр.
        int number4 = 4321;
        int count4 = 4;
        int sum = 0, mult = 1;
        for (int i = 0; i < count4; i++){
            int digit = number4 % 10;
            sum = sum + digit;
            mult = mult * digit;
            number4 = number4 / 10;
        }
        System.out.println(sum);
        System.out.println(mult);

        // Известны две скорости: одна в километрах в час, другая — в метрах в секунду. Какая из скоростей больше?
        int vKm = 67;
        double vMS = 382;
        vMS = vMS/3.6;
        if (vMS > vKm) {
            System.out.println("Скорость в метрах в секунду больше");
        } else {
            System.out.println("Скорость в километрах в час больше");
        }

        //Даны радиус круга и сторона квадрата. У какой фигуры площадь больше?
        int radius = 28;
        int side = 28;
        double roundS =  PI * radius*radius;
        int squareS = side * side;
        if (roundS > squareS) {
            System.out.println("Площадь круга больше");
        } else {
            System.out.println("Площадь квадрата больше");
        }

        // Даны вещественные числа a, b, c (a 0). Выяснить, имеет ли уравнение ax^2 + bx + c = 0 вещественные корни
        int a = 29;
        int b = 2978;
        int c = 29;
        int discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("Не имеет вещественных корней");
        } else {
            System.out.println("Уравнение имеет вещественные корни");
            System.out.println("Вот они: ");
            double x1 = (-b - Math.sqrt(discriminant)) / 2 * a;
            double x2 = (-b + Math.sqrt(discriminant)) / 2 * a;
            System.out.println(x1);
            System.out.println(x2);
        }

        //Работа светофора для пешеходов запрограммирована следующим образом: в
        //начале каждого часа в течение трех минут горит зеленый сигнал, затем в течение двух минут — красный, в течение трех минут — опять зеленый и т. д.
        //Дано вещественное число t, означающее время в минутах, прошедшее с начала очередного часа. Определить, сигнал какого цвета горит для пешеходов в
        //этот момент.
        int tmin = 772360;
        int loops = tmin / 5; //
        int difference = tmin - (loops * 5); // 5 мин - один цикл, находим остаток
        switch (difference) {
            case 1, 2, 3:
                System.out.println("GREEN");
                break;
            case 4, 5, 0:
                System.out.println("RED");
                break;
        }
        //4.97. Даны три различных целых числа. Определить, какое из них (первое, второе
        //или третье):
        //а) самое большое;
        //б) самое маленькое;
        //в) является средним (средним назовем число, которое больше наименьшего из
        //данных чисел, но меньше наибольшего).

        int a23[] = {231, 235, 2225};

        if (a23[0]>a23[1] & a23[0]>a23[2]) {  // ПРОСТИТЕ Х)))))))
                System.out.print(a23[0]);
            } else {
               if (a23[1]>a23[0] & a23[1]>a23[2]){
                   System.out.print(a23[1]);
               } else {
                   System.out.print(a23[2]); }}
        System.out.println(" наибольшее число из трех");

        if (a23[0]<a23[1] & a23[0]<a23[2]) System.out.print(a23[0]);
        else {
            if (a23[1] < a23[0] & a23[1] < a23[2]) {
                System.out.print(a23[1]);
            } else {
                System.out.print(a23[2]);
            }
        }
        System.out.println(" наименьшее число из трех");
        if (a23[0] > a23[1] & a23[0] < a23[2] || a23[0] < a23[1] & a23[0] > a23[2]){
            System.out.print(a23[0]);
        }
        if (a23[1] > a23[0] & a23[1] < a23[2] || a23[1] < a23[0] & a23[1] > a23[2]){
            System.out.print(a23[1]);
        }
        if (a23[2] > a23[0] & a23[2] < a23[1] || a23[2] < a23[0] & a23[2] > a23[1] ){
            System.out.print(a23[2]);
        }
        System.out.println(" -- ни туда, ни сюда");



        //  4.122. Даны вещественные положительные числа a, b, c. Выяснить, существует ли треугольник со сторонами a, b, c.
        int s1 = 21;
        int s2 = 323;
        int s3 = 123;
        if (Integer.sum(s1, s2) > s3 & Integer.sum(s2, s3) > s1 & Integer.sum(s1, s3) > s2){
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Таких треугольников не бывает");
        }
        // посложнее:

        // Белочка собрала в лесу N шишек c орешками. Белочка очень привередливо выбирала шишки,
        // и брала только те, в которых ровно M орешков. Также известно, что для пропитания зимой
        // ей необходимо не менее K орешков. Определите, хватит ли на зиму орешков белочке.
        Scanner scanner = new Scanner(System.in);
        int cones = scanner.nextInt();
        int nuts = scanner.nextInt();
        int needsNuts = scanner.nextInt();
        int nutsInCones = cones*nuts;
        if (nutsInCones >= needsNuts){
            System.out.println("Этой зимой белка не умрет от голода.");
        } else {
            System.out.println("Press F to pay respect to the belka");
        }

        // Неспокойно сейчас на стапелях шестого дока межгалактического порта планеты Торна.
        // Всего через месяц закончится реконструкция малого броненесущего корвета “Эния”. И
        // снова этому боевому кораблю и его доблестной команде предстоят тяжелые бои за контроль
        // над плутониевыми рудниками Сибелиуса. Работа не прекращается ни на секунду, лазерные
        // сварочные аппараты работают круглые сутки. От непрерывной работы плавятся шарниры
        // роботов-ремонтников. Но задержаться нельзя ни на секунду.
        //И вот в этой суматохе обнаруживается, что термозащитные панели корвета вновь требуют
        // срочной обработки сульфидом тория. Известно, что на обработку одного квадратного метра
        // панели требуется 1 нанограмм сульфида. Всего необходимо обработать N прямоугольных
        // панелей размером A на B метров. Вам необходимо как можно скорее подсчитать, сколько
        // всего сульфида необходимо на обработку всех панелей “Энии”. И не забудьте, что
        // панели требуют обработки с обеих сторон.
        // 3 целых положительных числа через пробел: N (N ≤ 100), A (A ≤ 100), B (B ≤ 100)
        System.out.println("Введите количество панелей");
        int nPanels = scanner.nextInt();
        while (nPanels < 100) {
            System.out.println("Не может быть меньше 100");
            nPanels = scanner.nextInt();}

        System.out.println("Введите сторону а панели");
        int aM = scanner.nextInt();
        while (aM < 100) {
            System.out.println("Не может быть меньше 100");
            aM = scanner.nextInt();}

        System.out.println("Введите сторону б панели");
        int bM = scanner.nextInt();
        while (bM < 100) {
            System.out.println("Не может быть меньше 100");
            bM = scanner.nextInt();}
        int panelSquareMeters = aM*bM;
        int totalAreaM2 = panelSquareMeters * nPanels;
        int sulfide = totalAreaM2 * 2;
        System.out.println("Для обработки всех термозащитных панелей нужно " + sulfide + " нанограмм сульфида");



        //Из книги Джонатана Свифта мы знаем, что тот Гулливер посетил страну «Лилипутию»,
        //где живут лилипуты, окруженные вещами, животными и заводами небольшого размера.
        // Сначала лилипуты боялись Гулливера, но позже они поняли, что такое соседство приносит
        // им большую выгоду, и они стали помогать ему. Например, лилипуты делали кровать для
        // Гулливера из своих маленьких матрацев, сшитых вместе. Лилипутам были известны размеры
        // Гулливера. Довольно быстро они смогли просчитать количество матрацев, необходимых для шитья
        // большого матраца. Но у них постоянно возникали сложности с их небольшим ростом и стеля постель,
        //они иногда не могли сшить достаточно толстый матрац.

        // Входной файл INPUT.TXT содержит два целых числа, которые разделены пробелом:
        // K – коэффициент, отражающий во сколько раз Гулливер больше лилипутов,
        // и M – количество слоев матрацев (2 ≤ K, M ≤ 100).
        // выведите количество матрацев лилипутов, необходимых для построения матраца для Гулливера.
        int guliverSizeCoefficient = scanner.nextInt();
        while (guliverSizeCoefficient < 2) {
            System.out.println("Не может быть меньше 2, введите еще раз");
            guliverSizeCoefficient = scanner.nextInt();
        }
        int mattressLayers = scanner.nextInt();
        while (mattressLayers < 100) {
            System.out.println("Не может быть меньше 100, введите еще раз");
            mattressLayers = scanner.nextInt();
        }
        int mattresses = guliverSizeCoefficient * mattressLayers;
        System.out.println("Гулливеру нужно " + mattresses + " матрасов");

        // В отделе работают 3 сотрудника, которые получают заработную плату в рублях.
        // Требуется определить: на сколько зарплата самого высокооплачиваемого из них отличается от самого низкооплачиваемого.
        // записаны размеры зарплат всех сотрудников через пробел. Каждая заработная плата – это натуральное число, не превышающее 10^5.
        System.out.print("Введите зп первого сотрудника: ");
        int salary1 = scanner.nextInt();
        while (salary1 > 100000){
            System.out.println("Ту мач, еще раз, но меньше 100к");
            salary1 = scanner.nextInt();
        }
        while (salary1 < 15000){
            System.out.println("Что он ест?");
            salary1 = scanner.nextInt();
        }
        System.out.print("Введите зп второго сотрудника: ");
        int salary2 = scanner.nextInt();
        while (salary2 > 100000){
            System.out.println("Ту мач, еще раз, но меньше 100к");
            salary2 = scanner.nextInt();
        }
        while (salary2 < 15000){
            System.out.println("Что он ест?");
            salary2 = scanner.nextInt();
        }
        System.out.print("Введите зп третьего сотрудника: ");
        int salary3 = scanner.nextInt();
        while (salary3 > 100000){
            System.out.println("Ту мач, еще раз, но меньше 100к");
            salary3 = scanner.nextInt();
        }
        while (salary3 < 15000){
            System.out.println("Что он ест?");
            salary3 = scanner.nextInt();
        }
        int maxSal = Math.max(salary3, Math.max(salary1, salary2));
        System.out.println("Самая большая зп -- " + maxSal);
        int minSal = Math.min(salary3, Math.min(salary1, salary2));
        System.out.println("Самая низкая зп --" + minSal);
        int salaryDifference = maxSal - minSal;
        System.out.println("Разница зарплат составляет " + salaryDifference + " рублей");

    }
    }