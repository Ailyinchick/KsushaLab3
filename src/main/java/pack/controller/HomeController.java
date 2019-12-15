package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pack.Service.VoteService;
import pack.dao.VoteRepos;
import pack.model.Vote;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HomeController {

    @Autowired
    VoteService voteService;

    @GetMapping(value = "/")
    public String homePage() {
        return "login";
    }

    @GetMapping(value = "/resultPage")
    public String resultPageFill(@RequestParam(value = "answer") String answer, ModelMap modelMap) {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        Vote vote = new Vote();

        vote.setQuestion("Платишь налог?");
        vote.setAnswer(answer);
        vote.setDate(formatter.format(new Date()));
        voteService.test(vote);

        modelMap.addAttribute("votes", voteService.getAll());
        return "resultPage";
    }


}
