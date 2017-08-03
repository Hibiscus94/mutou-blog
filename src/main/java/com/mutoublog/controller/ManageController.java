package com.mutoublog.controller;

import com.mutoublog.service.ArticleService;
import com.mutoublog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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


}
