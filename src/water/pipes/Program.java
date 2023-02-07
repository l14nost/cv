/**
 * @version 0.2022.0
 *
 * @author banov
 */
package water.pipes;
import exeption.MyClassValidationExeption;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**Клас System - імітує поведінку сутності система. Включає методи по роботі з заробітком майстрів,
вартість відкодження аварії та її тип, також кількість майстрів та бригад.
 */
public class Program {
    static Scanner in = new Scanner(System.in);
    /**
     * Зміна name
     * визначає назву системи
     */

    private String name;

    /**
     *
     * Метод, який повертає значення кількості аварій в проміжку часу
     */
    Master petrenko = new Master("Петренко А.С.", "Торгова 21", "380630485263",
            3, "Головний бригади");

    Master ivanov = new Master("Іванов Б.Н.", "Торгова 21", "380630485263",
            3, "Робітник");

    Master curkan = new Master("Цуркан О.В.", "Торгова 21", "380630485263",
            3,"Робітник");

    Master demirov = new Master("Деміров А.Е.", "Торгова 21", "380630485263",
            3,"Головни бригади");

    Master bondarenko = new Master("Бондаренко І.І.", "Торгова 21", "380630485263",
            3,"Робітник");

    Master klimov = new Master("Клімов І.А.", "Торгова 21", "380630485263",
            3,"Робітник");
    Master ostapenko;
    ArrayList<Master> allMaster= new ArrayList<Master>(Arrays.asList(petrenko,ivanov,curkan,demirov,bondarenko,klimov,ostapenko));


    public  void countOfAccident(){

        int firstDay = 0;
        int lastDay;
        int all = 0;
        Accident.addCount();
        System.out.println("Напишіть перший місяць проміжку:");
        firstDay = in.nextInt();
        System.out.println("Напишіть останій місяць проміжку:");
        lastDay = in.nextInt();
        for (int i = firstDay-1; i < lastDay; i++) {
            all = all+ Accident.count.get(i);
        }
        System.out.println("Кількість аварій в цьому проміжку:"+all);


    }
    /**
     *
     * Метод, який повертає значення кількості майстрів
     */
    public void countOfMaster(){

        int count = 0;
        for (int i = 0; i < allMaster.toArray().length ; i++) {
            count++;
        }
        System.out.println("Кількість майстрів:"+count);
    }
    /**
     *
     * Метод, який повертає значення заробітку майстра в проміжку часу
     */
    public void earningsOfMaster(){
        int firstMonth = 0;
        int lastMonth = 0;
        int num = 0;
        int numM;
        for(int i = 0; i< allMaster.toArray().length; i++){
            System.out.println(num+" "+allMaster.get(i));
            num++;
        }
        System.out.println("Введіть номер майстра:");
        numM = Integer.parseInt(in.nextLine());


        try {
            if (numM<0 || numM>allMaster.toArray().length){
                throw new ArrayIndexOutOfBoundsException();
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            MyClassValidationExeption myClassValidationExeption = new MyClassValidationExeption(e.getMessage());
            System.out.println(myClassValidationExeption);
            System.out.println("ArrayIndexOutOfBoundsException:"+e.getMessage());
            System.out.println("Межі массиву: 0 - "+allMaster.toArray().length);
            System.out.println("Індекс, який ви обрали"+numM);

        }
        for (int i = 0; i< allMaster.toArray().length; i++) {
            try {
                if (numM == i && allMaster.get(i) == null) {
                    throw new NullPointerException();
                }

            } catch (NullPointerException e) {
                MyClassValidationExeption myClassValidationExeption = new MyClassValidationExeption(e.getMessage());
                System.out.println(myClassValidationExeption);
                System.out.println("NullPointerException:" + e.getMessage());
                System.out.println("Клас Master");

            }
        }
        if (numM >=0&&numM<allMaster.toArray().length-1)
        System.out.println("Напишіть перший місяць проміжку:");
        firstMonth = in.nextInt();
        System.out.println("Напишіть останій місяць проміжку:");
        lastMonth = in.nextInt();
        int term = lastMonth-firstMonth;
        for (int i = 0; i < allMaster.toArray().length ; i++) {

            if(numM == i && allMaster.get(i).getJob().equals("Головний бригади")){
                System.out.println("Заробіток "+allMaster.get(i).fullName+" з "+firstMonth+" по "+ lastMonth +" місяці = "+term*30000);
                break;
            }
            else if (numM == i && allMaster.get(i).getJob().equals("Робітник")) {
                System.out.println("Заробіток "+allMaster.get(i).fullName+" з "+firstMonth+" по "+ lastMonth +" місяці = "+term*20000);
                break;
            }

        }



    }
    /**
     *
     * Метод, який повертає значення середньої вартості аварій
     */
    public void costOfAccident(){
        float allCost = 0;
        Accident.addRemoveCost();
        for (int i = 0; i < Accident.removeCost.toArray().length; i++) {
            allCost = allCost+Accident.removeCost.get(i);
        }
        allCost = allCost/Accident.removeCost.toArray().length;
        System.out.println("Середня вартість:"+allCost);
    }
    /**
     *
     * Метод, який повертає значення типів аварій
     */
    public void typeOfAccident(){
        Accident.addType();
        for (int i = 0; i < Accident.typeOfAcc.toArray().length; i++) {
            System.out.print(i+1+".");
            System.out.println(Accident.typeOfAcc.get(i));
        }

    }
    /**
     *
     * Метод, який повертає значення кількості бригад
     */
    public void countOfBrigade(){
        int count = 0;
        int countbrigade = 0;
        for (int i = 0; i < Master.allFullName.toArray().length ; i++) {
            count++;
        }
        countbrigade = count/5;
        System.out.println("Кількість бригад:"+countbrigade);
    }


    /**
     *
     * Метод, який є точкою входу у програму
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        Accident accident1 = new Accident("Протікання трубопроводів", "вул. Ген. Петрова 61", new Condition[]{new Condition("вирішено")}, 1000);
        Accident accident2 = new Accident("Вихід з ладу елементів запірної арматури у зв'язку із закінченням терміну служби", "вул. Ген. Петрова 1", new Condition[]{new Condition("в процесі")}, 1500);
        Accident accident3 = new Accident("Порушення цілісності мережі, розгерметизація стикування чавунних труб", "вул. Торгова 2", new Condition[]{new Condition("нове")}, 1800);
        Accident accident4 = new Accident("Протікання трубопроводів", "вул. Ген. Петрова 61", new Condition[]{new Condition("нове")}, 1000);
        ArrayList<Accident> allAccident= new ArrayList<Accident>(Arrays.asList(accident1,accident2,accident3,accident4));
        String choice;
        System.out.print(
                "Меню:" +
                        "\n 1. Кількість майстрів." +
                        "\n 2. Кількість аварій (в проміжку часу)" +
                        "\n 3. Середнявартість усунення аварії." +
                        "\n 4. Типи аварій." +
                        "\n 5. Заробіток майстра(в проміжку часу)(лаба 9) " +
                        "\n 6. Кількість бригад." +
                        "\n 9. 7 лаба" +
                        "\n 10. 8 лаба" +
                        "\n 11. 8 лаба"+
                        "\n 7. Вийти");

        System.out.print("\nОберіть пункт з меню:");
        Program program = new Program();
        while(true){


            choice = in.nextLine();
            switch (choice){
                case "1":

                    program.countOfMaster();
                    System.out.println("Введіть 7, щоб вийти" +
                            "\nВведіть 8, щоб повернутись");
                    choice = in.nextLine();
                    break;
                case "2":
                    program.countOfAccident();
                    System.out.println("Введіть 7, щоб вийти" +
                            "\nВведіть 8, щоб повернутись");
                    choice = in.nextLine();
                    break;
                case "3":
                    program.costOfAccident();
                    System.out.println("Введіть 7, щоб вийти" +
                            "\nВведіть 8, щоб повернутись");
                    choice = in.nextLine();
                    break;
                case "4":
                    program.typeOfAccident();
                    System.out.println("Введіть 7, щоб вийти" +
                            "\nВведіть 8, щоб повернутись");
                    choice = in.nextLine();
                    break;
                case "5":
                    program.earningsOfMaster();
                    System.out.println("Введіть 7, щоб вийти" +
                            "\nВведіть 8, щоб повернутись");
                    choice = in.nextLine();
                    break;
                //запрос на количество
                case "6":
                    program.countOfBrigade();
                    System.out.println("Введіть 7, щоб вийти" +
                            "\nВведіть 8, щоб повернутись");
                    choice = in.nextLine();
                    break;
                    //цикл
                case "8":
                    System.out.print(
                            "Меню:" +
                                    "\n 1. Кількість майстрів." +
                                    "\n 2. Кількість аварій (в проміжку часу)" +
                                    "\n 3. Середнявартість усунення аварії." +
                                    "\n 4. Типи аварій." +
                                    "\n 5. Заробіток майстра(в проміжку часу) " +
                                    "\n 6. Кількість бригад." +
                                    "\n 9. 7 лаба" +
                                    "\n 10. 8 лаба" +
                                    "\n 11. 8 лаба"+
                                    "\n 7. Вийти");
                    System.out.println("\nОберіть пункт з меню:");
                    choice = in.nextLine();
                    break;
                case "9":
                    for (int i=0;i< allAccident.size();i++) {
                        System.out.println(allAccident.get(i));
                    }


                    for (int i = 0; i< allAccident.size();i++){
                        for (int j = 0;j< allAccident.size();j++) {
                            if (i<j) {
                                    System.out.println("Наявність аварій з однаковим типом:" + allAccident.get(i).equals(allAccident.get(j)));
                                    System.out.println("#" + (i+1) + " Хешкод 1:" + allAccident.get(i).hashCode());
                                    System.out.println("#" + (j+1) + " Хешкод 2:" + allAccident.get(j).hashCode());
                            }
                        }
                    }
                    System.out.println("Введіть 7, щоб вийти" +
                            "\nВведіть 8, щоб повернутись");
                    choice = in.nextLine();
                    break;
                case "10":
                    System.out.println(accident3);
                    System.out.println("Проводеться клонування");
                    Accident clone = accident3.clone();
                    allAccident.add(clone);
                    System.out.println("Клон зроблено:");
                    System.out.println(clone);
                    System.out.println("Введіть 7, щоб вийти" +
                            "\nВведіть 8, щоб повернутись");
                    choice = in.nextLine();

                    break;
                case "11":
                    System.out.println(accident1);
                    System.out.println("Проводеться клонування");
                    Accident clone2 = new Accident(accident1);
                    allAccident.add(clone2);
                    System.out.println("Клон зроблено!");
                    System.out.println(clone2);
                    System.out.println("Введіть 7, щоб вийти" +
                            "\nВведіть 8, щоб повернутись");
                    choice = in.nextLine();

                    break;
                case "12":
                    accident1.regist();
                    program.petrenko.regist();
                    System.out.println("Введіть 7, щоб вийти" +
                            "\nВведіть 8, щоб повернутись");
                    choice = in.nextLine();
                    break;
            }
        }
    }
    }




