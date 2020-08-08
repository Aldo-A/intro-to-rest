package com.stayready.poll_application.controller;

import com.stayready.poll_application.domain.Option;
import com.stayready.poll_application.domain.Vote;
import com.stayready.poll_application.dtos.OptionCount;
import com.stayready.poll_application.dtos.VoteResult;
import com.stayready.poll_application.repositories.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class ComputeResultController {

    private VoteRepository voteRepository;

    @Autowired
    public ComputeResultController(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    @RequestMapping(value = "/computeresult", method = RequestMethod.GET)
    public ResponseEntity<?> computeResult(@RequestParam Long pollId) {
        VoteResult voteResult = new VoteResult();
        Iterable<Vote> allVotes = voteRepository.findVotesByPoll(pollId);
        //TODO: Implement algorithm to count votes
        HashMap<Long,Integer> votes=new HashMap<Long,Integer>();
        int count=0;
        for (Vote vote :
                allVotes) {
            Option option=vote.getOption();
            if(votes.containsKey(option.getId())){
                Integer temp=votes.get(option.getId())+1;
                votes.replace(option.getId(), temp);
            }
            else
                votes.put(option.getId(), 1);
            count++;
        }
        voteResult.setTotalVotes(count);
        Collection<OptionCount> options=new ArrayList<OptionCount>();
        for (Map.Entry<Long, Integer> entry:
             votes.entrySet()) {
            OptionCount option=new OptionCount();
            option.setOptionId(entry.getKey());
            option.setCount(entry.getValue());
            options.add(option);
        }
        voteResult.setResults(options);

        return new ResponseEntity<VoteResult>(voteResult, HttpStatus.OK);
    }
}
