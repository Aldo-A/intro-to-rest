package com.stayready.poll_application.domainTest;

import com.stayready.poll_application.domain.Option;
import com.stayready.poll_application.domain.Vote;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VoteTest {
    Vote vote;
    @Before
    public void before(){
        vote = new Vote();
    }
    @Test
    public void getIdTest(){
        //Given
        long expected = 0;
        //When
        long actual = vote.getId();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getOptionTest(){
        //Given
        Option expected = null;
        //When
        Option actual = vote.getOption();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setIdTest(){
        //Given
        long expected = 1234567891;
        //When
        vote.setId(1234567891);
        long actual = vote.getId();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setOptionTest(){
        //Given
        Option expected = new Option();
        expected.setId(1234567891);
        expected.setValue("019");
        //When
        vote.setOption(expected);
        Option actual = vote.getOption();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
