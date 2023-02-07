/**
 * @version 0.2022.0
 *
 * @author banov
 */
package water.pipes;

/** Клас Pearson - є абстрактний клас з даними корустувачі та майстрів.
 *
 */
public abstract class Pearson {

    /**
     * Зміна department
     * визначає відділення
     */
    protected int department;
    /**
     * Зміна fullName
     * визначає ПІБ
     */
    protected String fullName;
    /**
     * Зміна phoneNumber
     * визначає номер телефону
     */
    protected String phoneNumber;
    /**
     * Зміна address
     * визначає адресу
     */
    protected String address;

    public Pearson (String fullName, String address, String phoneNumber, int department){
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.department = department;

    }

    /**
     *
     * Абстрактний метод, який записує ПІБ
     */
    protected abstract void addFullName();

}
