package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParamTest {
    private final int kittensCount;
    private final int expectedKittensCount; // создали поля тестового класса

    public FelineParamTest(int kittensCount, int expectedKittensCount) {
        this.kittensCount = kittensCount;
        this.expectedKittensCount = expectedKittensCount;
        // создали конструктор тестового класса
    }

    @Parameterized.Parameters
    public static Object[] getKittens() {
        return new Object[][]{
                {1, 1},
                {2, 2},
        };
    }

    @Test
    public void kittensCountReturn() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount); // обратились к полям тестового класса
        assertEquals(expectedKittensCount, actual); // сравнили ожидаемый и фактический результат
    }
}



