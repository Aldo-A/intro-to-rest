package com.stayready.poll_application.domainTest;

import com.stayready.poll_application.domain.Option;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OptionTest {
    Option option;
    @Before
    public void before(){
        option = new Option();
    }
    @Test
    public void getIdTest(){
        //Given
        long expected = 0;
        //When
        long actual = option.getId();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setIdTest(){
        //Given
        long expected = 1234567891;
        //When
        option.setId(expected);
        long actual = option.getId();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getValueTest(){
        //Given
        String expected = null;
        //When
        String actual = option.getValue();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setValueTest(){
        //Given
        String expected = "Value";
        //When
        option.setValue("Value");
        String actual = option.getValue();
        //Then
        Assert.assertEquals(expected, actual);
    }

}
