package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @InjectMocks
    Cat cat;
    @Mock
    Feline feline;

    @Test
    public void getSoundReturnCorrect() {
        assertEquals( "Мяу", cat.getSound());
    }

    @Test
    public void getFoodReturnList() throws Exception {
       cat.getFood();
       cat.getFood();
       cat.getFood();
        Mockito.verify(feline, Mockito.times(3)).eatMeat();
    }
}
