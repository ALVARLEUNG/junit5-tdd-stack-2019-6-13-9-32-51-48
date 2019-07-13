package com.thoughtworks.tdd;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberGameTest {



    @Test
    public void should_return_1_when_call_number_given_1 () {
        NumberGame numberGame = new NumberGame();
        Assertions.assertEquals("1", numberGame.numberOf(1));

    }

    @Test
    public void should_return_2_when_call_number_given_2 () {
        NumberGame numberGame = new NumberGame();
        Assertions.assertEquals("2", numberGame.numberOf(2));
    }

    @Test
    public void should_return_Fizz_when_call_number_given_3 () {
        NumberGame numberGame = new NumberGame();
        Assertions.assertEquals(numberGame.numberOf(3), "Fizz");
    }

    @Test
    public void should_return_Fizz_when_call_number_given_6 () {
        NumberGame numberGame = new NumberGame();
        Assertions.assertEquals(numberGame.numberOf(6), "Fizz");
    }

    @Test
    public void should_return_Buzz_when_call_number_given_5 () {
        NumberGame numberGame = new NumberGame();
        Assertions.assertEquals(numberGame.numberOf(5), "Buzz");
    }

    @Test
    public void should_return_Whizz_when_call_number_given_7 () {
        NumberGame numberGame = new NumberGame();
        Assertions.assertEquals(numberGame.numberOf(7), "Whizz");
    }

}
