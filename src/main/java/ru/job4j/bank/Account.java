package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель данных счет
 *  @author Platonov
 *  @version 1.0
 */
public class Account {
    /**
     * Поле хранит реквизиты счета
     */
    private String requisite;
    /**
     * Поле хранит баланс счета
     */
    private double balance;

    /**
     * Конструктор класса {@link Account}
     * @param requisite реквизит
     * @param balance баланс
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод возвращает реквизиты счета
     * @return реквизиты счета
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод устанавливает значение реквизитов
     * @param requisite
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод возвращает баланс счета
     * @return баланс счета
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод устанавливает новое значение баланса счета
     * @param balance новое значение баланса
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
