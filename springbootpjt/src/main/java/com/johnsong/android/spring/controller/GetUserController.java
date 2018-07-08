package com.johnsong.android.spring.controller;


import com.johnsong.android.spring.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "User정보 API")
@RestController
public class GetUserController {
    private static final Logger logger = LogManager.getLogger(GetUserController.class);

    @Autowired
    private UserService service;

    @ApiOperation(value = "One User 정보")
    @RequestMapping(value = "/user/info/{name}", method = RequestMethod.GET)
    public ResponseEntity<com.johnsong.android.jooq.tables.pojos.User> getUserInfo(@PathVariable("name") String name){
        logger.info("================One User 정보=====================");
        logger.info("Name:[" + name + "]");
        com.johnsong.android.jooq.tables.pojos.User userRecord = service.getUser(name);
        if(userRecord == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(userRecord, HttpStatus.OK);
    }

    @ApiOperation(value = "All User 정보")
    @RequestMapping(value = "/user/", method = RequestMethod.POST)
    public ResponseEntity<List<com.johnsong.android.jooq.tables.pojos.User>> getUserInfo(){
        logger.info("================All User 정보=====================");
        List<com.johnsong.android.jooq.tables.pojos.User> userRecord = service.getUserList();
        if(userRecord == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(userRecord, HttpStatus.OK);
    }

//    @RequestMapping(value = "/user/update/{name}", method = RequestMethod.PUT)
//    public ResponseEntity<UserRecord> updateUser(@PathVariable("name") String name, @RequestBody UserRecord user){
//        logger.debug("================User 정보 수정=====================");
//        return new ResponseEntity<>(new UserRecord(), HttpStatus.OK);
//    }

}
