package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PassportOfficeTest {
    @Test
    public void whenTestAddMethod() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport())).isEqualTo(citizen);
    }

    @Test
    public void whenTestAddMethodCheckResponseTrue() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        boolean checkResponse = office.add(citizen);
        assertThat(checkResponse).isTrue();
    }

    @Test
    public void whenTestAddMethodCheckResponseFalse() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizen2 = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        boolean checkResponse = office.add(citizen2);
        assertThat(checkResponse).isFalse();
    }

    @Test
    public void whenTestGet() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        String getCitizen = "02022";
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(getCitizen)).isNull();
    }
}