package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("активная: " + active);
        System.out.println("статус: " + status);
        System.out.println("сообщение: " + message);
    }

    public static void main(String[] args) {
        Error errorDefault = new Error();
        errorDefault.printInfo();
        Error errorActive = new Error(true, 2, "ошибка об ошибке");
        errorActive.printInfo();
        Error errorInactive = new Error(false, 10, "неактивная ошибка");
        errorInactive.printInfo();
    }
}
