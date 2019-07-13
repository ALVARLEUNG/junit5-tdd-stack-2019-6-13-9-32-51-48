package com.thoughtworks.tdd;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberGameTest {



    @Test
    public void should_return_1_when_call_number_given_1 () {
        NumberGame numberGame = new NumberGame();
        Assertions.assertSame(numberGame.numberOf(1), 1);

    }

    @Test
    public void should_return_2_when_call_number_given_2 () {
        NumberGame numberGame = new NumberGame();
        Assertions.assertSame(numberGame.numberOf(2), 2);
    }
}
