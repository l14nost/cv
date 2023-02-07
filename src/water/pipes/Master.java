/**
 * @version 0.2022.0
 *
 * @author banov
 */
package water.pipes;
import java.util.ArrayList ;
import java.util.Arrays;
import java.util.Scanner;

import static water.pipes.Accident.count;

/** Клас Master - імітує поведінку сутності майстрів та їх бригад. Включає методи по роботі з досвідом майстрів
 *
 */

public class Master extends Pearson implements Nameble, Regist{
    static Scanner in = new Scanner(System.in);
    private String className;
    /**
     * Зміна experience
     * визначає досвід майстра
     */
    private int experience;
    /**
     * Зміна brigade
     * визначає номер бригади, в якій працює
     */
    private int brigade;
    /**
     * Зміна condition
     * визначає стан аварії
     */
    private String condition;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    private String job;
    public Master(String fullName, String address, String phoneNumber, int department,String job) {
        super(fullName, address, phoneNumber, department);
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.job = job;
    }
    public String toString() {
        return "ПІБ: "+ fullName+ " Адреса: " + address + " Телефон: " + phoneNumber + " №: " +department+" - " + job;
    }
//    Master petrenko = new Master("Петренко А.С.", "Торгова 21", "380630485263",
//            3);
//
//    Master ivanov = new Master("Іванов Б.Н.", "Торгова 21", "380630485263",
//            3);
//
//    Master curkan = new Master("Цуркан О.В.", "Торгова 21", "380630485263",
//            3);
//
//    Master demirov = new Master("Деміров А.Е.", "Торгова 21", "380630485263",
//            3);
//
//    Master bondarenko = new Master("Бондаренко П.К.", "Торгова 21", "380630485263",
//            3);



    /**
     * @return повертає досвід майстра
     * Метод, який повертає значення досвіду майстра
     */
    public int getExperience() {
        return experience;
    }
    /**
     *@param expirience - досвід майстра
     * Метод, який записує значення досвіду майстра
     */
    public void setExperience(int expirience) {
        this.experience = expirience;
    }
    /**
     *
     * Колекція, яка зберігає в собі ПІБ майстрів
     */
    static ArrayList<String> allFullName = new ArrayList<String>();
    /**
     *
     * Метод, який записує в колекцію ArrayList ПІБ майстрів
     */
    public void addFullName(){
        allFullName.add("Петренко А.С.");
        allFullName.add("Іванов Б.Н.");
        allFullName.add("Цуркан О.В.");
        allFullName.add("Деміров А.Е.");
        allFullName.add("Пастера В.М");
        allFullName.add("Панасюк А.С.");
        allFullName.add("Бондаренко П.К.");
        allFullName.add("Кліменко В.К.");
        allFullName.add("Постюк С.Б.");
        allFullName.add("Костенко К.К");


    }

    @Override
    public void setClassName(String name) {
        this.className = name;
    }

    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public void regist() {
        System.out.println("Досвід:");
        experience = Integer.parseInt(in.nextLine());
        System.out.println(toString()+" Досвід:"+experience);



    }
    /**
     *
     * Метод, який записує в колекцію ArrayList посаду майстрів
     */
//    static void addJobTitle(){
//        jobTitle.add("Головний бригади");
//        jobTitle.add("Робітник");
//        jobTitle.add("Робітник");
//        jobTitle.add("Робітник");
//        jobTitle.add("Робітник");
//        jobTitle.add("Головний бригади");
//        jobTitle.add("Робітник");
//        jobTitle.add("Робітник");
//        jobTitle.add("Робітник");
//        jobTitle.add("Робітник");
//    }


}
