package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;


import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class LionTest {
    private final String sex;
    private final boolean expected; // создали поля тестового класса
    @Mock
    Feline feline;

    public LionTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
        // создали конструктор тестового класса
    }

    @Parameterized.Parameters
    public static Object[] hasManeValues() {
        return new Object[][]{
                {"Самка", false},
                {"Самец", true},
        };
    }

    @Test
    public void hasManeCheck() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane(); // обратились к полям тестового класса
        assertEquals(expected, actual); // сравнили ожидаемый и фактический результат
    }


}





