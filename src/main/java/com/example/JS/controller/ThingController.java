package com.example.JS.controller;

import com.example.JS.model.Thing;
import com.example.JS.service.ThingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class ThingController {
    @Autowired
    ThingService thingService;

    @GetMapping("/{id}")
    public Thing getThingById(@PathVariable int id) {
        return thingService.getThing(id);
    }

    @PostMapping
    public Thing getThingById(@RequestBody Thing t) {
        return thingService.addThing(t);
    }

    @GetMapping("/all")
    public List<Thing> getAll() {
        return thingService.getAll();
    }


}
