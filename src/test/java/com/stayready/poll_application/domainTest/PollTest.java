package com.stayready.poll_application.domainTest;
import com.stayready.poll_application.domain.Option;
import com.stayready.poll_application.domain.Poll;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class PollTest {
    Poll poll;
    Option option;
    @Before
    public void before(){
        poll = new Poll();

    }
    @Test
    public void pollConstructorTest(){
        //Given
        int expected = 0;
        //When
        int actual = poll.getOptions().size();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getIdTest(){
        //Given
        long expected = 0;
        //When
        long actual = poll.getId();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
        public void getQuestionTest() {
        //Given
        String expected = null;
        //When
        String actual = poll.getQuestion();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getOptionsTest() {
        //Given
        int expected = 0;
        //When
        int actual = poll.getOptions().size();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setIdTest(){
        //Given
        long expected = 1234567891;
        //When
        poll.setId(1234567891);
        long actual = poll.getId();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setQuestionTest() {
        //Given
        String expected = "Why?";
        //When
        poll.setQuestion("Why?");
        String actual = poll.getQuestion();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setOptionsTest() {
        //Given
        Set<Option> set = new HashSet<Option>();
        set.add(new Option());
        set.add(new Option());
        int expected = 2;
        //When
        poll.setOptions(set);
        int actual = poll.getOptions().size();
        //Then
        Assert.assertEquals(expected, actual);
    }

}
