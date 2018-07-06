package com.johnsong.android.spring.controller;

import com.johnsong.android.spring.Post;
import io.swagger.annotations.Api;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@EnableAutoConfiguration
public class TestPageController {
    @RequestMapping(value = "/posts/new", method = RequestMethod.GET)
    public String newPost(Model model) {
        model.addAttribute("post", new Post());
        return "new";
    }

    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public String createPost(@ModelAttribute Post post, Model model) {
        model.addAttribute("post", post);

        return "show";
    }
}
