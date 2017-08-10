package com.mutoublog.controller;

import com.mutoublog.dao.entity.MtUser;
import com.mutoublog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 *
 * Created by mutou on 2017/2/17.
 */
@Controller
public class MainController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {

        return "home/index/index";
    }
}
