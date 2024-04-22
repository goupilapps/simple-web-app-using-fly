package com.oocode;

public class Answerer {
    public String answerFor(String question) {
        return switch (question) {
            case "What is your name?" -> "JMB";
            case "What year is it ?" -> "2024";
            default -> "Please add a valid question";
        };

    }
}
