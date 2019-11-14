package example.controller;

import example.dao.MembersDao;
import example.pojo.Members;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class DemoController {
    @Autowired
    MembersDao membersDao;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping(value={"/","/welcome**"},method= RequestMethod.GET)
    public ModelAndView welcomePage() {
        ModelAndView model = new ModelAndView();
        model.addObject("title","Spring Security Hello World");
        model.addObject("message","This is welcome page!");
        model.setViewName("hello");
        return model;
    }

    @RequestMapping(value = "/admin**",method = RequestMethod.GET)
    public ModelAndView adminPage(){
        ModelAndView model = new ModelAndView();
        model.addObject("title","Spring Security Hello World");
        model.addObject("message","This is protected page!");
        model.setViewName("admin");
        return model;
    }

    @RequestMapping(value = "/newUser")
    public ModelAndView newUser(){
        ModelAndView m = new ModelAndView();
        m.setViewName("register");
        return m;
    }
    @RequestMapping(value = "/updateUser",produces = "application/json;charset=utf-8")
    public ModelAndView updateUser(@RequestParam String userName){
        Members members = membersDao.getUser(userName);
        ModelAndView m = new ModelAndView();
        m.addObject("members",members);
        m.setViewName("update");
        return m;
    }

}