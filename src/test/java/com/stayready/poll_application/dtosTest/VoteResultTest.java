package com.stayready.poll_application.dtosTest;

import com.stayready.poll_application.dtos.OptionCount;
import com.stayready.poll_application.dtos.VoteResult;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class VoteResultTest {

    @Test
    public void setCountTest(){
        // Given
        int count=4243432;

        // When
        VoteResult results=new VoteResult();
        results.setTotalVotes(count);
        int actual= results.getTotalVotes();

        // Then
        Assert.assertEquals(count,actual);
    }

    @Test
    public void getCountTest(){
        // Given
        int count=23;

        // When
        VoteResult results=new VoteResult();
        results.setTotalVotes(count);
        int actual= results.getTotalVotes();

        // Then
        Assert.assertEquals(count,actual);
    }

    @Test
    public void setOptionCountTest(){
        // Given
        Collection<OptionCount> options=new ArrayList<OptionCount>();
        options.add(new OptionCount());
        options.add(new OptionCount());
        options.add(new OptionCount());
        options.add(new OptionCount());

        // When
        VoteResult results=new VoteResult();
        results.setResults(options);

        // Then
        Assert.assertEquals(options,results.getResults());
    }

    @Test
    public void getOptionCountTest(){
        // Given
        Collection<OptionCount> options=new ArrayList<OptionCount>();
        options.add(new OptionCount());

        // When
        VoteResult results=new VoteResult();
        results.setResults(options);

        // Then
        Assert.assertEquals(options,results.getResults());
    }
}
