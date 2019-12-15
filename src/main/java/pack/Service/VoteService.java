package pack.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pack.dao.VoteRepos;
import pack.model.Vote;

import java.util.List;

@Service
public class VoteService {

    @Autowired
    VoteRepos voteRepos;

    @Transactional
    public void test(Vote vote) {
        voteRepos.testingCreateMethod(vote, voteRepos.getBeanToBeAutowired());
    }

    public List<Vote> getAll() {
        return voteRepos.findAll(Vote.class, voteRepos.getBeanToBeAutowired());
    }
}
