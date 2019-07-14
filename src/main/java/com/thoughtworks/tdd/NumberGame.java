package com.thoughtworks.tdd;

public class NumberGame {
    public String numberOf(int i) {

        if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) return "FizzBuzzWhizz";

        if (i % 3 == 0 && i % 5 == 0) return "FizzBuzz";

        if (i % 3 == 0 && i % 7 == 0) return "FizzWhizz";

        if (i % 5 == 0 && i % 7 == 0) return "BuzzWhizz";

        if (i % 3 == 0 || i == 13) return "Fizz";

        if (i % 5 == 0) return "Buzz";

        if (i % 7 == 0) return "Whizz";

        return String.valueOf(i);
    }

     public static void main(String[] args) {
         NumberGame numberGame = new NumberGame();
         for( int i = 0; i < 120; i++) {
             String result = numberGame.numberOf(i+1);
             System.out.println(result);
         }
    }
}
