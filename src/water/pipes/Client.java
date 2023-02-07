/**
 * @version 0.2022.0
 *
 * @author banov
 */
package water.pipes;
import java.util.Scanner;

/** Клас Client - імітує поведінку сутності клієнта. Включає методи по роботі з айди клієнта
 *
 */
public class Client extends Pearson{

    public Client(String fullName, String address, String phoneNumber, int department) {
        super(fullName, address, phoneNumber, department);
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.department = department;
    }

    /**
     *@return повертає id
     * Метод, який повертає значення ідентифікаційного коду клієнта
     */
    public int getId() {
        return id;
    }
    /**
     * @param id - id клієнта
     * Метод, який записує значення ідентифікаційного коду клієнта
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Зміна id
     * визначає ідентифікаційний код клієнта
     */
    private int id;
    /**
     *
     * Колекція, яка зберігає в собі ПІБ клієнта
     */
    static Scanner in = new Scanner(System.in);
    /**
     *
     * Метод, який записує в колекцію ArrayList ПІБ клієнта
     */
    public void addFullName(){
        System.out.println("Введіть свої ПІБ");
        fullName = in.nextLine();
    }

}
