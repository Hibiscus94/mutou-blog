package com.mutoublog.controller;

import com.mutoublog.service.ArticleService;
import com.mutoublog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * com.mutoublog.controller
 * Created by mutou on 2017/8/3.
 */
@Controller
public class ManageController {
    @Autowired
    UserService userService;
    @Autowired
    ArticleService articleService;

    /**
     * 后台首页
     * @return view
     */
    @RequestMapping(value = "/manage", method = RequestMethod.GET)
    public String index() {
        return "manage/index";
    }

    /**
     *
     */
    @RequestMapping(value = "/manage/category",method = RequestMethod.GET)
    public String category(){
        return "manage/category";
    }


}