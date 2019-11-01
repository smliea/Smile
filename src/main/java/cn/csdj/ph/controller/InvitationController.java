package cn.csdj.ph.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InvitationController {


    @RequestMapping("/show")
    public ModelAndView showPosts(ModelAndView model){
        model.setViewName("Index");
        return model;

    }


    @RequestMapping("/ss")
    public void show(){
        System.out.println("哈哈哈哈哈");
    }


}
