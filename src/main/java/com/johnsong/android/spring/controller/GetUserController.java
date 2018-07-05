package com.johnsong.android.spring.controller;

import com.johnsong.android.spring.Post;
import com.johnsong.android.spring.jooq.banana.tables.records.UserRecord;
import com.johnsong.android.spring.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Api(value = "User정보 API")
@RestController
public class GetUserController {

    @Autowired
    private UserService service;

    @ApiOperation(value = "userinfo")
    @RequestMapping(value = "/user/info", method = RequestMethod.POST)
    public UserRecord getUserInfo(@RequestParam Map<String, String> params){
        return service.getUser(params);
    }

    @RequestMapping(value = "/post/new", method = RequestMethod.GET)
    public String newPost(Model model) {
        model.addAttribute("post", new Post());
        return "new";
    }
}
