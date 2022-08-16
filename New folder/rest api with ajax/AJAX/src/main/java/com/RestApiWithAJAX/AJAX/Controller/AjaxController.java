package com.RestApiWithAJAX.AJAX.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/firstApi")
@RestController
public class AjaxController {
    @GetMapping("/callByFunction")
    public  String Call(){
        return "Call from call()";
    }
}
