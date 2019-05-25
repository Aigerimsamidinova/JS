package com.example.JS.service;

import com.example.JS.model.Thing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ThingServiceImpl implements ThingService {
   private  static List<Thing> things=new ArrayList<>();
   static {
       things.add(new Thing(1,"Bishkek"));
       things.add(new Thing(2,"Almaty"));
       things.add(new Thing(3,"USA"));
   }
    @Override
    public Thing getThing(int id) {
        return things.stream().filter(t-> t.getId()==id)
                .findFirst().get();
    }

    @Override
    public List<Thing> getAll() {
        return things;
    }

    @Override
    public Thing addThing(Thing thing) {
        things.add(thing);
        return thing;
    }
}
