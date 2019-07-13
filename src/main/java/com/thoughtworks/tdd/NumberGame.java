package com.thoughtworks.tdd;

public class NumberGame {
    public String numberOf(int i) {

        if (i%3==0)return "Fizz";

        return String.valueOf(i);
    }
}
