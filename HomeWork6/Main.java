package org.example;


//import mfti16.House;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import mfti16.*;





//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //1.5.1 Пистолет
    public static void test1(){
        Handgun handgun = new Handgun(3);
        handgun.getGunCartridge();
        // Handgun handgun1 = new Handgun(-3);

        for (int i = 0; i<5; i++){
            handgun.toShoot();
        }
    }


    //1.5.2. Кот мяукает
    public static void test2(){
        Cat cat = new Cat("Барсик");
        cat.toString();
        cat.toMeow();
        cat.toMeow(3);
        cat.toMeow(1);
    }


    //1.5.3 Длина линии
    public static void test3(){
        PointCoordinate p1 = new PointCoordinate(1,1);
        PointCoordinate p2 = new PointCoordinate(10,15);

        Line line = new Line(p1, p2);
        line.dlinaLine();
    }

    //1.5.4 Отец моего отца
    public static void test4(){
        Name name = new Name("Данил", "Владимирович");
        Name name1 = new Name("Владимир", "Панкин","Олегович");

        Human human = new Human(name);
        Human human1 = new Human(name1);

        human.setFather(human1);
        System.out.println(human.toString3());
    }


    //1.5.5 дроби
    public static void test5(){


        Fraction fr1 = new Fraction(3, 4);
        Fraction fr2 = new Fraction(5, 7);

        System.out.println(fr1.toString());


        System.out.println(fr2.toString());

        fr1.plus(fr2);

        Fraction fr3 = new Fraction(fr1.plus(fr2).getNumerator(), fr1.plus(fr2).getDenumerator());
        System.out.println(fr3.toString());

        Fraction fr4 = new Fraction(fr1.minus(fr2).getNumerator(), fr1.minus(fr2).getDenumerator());
        System.out.println(fr4.toString());

        Fraction fr5 = new Fraction(fr1.multiply(fr2).getNumerator(), fr1.multiply(fr2).getDenumerator());
        System.out.println(fr5.toString());

        Fraction fr6 = fr1.div(5);
        System.out.println(fr6.toString());

    }


    //1.5.6 студент отличник
    public static void test6(){
        Integer [] marks = new Integer [4];
        marks[0] = 3;
        marks[1] = 4;
        marks[2] = 5;
        marks[3] = 4;
        ExcelentStudent excelentStudent = new ExcelentStudent("Вася", marks);
        excelentStudent.avgMark();
        System.out.println(excelentStudent.avgMark());
        System.out.println(excelentStudent.isClever());

        Integer [] marks2 = new Integer [4];
        marks[0] = 5;
        marks[1] = 5;
        marks[2] = 5;
        marks[3] = 5;

        ExcelentStudent excelentStudent2 = new ExcelentStudent("Петя", marks);
        excelentStudent2.avgMark();
        System.out.println(excelentStudent2.avgMark());
        System.out.println(excelentStudent2.isClever());
    }

    //1.5.7 длина ломаной
    public static void test7(){
        List<PointCoordinate> list = new ArrayList<>();
        list.add(new PointCoordinate(1,5));
        list.add(new PointCoordinate(2,8));
        list.add(new PointCoordinate(5,3));

        PolyLine polyLine = new PolyLine(list);
        //System.out.println(polyLine.dlinaPolyLine());
        System.out.println("Первоначальная длина ломаной линии: " + polyLine.dlinaPolyLine2());

        List<PointCoordinate> list2 = new ArrayList<>();
        list.add(new PointCoordinate(5,15));
        list.add(new PointCoordinate(18,10));

        polyLine.addPointCoordinate(list2);
        System.out.println("Длина ломаной линии после добавления двух точек: " + polyLine.dlinaPolyLine2());
    }

    //1.5.8 Квадрат
    public static void test8(){
        Square square = new Square(5,3, 23);
        PolyLine pl = square.polyLine();
        System.out.println("Длина ломаной " + pl.dlinaPolyLine2());

        //получаем последний элемент
        pl.getPointCoordinate(3);

        PointCoordinate pointCoordinateTest = new PointCoordinate(pl.getPointCoordinate(3).getX(), pl.getPointCoordinate(3).getY());
        //проверка координат последней точки до изменения
        System.out.println("Координата последней точки: " + pl.getPointCoordinate(3).getX());
        System.out.println("Координата последней точки: " + pl.getPointCoordinate(3).getY());

        //изменение координат последней точки после изменения
        pl.getPointCoordinate(3).setX(15);
        pl.getPointCoordinate(3).setY(25);

        square.polyLine().removePointCoordinate(3);

        //проверка координат последней точки после изменения
        System.out.println("Координата последней точки после изменения: " + pl.getPointCoordinate(3).getX());
        System.out.println("Координата последней точки после изменения: " + pl.getPointCoordinate(3).getY());

        //добавление измененной Точки - это лишнее
        //PointCoordinate pointCoordinateEnd = new PointCoordinate(pl.getPointCoordinate(3).getX(), pl.getPointCoordinate(3).getY());
        //pl.addPointCoordinate(pointCoordinateEnd);

        System.out.println("Длина ломаной " + pl.dlinaPolyLine2());

        square.poli = pl;
        System.out.println(square.returnNewPolyLine());

        PolyLine newPL = square.returnNewPolyLine();
    }

    //1.6.1 Дом
    public static void test9(){

        House house = new House(3);
        System.out.println(house);

        house.setStageQuantity(0);
        System.out.println(house);

        House house2 = new House(-1);
    }

    //1.6.2 Непустые Имена
    public static void test10(){
        NonEmptyNames nonEmptyNames = new NonEmptyNames("", "Иванов", "");
        NonEmptyNames nonEmptyNames1 = new NonEmptyNames("Shurik", "Aleksandrovich");
        NonEmptyNames nonEmptyNames2 = new NonEmptyNames("Shurik");

        NonEmptyNames nonEmptyNames3 = new NonEmptyNames("Лена");
        NonEmptyNames nonEmptyNames4 = new NonEmptyNames("", "");
    }

    //1.6.3 Сторона квадрата
    public static void test11(){
        mfti16.Square square = new mfti16.Square(2,4, 7);
        square.setSide(5);
        square.getSide();
        //square.setSide(-1);
        mfti16.Square square1 = new mfti16.Square(3,4, -5);
    }

    //1.6.4 Дроби
    public static void test12(){
        mfti16.Fraction fraction = new mfti16.Fraction(2,4);

        mfti16.Fraction fraction1 = new mfti16.Fraction(2, -7);

    }


    //1.6.5 Перезарядка пистолета
    public static void test13(){
        mfti16.Handgun handgun = new mfti16.Handgun(3, 7);
        for(int i =0; i<5; i++)
        {
            handgun.toShoot();
        }
        handgun.reload(8);
        for(int i =0; i<2; i++)
        {
            handgun.toShoot();
        }

        handgun.toUnloadGun(10);
        handgun.toShoot();


    }

    //1.6.6. Отдельные линии
    public static void test14(){

        mfti16.PointCoordinate p1 = new mfti16.PointCoordinate(2,3);
        mfti16.PointCoordinate p2 = new mfti16.PointCoordinate(5,7);

        PointCoordinate p3 = new PointCoordinate(2,3);
        PointCoordinate p4 = new PointCoordinate(5,7);

        //Две любые линии не могут ссылаться на один и тот же объект
        SeparateLine separateLine = new SeparateLine(p1, p2);

        //Две любые линии могут ссылаться на один и тот же объект
        Line line = new Line(p3, p4);

        //Выведу текущие координаты Отдельных линий и просто линии
        System.out.println("Координаты начала Раздельных линий: " + separateLine.getStartCoordinate());
        System.out.println("Координаты конца Раздельных линий: " + separateLine.getEndCoordinate());

        System.out.println("Координаы начала Линии: " + line.startCoordinate);
        System.out.println("Координты конца Линии: " + line.endCoordinate);

        p1.setX(100);
        p2.setY(100);

        p3.setX(200);
        p4.setX(200);

        System.out.println("Координаты начала Раздельных линий: " + separateLine.getStartCoordinate());
        System.out.println("Координаты конца Раздельных линий: " + separateLine.getEndCoordinate());

        System.out.println("Координаы начала Линии: " + line.startCoordinate);
        System.out.println("Координты конца Линии: " + line.endCoordinate);
    }

    //1.6.7 Родители остаются.
    public static void test15(){
        mfti16.Name name1 = new mfti16.Name("Иван");
        mfti16.Human human1 = new mfti16.Human(null, name1);
        //получение отца
        human1.getFather();

        //получение имени в виде объект Имя
        human1.getName();

    }

    //1.6.8 Диапазон оценок.
    public static void test16(){
        ExcelenStudentER excelenStudentER = new ExcelenStudentER("Shurik", new Integer[]{5,5,4});
        excelenStudentER.addMark(3);
    }

    //1.6.9 Дороги
    public static void test17(){

    Cities A = new Cities("Город А");
    Cities B = new Cities("Город B");
    Cities C = new Cities("Город C");


    WaysToCities AB = new WaysToCities("Город B", 5);
    WaysToCities AC = new WaysToCities("Город C", 7);
    WaysToCities BC = new WaysToCities("Город C", 12);


    HashMap<String, WaysToCities> AABB = new HashMap<>();
    HashMap<String, WaysToCities> AACC = new HashMap<>();
    HashMap<String, WaysToCities> BBCC = new HashMap<>();

    AABB.put("Из города A в город B", AB);
    AACC.put("Из города A в город C", AC);
    BBCC.put("Из города B в город C", BC);


    A.route = AABB;
    A.route.putAll(AACC);
    B.route = BBCC;

    System.out.println(A.route.toString());
    String price1 = A.route.get("Из города A в город B").price.toString();
    //смотрим цену первоначальную из А в В
    System.out.println(price1);

    WaysToCities ABb = new WaysToCities("Город B", 12);
    AABB.put("Из города A в город B",ABb);

    String price2 = A.route.get("Из города A в город B").price.toString();
    //смотрим цену измененную из А в В
    System.out.println(price2);
    }

    //1.6.10 Начальник отдела
    public static void test18(){
        Employee employee = new Employee("Шурик", new Department("Отдел бухгалтерии"), true);
    }



    public static void main(String[] args) {

        //1.5.1 Пистолет
        //test1();

        //1.5.2. Кот мяукает
        //test2();

        //1.5.3 Длина линии
        //test3();


        //1.5.4 Отец моего отца
        //test4();

        //1.5.5 Дроби
        //test5();

        //1.5.6 студент отличник
        //test6();

        //1.5.7 Длина ломаной
        //test7();

        //1.5.8 Квадрат
        //test8();

        //1.6.1 Дом над землей
        //test9();

        //1.6.2 Непустые имена
        //test10();

        //1.6.3 Сторона квадрата
        //test11();

        //1.6.4 Дроби
        //test12();

        //1.6.5 Перезарядка пистолета
        //test13();

        //1.6.6. Отдельные линии
        //test14();

        //1.6.7 Родители остаются.

        //1.6.8 Диапазон оценок.
        //test16();

        //1.6.9 Дороги
        //test17();

        //1.6.10 Начальник отдела
        test18();





























    }
}