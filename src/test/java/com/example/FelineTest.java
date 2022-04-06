package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {


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


