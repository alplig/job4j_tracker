package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу сервиса банка по:
 * добавлению и удалению пользователя, добавление банковского счета, поиск пользователя,
 * поиск счета, перевод средств с одного счета на другой.
 * @author Platonov
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение данных осуществляется в хеш-таблице HashMap
     * ключ - пользователь {@link User}
     * значение - список счетов {@link Account}
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход пользователя и добавляет его в хеш-таблицу
     * Если пользователь уже существует, то добавление нового пользователя не осуществляется
     * @param user пользователь {@link User}
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод удаляет пользователя из системы
     * @param passport номер паспорта пользователя
     * @return {@code true} если пользователь удален, {@code false} если пользователь не найден
     */
    public boolean deleteUser(String passport) {
        return users.remove(new User(passport, "")) != null;
    }

    /**
     * Метод добавляет новый счет к пользователю
     * @param passport номер паспорта {@link User}
     * @param account счет {@link Account}
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод пользователя по номеру паспорта
     * @param passport номер паспорта {@link User}
     * @return пользователя {@link User}, если не найден, то {@code null}
     */
    public User findByPassport(String passport) {
        return users.keySet().stream()
                .filter(x -> x.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод ищет счет пользователя по реквизитам
     * @param passport номер паспорта
     * @param requisite реквизит
     * @return счет пользователя {@link Account}, {@code null} если не найден
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user == null) {
            return null;
        }
        return users.get(user)
                .stream()
                .filter(x -> x.getRequisite().equals(requisite))
                .findFirst().orElse(null);
    }

    /**
     * Метод предназначен для перечисления денег с одного счёта на другой счёт
     * @param srcPassport номер паспорта пользователя с чьего счета будут списаны средства
     * @param srcRequisite реквизиты счета с которого будут списаны средства
     * @param destPassport номер паспорта пользователя на чей счет будут переведены средства
     * @param destRequisite реквизиты счета на который будут переводиться средства
     * @param amount сумма перевода
     * @return {@code false} если счёт не найден или недостаточно средств для перевода,
     * в остальных случаях {@code true}
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account scrAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (scrAccount != null && destAccount != null && scrAccount.getBalance() >= amount) {
            scrAccount.setBalance(scrAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }

    /**
     * Метод предназначен для получения списка счетов пользователя
     * @param user пользователь
     * @return список счетов пользователя {@link List<Account>}
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
