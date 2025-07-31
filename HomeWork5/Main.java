

import java.awt.*;
import java.time.LocalTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    static int[] arr = new int[50];
    static int count;
    static void push(int x, int [] arr, int count){
        arr[count++] = x;
    }

    static int pop(){
        return arr[--count];
    }





    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

       /* push(5, arr, 2);
        push(8, arr, 2);
        push(9, arr, 2);

        A a = new A();
        B b = new B();
        a.b = b;
        b.a = a;
        System.out.println(a);
        System.out.println(b);

        Account account = new Account();
        account.balance = 100;
        System.out.println(account);

        PointCoordinate p1 = new PointCoordinate();
        p1.x = 5;
        p1.y = 7;
        System.out.println(p1);

        Human h1 = new Human();
        h1.name = "Клеопатра";
        h1.height = 170;
        System.out.println(h1);

        Names n1 = new Names();
        n1.name = "Клеопатра";
        System.out.println(n1);*/

        /*Time t1 = new Time(LocalTime.parse("11:01:50"));
        System.out.println(t1.toString());
        Time t2 = new Time(12000);
        System.out.println(t2.toString());

        House hou = new House(23);
        System.out.println(hou.toString());

        int z = 42;
        B b = new B();
        b.x = z;
        z = 77;
        System.out.println(b);

        B b2 = new B();
        b2.x = 42;
        A a = new A();
        a.b = b2;
        System.out.println(a);
        b2.x = 77;
        System.out.println(a);
                String [][] arr4 = new String[4][2];
        String [][] arr5 = new String[2][];
        arr5[0] = new String[12];
        arr5[1] = new String[11];
        arr5[2] = new String[10];
        arr4[0][1] = "Test";
        arr4[1][0] = "Test2";*/

        //PointCoordinate pk = new PointCoordinate();


        //1.2.1
        Line line1 = new Line(new PointCoordinate(1,3), new PointCoordinate(23,8));
        Line line2 = new Line(new PointCoordinate(5,10), new PointCoordinate(25,10));
        Line line3 = new Line(line1.startCoordinate, line2.endCoordinate);
        /*line1.startCoordinate.x = 4;
        line1.startCoordinate.y = 4;
        line2.endCoordinate.x = 5;
        line2.endCoordinate.y = 5;*/

        line1.endCoordinate.x = 77;
        line1.endCoordinate.y = 77;

        //1.2.2
        Names nameKleo = new Names();
        nameKleo.personalName = "Клеопатра";
        Human human122_1 = new Human();
        human122_1.name = nameKleo;
        human122_1.height = 152;

        Names namePush = new Names();
        namePush.personalName = "Пушкин Александр Сергеевич";
        Human human122_2 = new Human();
        human122_2.name = nameKleo;
        human122_2.height = 167;

        Names nameMayak = new Names();
        nameMayak.personalName = "Маяковский Владимир";
        Human human122_3 = new Human();
        human122_3.name = nameMayak;
        human122_3.height = 189;

        //1.2.3
        Names nameIvan = new Names();
        nameIvan.personalName = "Иван";
        nameIvan.surname = "Чудов";
        Human human123_1 = new Human();
        human123_1.name = nameIvan;

        Names namePetr = new Names();
        namePetr.personalName = "Петр";
        namePetr.surname = "Чудов";
        Human human123_2 = new Human();
        human123_2.name = namePetr;


        Names nameBoris = new Names();
        nameBoris.personalName = "Борис";
        Human human123_3 = new Human();
        human123_3.name = nameBoris;


        human123_2.father = human123_1;
        human123_3.father = human123_2;
        human123_1.toString2();
        human123_2.toString2();
        human123_3.toString2();

        //1.2.4
        Employee employee124_1 = new Employee();
        employee124_1.name = "Petrov";
        Department aiti = new Department();
        aiti.nazvanieOtdela = "IT";
        employee124_1.otdel = aiti;

        Employee employee124_2 = new Employee();
        employee124_2.name = "Kozlov";
        employee124_2.otdel = aiti;
        aiti.boss = employee124_2;

        Employee employee124_3 = new Employee();
        employee124_3.name = "Сидоров";
        employee124_3.otdel = aiti;

        employee124_1.toString();
        employee124_2.toString();
        employee124_3.toString();

        //1.3.1
        Student student131_1 = new Student();
        student131_1.name = "Вася";
        student131_1.marks = new Integer[3];
        Integer[] ocenki = new Integer[] {3, 4, 5};
        student131_1.marks[0] = ocenki[0];
        student131_1.marks[1] = ocenki[1];;
        student131_1.marks[2] = ocenki[2];;


        Student student131_2 = new Student();
        student131_2.name = "Петя";
        student131_2.marks = new Integer[3];
        for(int i = 0; i < ocenki.length; i++){
            student131_2.marks[i] = ocenki[i];
        }

        student131_2.marks[0] = 5;

        student131_1.toString();
        student131_2.toString();

        //1.3.2
        BreakedLine br1 = new BreakedLine();
        PointCoordinate p132_1 = new PointCoordinate(1,5);
        PointCoordinate p132_2 = new PointCoordinate(2,8);
        PointCoordinate p132_3 = new PointCoordinate(5,3);

        PointCoordinate [] mas = new PointCoordinate[3];
        mas[0] = p132_1;
        mas[1] = p132_2;
        mas[2] = p132_3;
        br1.mas = mas;
        System.out.println(br1.toString());

        BreakedLine br2 = new BreakedLine();
        PointCoordinate p132_1first = new PointCoordinate(p132_1.x, p132_1.y);
        PointCoordinate p132_1last = new PointCoordinate(p132_3.x, p132_3.y);
        PointCoordinate p132_1second = new PointCoordinate(2, -5);
        PointCoordinate p132_1third = new PointCoordinate(4, -8);

        PointCoordinate [] mas2 = new PointCoordinate[4];
        mas2[0] = p132_1first;
        mas2[1] = p132_1second;
        mas2[2] = p132_1third;
        mas2[3] = p132_1last;
        br2.mas = mas2;
        System.out.println(br2.toString());

        // сдвигаю координты
        p132_1.x = 6;
        p132_1.y = 6;
        mas[0] = p132_1;
        p132_1first.x = p132_1.x;
        p132_1first.y = p132_1.y;
        mas2[0] = p132_1first;
        br2.mas = mas2;
        System.out.println(br2.toString());

        //1.3.3



        Cities A = new Cities();
        A.name = "Город А";
        Cities B = new Cities();
        B.name = "Город B";

        Cities D = new Cities();
        D.name = "Город D";

        WaysToCities AB = new WaysToCities();
        AB.price = 5;
        AB.nazvaniePunktaKonechnogo = B;

        WaysToCities AD = new WaysToCities();
        AD.price = 6;
        AD.nazvaniePunktaKonechnogo = D;




        A.ways = new WaysToCities[2];
        A.ways[0] = AB;
        A.ways[1] =AD;


        /*
        City cityA = new City();
        cityA.name = "A";

        // Создаем город B
        City cityB = new City();
        cityB.name = "B";

        // Создаем связь from A to B с стоимостью 5
        WayToCity wayToB = new WayToCity();
        wayToB.destination = cityB;
        wayToB.cost = 5;

        // Назначаем массив связей для города А
        cityA.ways = new WayToCity[] { wayToB };

        // Выводим информацию о городе А
        System.out.println(cityA.toString());
        *
        */


        System.out.println(A.toString2());

        //1.3.4
        //Название отдела
        DepartmentModified134 depmd1 = new DepartmentModified134();
        depmd1.nazvanieOtdela = "Юридический";


        EmployeeModified134 emplmd1 = new EmployeeModified134();
        emplmd1.name = "Иван";
        emplmd1.otdel = depmd1;

        // создаем список сотрудников отдела Юридический
        EmployeeModified134 [] test = new EmployeeModified134[2];
        depmd1.mas = test;

        //добавляем в список созданного сотрудника
        depmd1.mas[0] = emplmd1;


        EmployeeModified134 emplmd2 = new EmployeeModified134();
        emplmd2.name = "Степан";
        emplmd2.otdel = depmd1;

        //указываем руководителя
        depmd1.boss = emplmd2;

        //добавляем в список созданного сотрудника
        depmd1.mas[1] = emplmd2;

        EmployeeModified134 emplmd3 = new EmployeeModified134();
        emplmd3.name = "Феофан";
        emplmd3.otdel = depmd1;

        EmployeeModified134 [] primer = emplmd3.otdel.mas;

        //обращаемся к сотруднику empld1 c именем Иван и видим его коллег, путем вызова toString2
        emplmd1.otdel.toString2();

        //1.4.1
        PointCoordinate141 pc1411 = new PointCoordinate141(3,5);
        PointCoordinate141 pc1412= new PointCoordinate141(25,6);
        PointCoordinate141 pc1413 = new PointCoordinate141(7,8);


        //1.4.2.
        PointCoordinate141 pc142Start = new PointCoordinate141(1,3);
        PointCoordinate141 pc142End= new PointCoordinate141(23,8);

        PointCoordinate141 pc142l2End= new PointCoordinate141(25,10);

        Line142 l1421 = new Line142(pc142Start, pc142End);

        Line142 l1422 = new Line142(5,10,pc142l2End.x,pc142l2End.y);

        Line142 l1423 = new Line142(l1421.startCoordinate.x,l1421.startCoordinate.y, pc142l2End.x,pc142l2End.y);

        //1.4.3
        BreakedLine143 breakedLine143 = new BreakedLine143();

        PointCoordinate141 pc1431 = new PointCoordinate141(3,5);
        PointCoordinate141 pc1432 = new PointCoordinate141(25,6);
        PointCoordinate141 pc1433 = new PointCoordinate141(7,8);
        PointCoordinate141 [] massiv = new PointCoordinate141[3];
        massiv[0] = pc1431;
        massiv[1] = pc1432;
        massiv[2] = pc1433;
        System.out.println(massiv[0].toString());

        BreakedLine143 breakedLine1432 = new BreakedLine143(massiv);

        //1.4.4
        House144 h1441 = new House144(2);
        System.out.println(h1441.toString());

        House144 h1442 = new House144(35);
        House144 h1443 = new House144(91);

        //1.4.5
        Name145 kl = new Name145("Клеопатра");
        Name145 asp = new Name145("Алексадр","Пушкин", "Сергеевич");
        Name145 xb = new Name145("Христофон","Бонифатьевич");

        //1.4.6
        Human146 lev = new Human146("Лев");
        Human146 push = new Human146(lev, new Name145("Пушкин Сергей"));
        Human146 alx = new Human146(push, "Александр");

        //1.4.7
        Student147 st147Vas = new Student147("Вася", new Integer[3]);
        st147Vas.marks[0] = 3;
        st147Vas.marks[1] = 4;
        st147Vas.marks[2] = 5;
        Student147 st147Max = new Student147("Максим", null);
        System.out.println(st147Max.toString());
        System.out.println(st147Vas.toString());

        //1.4.8
        Cities148 cities148Msc = new Cities148("Москва");
        Cities148 cities148SPb = new Cities148("Санкт-Петербург", new WaysToCities[2]);


























    }

}

