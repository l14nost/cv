package exeption;

public class MyClassValidationExeption extends RuntimeException{
    public String message;
    public MyClassValidationExeption(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Клієнт виконує недоступну операцію: "+message;
    }
}
