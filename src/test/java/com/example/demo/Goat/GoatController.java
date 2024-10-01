package com.example.demo.Goat;


import com.jayway.jsonpath.internal.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path= "api/v1/goat")
public class GoatController {

    private final GoatService goatService;

    @Autowired
    public GoatController(GoatService goatService) {
        this.goatService =new GoatService();
    }
    @GetMapping
    public List<Goat> getGoats() {
        return GoatService.getGoats();
    }
}
