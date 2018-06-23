package com.johnsong.android.spring;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@EnableAutoConfiguration
public class PostController {
    @RequestMapping(value = "/post/new", method = RequestMethod.GET)
    public String newPost(Model model){
        model.addAttribute("post", new Post());
        return "new";
    }

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public String newPost(@ModelAttribute Post post, Model model){
        model.addAttribute("post", post);
        return "show";
    }
}
