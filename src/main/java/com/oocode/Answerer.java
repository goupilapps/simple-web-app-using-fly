package com.oocode;

public class Answerer {
    public String answerFor(String question) {
        switch (question) {
            case "What is your name?":
                return "JMB";
            case "What year is it ?":
                return "2024";
            default:
                return "???";
        }

    }
}
