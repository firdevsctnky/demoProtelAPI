package com.test.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MainController {

    static ArrayList<Stamp> arrayList =  new ArrayList<Stamp>();

    @GetMapping("/api/stamps")
    public ArrayList<Stamp> GetStamps(){
        return arrayList ;
    }

    @GetMapping("/api/stamps/{stampid}")
    public Stamp GetStamp(@PathVariable("stampid") int stampid){
        Stamp stamp = new Stamp();
        stamp = (Stamp)arrayList.stream().filter(a -> a.id == stampid).toArray()[0];

        return stamp ;
    }

    @GetMapping("/api/createstamp")
    public boolean GetStamp( Stamp stamp){
        Stamp addStamp = new Stamp(stamp.id,stamp.owner, stamp.title);
        arrayList.add(addStamp);
        return true ;
    }
}
