package ru.netology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class freelanceServiceTest {
    @Test
    public void freeLance() {

        freelanceService service = new freelanceService();

        int income = 11000;
        int expenses = 4000;
        int threshold = 21000;

        int restMonth = service.calculate(income, expenses, threshold);

        System.out.println(restMonth);

    }


}