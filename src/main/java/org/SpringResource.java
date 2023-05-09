package org;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring")
public class SpringResource {
    
    @GetMapping("/hello")
    public String springHello() {
        return "Hello from spring";
    }
}
