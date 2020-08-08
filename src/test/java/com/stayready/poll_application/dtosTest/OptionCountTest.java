package com.stayready.poll_application.dtosTest;

import com.stayready.poll_application.dtos.OptionCount;
import org.junit.Assert;
import org.junit.Test;

public class OptionCountTest {

    @Test
    public void getOptionId(){
        // Given
        Long id=453134L;

        // When
        OptionCount option=new OptionCount();
        option.setOptionId(id);
        Long actual= option.getOptionId();

        // Then
        Assert.assertEquals(id,actual);
    }

    @Test
    public void setOptionIdTest(){
        // Given
        Long id=9032034L;

        // When
        OptionCount option=new OptionCount();
        option.setOptionId(id);
        Long actual= option.getOptionId();

        // Then
        Assert.assertEquals(id,actual);
    }

    @Test
    public void getCountTest(){
        // Given
        int count=432;

        // When
        OptionCount option=new OptionCount();
        option.setCount(count);
        int actual= option.getCount();

        // Then
        Assert.assertEquals(count,actual);
    }

    @Test
    public void setCountTest(){
        // Given
        int count=0;

        // When
        OptionCount option=new OptionCount();
        option.setCount(count);
        int actual= option.getCount();

        // Then
        Assert.assertEquals(count,actual);
    }
}
