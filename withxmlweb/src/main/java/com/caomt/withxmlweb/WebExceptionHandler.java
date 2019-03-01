package com.caomt.withxmlweb;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class WebExceptionHandler {

    @ExceptionHandler(TestException.class)
    public String testException(){

        Map<String, Object> model = new HashMap<String, Object>();

        model.put("test", "1235");
        model.put("aaa", 123333);
        return "redirect:s/{test}";
    }

    @ExceptionHandler(HomeException.class)
    @ResponseBody
    public String testException2(){
        return "test HomeException...............";
    }
}
