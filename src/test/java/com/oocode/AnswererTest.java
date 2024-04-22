package com.oocode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AnswererTest {
    @Test
    public void canAnswerMyName() {
        var contents = new Answerer().answerFor("What is your name?");

        assertThat(contents, equalTo("JMB"));
    }
    @Test
    public void canAnswerCurrentYear() {
        var contents = new Answerer().answerFor("What year is it ?");

        assertThat(contents, equalTo("2024"));
    }

    @Test
    public void canAnswerWithDefault() {
        var contents = new Answerer().answerFor("This is a bad question");

        assertThat(contents, equalTo("Please add a valid question"));
    }
}