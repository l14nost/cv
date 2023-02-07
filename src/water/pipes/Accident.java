/**
 * @version 0.2022.0
 *
 * @author banov
 */
package water.pipes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 Клас Accident - імітує поведінку сутності аварії. Включає методи по роботі з станом аварії
 Зв'язан з класом Client композицією, аварія відбувається у клієнта.

 */
public class Accident implements Cloneable,Nameble,Regist {
    Random rnd = new Random(System.currentTimeMillis());
    static Scanner in = new Scanner(System.in);
    private String className;
    /**
     *Зміна condition
     * визначає стан аварії
     */
    public Condition[] condition;
    public Condition[] getCondition(){
        return condition;
    }
    /**
     *Зміна dateOfAccident
     * визначає стан аварії
     */
    private String dateOfAccident;
    /**
     *Зміна type
     * визначає тип аварії
     */
    private String type;
    /**
     *Зміна price
     * визначає вартість аварії
     */
    private int price;
    /**
     *Зміна address
     * визначає адрес, де відбулась аварія
     */
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     *Зміна id
     * визначає ідентифікаційний код  аварії
     */
    private int id;
    /**
     *
     * Колекція, яка зберігає в собі кількість аварій
     */
    public Accident (String type, String address, Condition[] condition, int price){
        this.type = type;
        this.address = address;
        this.condition = condition;
        this.price = price;

    }
    public Accident(Accident other) {
        this(other.type, other.address, other.getCondition(), other.price);
    }


    public String toString() {
        return "Тип: "+ type+ " Адреса: " + address + " Стан: " + Arrays.toString(condition) + " Ціна: " +price;
    }
    static ArrayList<Integer> count = new ArrayList<Integer>();
    /**
     *
     * Метод, який записує в колекцію ArrayList кількість аварій
     */
    static void addCount(){
        count.add(8);
        count.add(11);
        count.add(6);
        count.add(9);
        count.add(5);
        count.add(6);
        count.add(11);
        count.add(18);
        count.add(19);
        count.add(14);
        count.add(7);
        count.add(10);
    }
    /**
     *
     * Колекція, яка зберігає в собі типи аварій
     */
    static ArrayList<String> typeOfAcc = new ArrayList<String>();
    /**
     *
     * Метод, який записує в колекцію ArrayList типи аварій
     */
    static void addType(){
        typeOfAcc.add("Протікання трубопроводів");
        typeOfAcc.add("Вихід з ладу елементів запірної арматури у зв'язку із закінченням терміну служби");
        typeOfAcc.add("Порушення цілісності мережі, розгерметизація стикування чавунних труб");
    }
    /**
     *
     * Колекція, яка зберігає в собі вартість усунення кожного типу аварій
     */
    static ArrayList<Integer> removeCost = new ArrayList<Integer>();
    /**
     *
     * Метод, який записує в колекцію ArrayList вартість усунення кожного типу аварій
     */
    static void addRemoveCost(){
        removeCost.add(1000);
        removeCost.add(1500);
        removeCost.add(1800);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        Accident accident = (Accident) o;

        return type.equals(accident.type);
    }
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + (type == null ? 0 : type.hashCode());
        return result;
    }
    @Override
    public Accident clone() throws CloneNotSupportedException {
        Accident cloned = (Accident) super.clone();
        cloned.condition = condition.clone();
        return cloned;
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
        System.out.println("Дата:");
        this.dateOfAccident = in.nextLine();
        System.out.println(toString()+" Дата:"+dateOfAccident+" ID:"+(10000+ rnd.nextInt(999999999)));

    }
}
