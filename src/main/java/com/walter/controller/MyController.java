package com.walter.controller;

import com.walter.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("mycontroller")
public class MyController {
    @Autowired
    private User user;

    @RequestMapping("/test")
    public ModelAndView test() {
        ModelAndView mv = new ModelAndView();
        user.setName("walter");
        user.setId(123);
        mv.addObject("msg", user.toString());
        mv.setViewName("result");
        return mv;
    }
}
