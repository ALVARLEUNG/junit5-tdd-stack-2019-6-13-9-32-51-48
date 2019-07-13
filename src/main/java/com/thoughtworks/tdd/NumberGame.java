package com.thoughtworks.tdd;

public class NumberGame {
    public String numberOf(int i) {

        if (i%3==0)return "Fizz";

        if (i%5==0) return "Buzz";

        return String.valueOf(i);
    }
}
