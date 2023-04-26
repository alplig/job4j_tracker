package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель данных пользователь.
 * Содержит поля: номер паспорта и имя пользователя
 * @author Platonov
 * @version 1.0
 */
public class User {
    /**
     * Поле хранит номер паспорта пользователя в формате {@link String}
     */
    private String passport;
    /**
     * Поле хранит имя пользователя в формате {@link String}
     */
    private String username;

    /**
     * Конструктор класса {@link User}
     * @param passport номер паспорта
     * @param username имя пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод возвращает номер паспорта пользователя
     * @return номер паспорта
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод устанавливает значение номера паспорта пользователя
     * @param passport новое значение номера паспорта
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод возвращает имя пользователя
     * @return имя пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод устанавливает значение имени пользователя
     * @param username новое имя пользователя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
