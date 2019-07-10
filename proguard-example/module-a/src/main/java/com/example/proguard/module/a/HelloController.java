package com.example.proguard.module.a;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

//    @Autowired
//    private WorldService worldService;

    @GetMapping("/world")
    public String world(String name) {
        if (StringUtils.isBlank(name)) {
            return "error";
        }
//        World world = new World();
//        world.setName(name);
//        return worldService.getInfo(world);
        return null;
    }

}
