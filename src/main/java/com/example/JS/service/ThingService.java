package com.example.JS.service;

import com.example.JS.model.Thing;

import java.util.List;

public interface ThingService {
    Thing getThing(int id);
    List<Thing> getAll();
    Thing addThing( Thing thing);
}
