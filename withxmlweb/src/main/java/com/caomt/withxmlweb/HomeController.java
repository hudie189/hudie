package com.caomt.withxmlweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController {

    @ResponseBody
    @RequestMapping(value = "/sss",method = RequestMethod.GET)
    public String home() throws TestException {
        int i = 1;
        if(i != 2){
            throw new TestException();
        }
        return "hello........";
    }

    @ResponseBody
    @RequestMapping(value = "/s",method = RequestMethod.GET)
    public String home2() throws HomeException {
        int i = 1;
        if(i != 2){
            throw new HomeException();
        }
        return "hello........";
    }
}
