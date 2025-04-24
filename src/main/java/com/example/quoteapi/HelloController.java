//all files in this package for application
package com.example.quoteapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

//Spring annotation; Rest Controller tells spring this class handles
// web requests, and will return JSOn or text file, not HTML page
@RestController  //Spring annotation, tells spring
public class HelloController {

    //spring annotation, get request to /hello
    @GetMapping("/hello")
    //map/string returns JSOn style key value pair
    public Map<String, String> hello() {
        return Map.of("message", "Hello World");
    }

    //@PostMapping("/hello")


}
        //git remote add origin https://github.com/nahsirk13/quoteapi.git
