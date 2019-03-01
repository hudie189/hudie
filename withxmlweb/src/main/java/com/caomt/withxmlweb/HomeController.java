package com.caomt.withxmlweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(value = "/sss",method = RequestMethod.GET)
    public String home(Map model) {
        model.put("test", "1235");
        model.put("aaa", 123333);
        return "redirect:s/{test}";
    }

    @ResponseBody
    @RequestMapping(value = "/s/{test}",method = RequestMethod.GET)
    public String home2(@PathVariable("test") String test) {
        System.out.println("======> "  + "test = " + test);
        return "hello........";
    }
}
