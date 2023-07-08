package com.unit;

import com.example.Animal;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class AnimalTest {
    @Test
    public void getFamilyTest() {
        Animal animal = new Animal();
        String family = animal.getFamily();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи",family);
    }

    @Test(
            expected = Exception.class
    )
    public void getFoodIsExceptionTest() throws Exception {
        Animal animal = new Animal();
        animal.getFood("Всеядное");
    }
}
