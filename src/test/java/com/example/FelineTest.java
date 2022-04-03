package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.List;

import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class FelineTest {
    private final int kittensCount;
    private final int expectedKittensCount; // создали поля тестового класса

    public FelineTest(int kittensCount, int expectedKittensCount) {
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

    @Test
    public void foodCheck() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals(feline.eatMeat(), List.of("Животные", "Птицы", "Рыба"));
    }

    @Test
    public void getKittensReturn() {
        int expected=1;
        Feline feline = new Feline();
        int actual = feline.getKittens(); // обратились к полям тестового класса
        assertEquals(expected, actual);
    }
}


