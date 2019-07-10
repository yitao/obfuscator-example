package com.example.proguard.module.b.service;

import com.example.proguard.module.b.bean.World;
import org.springframework.stereotype.Service;


@Service
public class WorldService {

    public String getInfo(World world) {
        return "world:info:" + world.getName();
    }

}
