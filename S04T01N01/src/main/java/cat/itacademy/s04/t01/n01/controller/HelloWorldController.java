package cat.itacademy.s04.t01.n01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String sayHi(@RequestParam(defaultValue = "UNKNOWN") String name) {
        return "Hi " + name + ". You´re executing a Maven project";
    }

    @GetMapping(value = {"/HelloWorld2", "/HelloWorld2/{name}"})
    public String sayHi2(@PathVariable(required = false) String name) {
        if (name == null) {
            name = "UNKNOWN";
        }
        return "Hi " + name + ". You´re executing a Maven project";
    }
}
